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
String id = (String) session.getAttribute("id");

// if(id == null) {
// 	// 로그인페이지 이동
// 	response.sendRedirect("../Signup&Login/MapMain.jsp");
// }

final String DRIVER = "com.mysql.cj.jdbc.Driver";
final String DBURL = "jdbc:mysql://localhost:3306/webproject";
final String DBID = "kch9253";
final String DBPW = "ckdgmlek1";

Class.forName(DRIVER);
Connection con = DriverManager.getConnection(DBURL, DBID, DBPW);
System.out.println("디비 연결성공");

String sql = "select * from mapapi where id=?";
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setString(1, id);

ResultSet rs = pstmt.executeQuery();

// String latclick = "";
String id2 = "";
String title = "";
String number = "";


if(rs.next()) {
	id2 = rs.getString("id2");
	title = rs.getString("title");
	number = rs.getString("number");
}





%>
<!-- 	<form method="get" action="./MapinsertDB.jsp"> -->

<!-- 	 <input type="text" id="fulladdress" name="fulladdress" style="width:90%;" disabled>  -->
    <br>
    <br>
    <label>아이디 :<input type="text" id="id" name="id" value="<%=id%>" > 
    <br>
    <br>
    <label>아이디2 :<input type="text" id="id2" name="id2" value="<%=id2%>" >  
    <br>
    <br>
    <label>상호명 :<input type="text" id="title" name="title" value="<%=title%>" > 
    <br>
    <br>
    <label>주소 :<input type="text" id="number" name="number" value="<%=number%>" >
    <br>
    <br>
<!--     </form> -->
</body>
</html>