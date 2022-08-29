<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="USER.UserDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그아웃</title>
</head>
<body>
	<%
Cookie user = new Cookie("userid", "");
session.invalidate();//세션의 모든 속성 제거
response.sendRedirect("../Signup&Login/Login.jsp");
%>
</body>
</html>