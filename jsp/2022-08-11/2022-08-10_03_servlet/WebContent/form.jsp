<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> <%-- html 역활 --%>
	<form action="./addperson.do"> <%-- xml 서블릿등록한 url 주소부르자 --%>
		<input type="text" name="firstname">
		<input type="text" name="listname">
		<input type="number" name="age">
		<input type="email" name="email">
		<input type="submit">
		<c:if test="${ not empty errors }">
			<div>
				<c:forEach var="message" items="${ errors }">
					<p>${ message.value }</p>				
				</c:forEach>
			</div>
		</c:if>
	</form>
</body>
</html>