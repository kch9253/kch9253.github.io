<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="USER.UserDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>WebContent/Study/jsp2/deleteForm.jsp</h1>
<%
request.setCharacterEncoding("utf-8");

String id =(String)session.getAttribute("userid");
String nm = (String)session.getAttribute("username");

Class.forName("com.mysql.cj.jdbc.Driver");
String dbUrl = "jdbc:mysql://localhost:3306/webproject";
String dbId = "root";
String dbPass = "0000";
Connection con = DriverManager.getConnection(dbUrl,dbId,dbPass);
String sql = "select * from user where userid= ?";
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setString(1,id);
ResultSet rs = pstmt.executeQuery();

if(rs.next()){%>
<form action="deletePro.jsp" method="post">
	<h4>아이디 : <input type="text" name="id"value=<%=rs.getString("userid") %> readonly><br></h4>
	비밀번호 : <input type="password" name="pass"> <br>
	이름 : <input type="text" name="name" value=<%=rs.getString("username") %>><br>
	<input type="submit" value="회원정보수정">
</form>
<%} %>
</body>
</html>