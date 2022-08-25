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
Cookie user = new Cookie("latclick", ""); // 돌아가기를 누르면 latclick 라는 id 값의 세션을 종료시켜버림 
session.invalidate();//세션의 모든 속성 제거
// session.setMaxInactiveInterval(10 * 10);
// session.removeAttribute("latclick");
response.sendRedirect("./MapManager111.jsp");
%>
</body>
</html>