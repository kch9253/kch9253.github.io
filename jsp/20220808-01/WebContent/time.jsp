<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	System.out.println("사용자가 jsp 페이지를 요청");
	int a = 10;
	%>
	<p>jsp 페이지</p>
	<strong><%= java.time.LocalTime.now() %></strong>
	<p>a의 값은 <%= a %>입니다</p>
</body>
</html>