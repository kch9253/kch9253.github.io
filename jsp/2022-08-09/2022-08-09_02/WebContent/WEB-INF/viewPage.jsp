<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자가 볼 페이지</title>
</head>
<body>
	<p>정보</p>
	<p>연산의 결과</p>
<%-- 	<%= request.getParameter("result") %> = 첫번째 사용법 --%>
	
<%-- 	<%= application.getAttribute("result") %> = 두번째 사용법 --%>
	
	<%= request.getAttribute("result") %> 
<!-- 	위에서 request 값을 한번사용하면 소멸된다. -->
</body>
</html>