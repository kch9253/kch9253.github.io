<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="to.jsp">
		<select name="alphabet">
			<option value='a'>A</option> <%-- A페이지는 시간 --%>
			<option value='b'>B</option> <%-- B페이지는 날짜 --%>
			<option value='c'>C</option> <%-- C페이지는 랜덤정수 --%>
		</select>
		<input type="submit">
	</form>
</body>
</html>