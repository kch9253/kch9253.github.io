<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="MAP.Map"%>
<%-- <%@ page --%>
<%-- import = "java.sql.Connection" --%>
<%-- import = "java.sql.DriverManager" --%>
<%-- import = "java.sql.SQLException" --%>
<%-- import = "java.sql.Statement" --%>
<%-- import = "java.sql.PreparedStatement" --%>
<%-- %> --%>
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
<body1 class="choice">
<div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <a href="./MapUser.jsp">돌아가기</a>
</div>
<span1 style="font-size:20px;cursor:pointer"  onclick="openNav()">&#9776; menu</span1>
</body1>
  <br>
  <br>
    <span id="menu"><span class="ion-navicon-round">

<meta charset="UTF-8">
<title>뷰페이지</title>
</head>



<body>
<%
request.setCharacterEncoding("UTF-8");
String id = (String) request.getParameter("latclick");





final String DRIVER = "com.mysql.cj.jdbc.Driver";
final String DBURL = "jdbc:mysql://localhost:3306/webproject";
final String DBID = "root";
final String DBPW = "0000";

Class.forName(DRIVER);
Connection con = DriverManager.getConnection(DBURL, DBID, DBPW);
System.out.println("디비 연결성공");

// String sql = "select * from mapapi as A join mapapi2 as B on A.latclick = B.latclick where A.latclick=?";
String sql = "select * from mapapi where latclick=?";


PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setString(1, id);

ResultSet rs = pstmt.executeQuery();

// String latclick = "";
String paddress = "";
String pname = "";
String number = "";
String opentime = "";
String category = "";
String img = "";
String route = "";
String homepage = "";
String road = "";
String menu = "";



if(rs.next()) {
// 	latclick = rs.getString("latclick");
	paddress = rs.getString("paddress");
	pname = rs.getString("pname");
	number = rs.getString("number");
	opentime = rs.getString("opentime");
	category = rs.getString("category");
	img = rs.getString("img");
	route = rs.getString("route");
	homepage = rs.getString("homepage");
	road = rs.getString("road");
	menu = rs.getString("menu");

	
}


%>
<center>
<br>
<br>
<br>
    <input type="text" id="latclick" name="latclick" value="<%=id%>" style="display: none" > 
    <br>
    <br>
	<label><input type="url" id="img" style="display: none" name="img" value="<%=img%>"disabled >
	<image src="<%=img%>" height="400px" width="400px"/> 
	<br>
	<br>
    <label>상호명 :  <input type="text" id="pname" style="width: 200px" name="pname" value="<%=pname%>" disabled>  <a href="<%=route%>" target='_blank'>로드뷰</a>
    <br>
    <br>
    <label>주소 :  <input type="text" id="paddress" style="width: 200px" name="paddress"  value="<%=paddress%>"disabled > <a href="<%=road %>" target='_blank'>길찾기</a>
    <br>
    <br>
    <label>전화번호 :  <input type="text" id="number" style="width: 200px" name="number" value="<%=number%>"disabled > <a href="<%=homepage %>" target='_blank'>인스타그램</a>
	<br>
	<br>
	<label>영업시간 :  <input type="text" id="opentime" style="width: 200px" name="opentime" value="<%=opentime%>"disabled > 
	<br>
	<br>
	<label>카테고리 :  <input type="text" id="category" style="width: 200px" name="category" value="<%=category%>"disabled > 
	<br>
	<br>
	<br>
	<hr>
	<br>
	<h3> <메뉴> </h3>
	<label><input type="url" id="menu" style="display: none" name="menu" value="<%=menu%>" >
	<image src="<%=menu%>" height="400px" width="600px"  /> 
	
	
<!-- 	<form action="" method="post"> -->
<!-- 		<input type="button" value="즐겨찾기"> -->
<!-- 	</form> -->
	
	
	
	<input type="url" id="route" name="route" value="" style="display: none">
	<br>
	<br>
    </center>
    </form>
</body>
</html>