<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    Date now = new Date();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<title>현재시간</title>

<body>
	<h1>A</h1>
<!-- 	현재시간: -->
<%-- 	<%= now %> --%>


<% Object result = request.getAttribute("result"); %>
<p><%= result %> 
<!-- result 값을 똑같이 지정하고 출력할꺼임 -->
	
</body>
</html>