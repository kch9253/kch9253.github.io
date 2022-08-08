<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>jsp scriptlet를 활용한 합계 구하기</p>
	<%
	int sum = 0;
	for (int i = 0; i <= 10; i++) {
		sum += i;
	}
	%>
	<p>0 ~ 10까지의 합: <%= sum %></p>
	<p><%=  1+2+3+4+5+6+7+8+9+10 %></p>
<%-- <p>0 ~ 100까지의합 : <%= getsum(100) %></p> --%>
	<p><%= "문자열값" %> </p>
	<p><%= true %></p>
	<p><%= 123.456 %></p>	
</body>
</html>
