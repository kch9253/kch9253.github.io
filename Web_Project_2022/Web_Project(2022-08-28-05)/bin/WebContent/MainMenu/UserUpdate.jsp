<%@page import="javax.xml.ws.Response"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="USER.UserDAO"%>
<%@page import="USER.User"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page import="java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보변경 액션</title>
</head>
<body>
	<%//1.로그인여부체크 ->로그인페이지이동
String id = (String) session.getAttribute("userid");
if (id == null) {
	response.sendRedirect("../Signup&Login/Login.jsp");
}

//2. 한글처리 & 변수 : 전달된 정보를 저장(아이디,비번,이름,나이,성별,이멜)
request.setCharacterEncoding("UTF-8");
//String id = request.getParameter("id"); 세션으로 이미가져왔음
String userpassword = request.getParameter("userpassword");
String username = request.getParameter("username");
String userbirwrap = request.getParameter("userbirwrap");
String usernumber = request.getParameter("usernumber");
String usergender = request.getParameter("usergender");

//3. 드라이버로드 & DB연결
final String DRIVER = "com.mysql.cj.jdbc.Driver";
final String DBURL = "jdbc:mysql://localhost:3306/webproject";
final String DBID = "kch9253";
final String DBPW = "ckdgmlek1";

Class.forName(DRIVER);
Connection con = DriverManager.getConnection(DBURL, DBID, DBPW);
System.out.println("updatePro : 드라이브로드와 디비연결성공");

//4. SQL구문 & pstmt실행 & 실행->rs저장
// 4-1 sql구문 :  수정하고자하는 사람의 정보가 있는지 판단 후 select
String sql = "select userpassword from user where userid=?";
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setString(1, id);

//5. 데이터처리 
// 아이디,비번 동일한 경우 => 수정
// 비밀번호오류 => 에러메세지

ResultSet rs = pstmt.executeQuery();

if(rs.next()){ //아이디있는 경우
	if(userpassword.equals(rs.getString("userpassword"))){// 비밀번호 일치하는 경우
		sql = "update user set username=?,userbirwrap=?,usernumber=?,usergender=?"
				+"where userid=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, username);
		pstmt.setString(2, userbirwrap);
		pstmt.setString(3, usernumber);
		pstmt.setString(4, usergender);
		pstmt.setString(5, id);
		pstmt.executeUpdate();
		%>
<!-- // 		System.out.println("회원정보수정완료"); -->
<!-- // 		response.sendRedirect("../Signup&Login/MapMain.jsp"); -->
	 <script type="text/javascript">
	 	alert("회원정보수정완료");
	 	location.href="../Signup&Login/MapMain.jsp";
	 </script>

	<% 		
	}else{%> // 비밀번호 불일치하는 경우
		<script type="text/javascript">
			alert("비밀번호오류로 수정불가")
			history.back(); //뒤로가기.
		</script>
		
<!-- 		System.out.println("비밀번호오류로 수정불가"); -->
<%} 	
	}else{%> //아이디없는 경우
	<script type="text/javascript">
		alert("비회원입니다")
		history.back(); //뒤로가기.
	</script>
<!-- 	System.out.println("아이디오류"); -->
	<%}
%>



</body>
</html>