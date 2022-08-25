<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="Map.MapDAO"%>
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
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
String id = (String) request.getParameter("latclick");


// HttpSession session2 = request.getSession(true);
// request.getSession(true);
if(id == null) {
	// 로그인페이지 이동
	response.sendRedirect("./MapManager111.jsp");
return;
}


final String DRIVER = "com.mysql.cj.jdbc.Driver";
final String DBURL = "jdbc:mysql://localhost:3306/webproject";
final String DBID = "kch9253";
final String DBPW = "ckdgmlek1";

Class.forName(DRIVER);
Connection con = DriverManager.getConnection(DBURL, DBID, DBPW);
System.out.println("디비 연결성공");

String sql = "select * from mapapi as A join mapapi2 as B on A.latclick = B.latclick where A.latclick=?";


PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setString(1, id);

ResultSet rs = pstmt.executeQuery();

// String latclick = "";
String paddress = "";
String pname = "";
String number = "";
String opentime = "";
String category = "";


if(rs.next()) {
// 	latclick = rs.getString("latclick");
	paddress = rs.getString("paddress");
	pname = rs.getString("pname");
	number = rs.getString("number");
	opentime = rs.getString("opentime");
	category = rs.getString("category");
	
}


%>
<center>
<br>
<br>
<br>
<form action="./back.jsp" method="post"> 
    <br>
    <br>
    <label>상호명 :<input type="text" id="pname" name="pname" value="<%=pname%>" disabled> 
    <br>
    <br>
    <label>주소 :<input type="text" id="paddress" name="paddress" value="<%=paddress%>"disabled >  
    <br>
    <br>
<%--     <label>좌표ID값 :<input type="text" id="latclick" name="latclick" value="<%=id%>" >  --%>
<!--     <br> -->
<!--     <br> -->
<%--     <label>좌표위도 :<input type="text" id="lngclick" name="lngclick" value="<%=lngclick%>" > --%>
<!--     <br> -->
<!--     <br> -->


    <label>전화번호 :<input type="text" id="number" name="number" value="<%=number%>"disabled > 
	<br>
	<br>
	<label>영업시간 :<input type="text" id="opentime" name="opentime" value="<%=opentime%>"disabled > 
	<br>
	<br>
	<label>카테고리 :<input type="text" id="category" name="category" value="<%=category%>"disabled > 
    <input type="submit" value="돌아가기"> 
    </form> 
    
    </center>
</body>
</html>