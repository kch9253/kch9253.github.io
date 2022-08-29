<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="USER.User"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.ArrayList"%>
<%@page import="USER.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="dao" class="USER.UserDAO" />
<!DOCTYPE html>
<html>
<head>
<style>
body1  {
    font-family: "Lato", sans-serif;
}
.sidenav {
    height: 100%;
    width: 0;
    position: fixed;
    z-index: 1;
    top: 0;
    right: 0;
    background-color: #111;
    overflow-x: hidden;
    transition: 0.5s;
    padding-top: 60px;
}
.sidenav a {
    padding: 8px 8px 8px 32px;
    text-decoration: none;
    font-size: 25px;
    color: #818181;
    display: block;
    transition: 0.3s;
}
.sidenav a:hover {
    color: #f1f1f1;
}
.sidenav .closebtn {
    position: absolute;
    top: 0;
    right: 25px;
    font-size: 36px;
    margin-left: 50px;
}
@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 18px;}
}
span1  {
	position: absolute;
	right: 0;
	padding-right: 20px;
	
}
</style>
<script type="text/javascript">
function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
}
function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
}
</script>
 <!-- 상단메뉴 css,자바스크립트 설정끝 -->
    
<!--   <button onclick="relayout()">지도새로고침</button> -->
<!-- <button onclick="originalsizeMap()">지도원래크기로</button> -->

<!-- <span id="menu1"> -->
<!-- <input type="button" onclick="MenuresizeMap()" value="메뉴" class="ion-navicon-round"></button> -->
<!-- </span> -->
 <br>

<body1 class="choice">
<div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <a href="../Manager/MapManager.jsp">돌아가기</a>
</div>
<span1 style="font-size:20px;cursor:pointer"  onclick="openNav()">&#9776; menu</span1>
</body1>
  <br>
  <br>
    <span id="menu"><span class="ion-navicon-round">
   

<script type="text/javascript">
function searchCheck(frm){
    //검색
    if(frm.keyWord.value ==""){
        alert("검색 단어를 입력하세요.");
        frm.keyWord.focus();
        return;
    }
    frm.submit();      
}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
String id = (String) session.getAttribute("managerid");


if(id == null) {
	// 로그인페이지 이동
	response.sendRedirect("../Manager/ManagerLogin.jsp");
}

String userpassword = request.getParameter("userpassword");

final String DRIVER = "com.mysql.cj.jdbc.Driver";
final String DBURL = "jdbc:mysql://localhost:3306/webproject";
final String DBID = "root";
final String DBPW = "0000";

Class.forName(DRIVER);
Connection con = DriverManager.getConnection(DBURL, DBID, DBPW);
System.out.println("디비 연결성공");

String sql = "select * from manager where managerid=?";
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setString(1, id);

ResultSet rs = pstmt.executeQuery();

%>

	<center>
	
   <!--
        1. dao객체 선언한다.
        2. dao쪽의 select하는 메소드를 호출하여 그 결과를 리턴하여 테이블에 예쁘게 출력한다.
    -->
   
    <%
   
    request.setCharacterEncoding("UTF-8");
    String keyField = request.getParameter("keyField");
    String keyWord = request.getParameter("keyWord");
    ArrayList<User> list = dao.getMemberlist(keyField, keyWord);
   
    //ArrayList<MemberVO> list = dao.getMemberlist();
    %>
    <h2> <회원정보> </h2>
   
    <table>
        <tr bgcolor="#E6E6E6">
        <th>아이디</th><th>비밀번호</th><th>이름</th><th>생년월일</th><th>성별</th><th>번호</th>
        </tr>
    <%
    for(User vo : list){
    %>
       
        <tr>
            <td><%=vo.getUserid() %></td>
            <td><%=vo.getUserpassword() %></td>
            <td><%=vo.getUsername() %></td>
            <td><%=vo.getUserbirwrap() %></td>
            <td><%=vo.getUsergender() %></td>
            <td><%=vo.getUsernumber()%></td>
           
        </tr>              
    <%
    }
     %>
     
     <tr>  
        <td colspan="7"> <br/>
            <form name="serach" method ="post">
            <select name="keyField">
                <option value="0"> ----선택----</option>
                <option value="userid">아이디</option>
                <option value="username">이름</option>
                <option value="usernumber">번호</option>  
            </select>
            <input type="text" name="keyWord" />
            <input type="button" value="검색" onclick="searchCheck(form)" />
           	<input type="button" value="재검색" onclick="location.href='UserSearch.jsp'">
           	<br>
           	<br>
            </form>
           
        </td>      
    </tr>
     
     
     
    </table>  
    </center>
</body>
</html>