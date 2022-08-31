<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="USER.UserDAO" %>
<%@ page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8"); %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비번변경 액션</title>
</head>
<body>
<%
	String userpassword = request.getParameter("userpassword");
	String newpw = request.getParameter("newpw");
	String id = (String)session.getAttribute("userid");
	
	

%>
</body>
</html>