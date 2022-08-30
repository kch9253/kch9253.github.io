<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>매니저 로그아웃</title>
</head>
<body>
	<%
Cookie user = new Cookie("managerid", "");
session.invalidate();//세션의 모든 속성 제거
response.sendRedirect("../Manager/ManagerLogin.jsp");
%>
</body>
</html>