<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="MAP.Map"%>
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
System.out.println(id);
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

String route ="";

if(rs.next()) {
// 	latclick = rs.getString("latclick");
	route = rs.getString("route");
	System.out.println(route);
}

%>
  <input type="url" id="route" style="display: none" name="route" value="" >
	<a href="<%=route%>">길찾기</a>
</body>
</html>