<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아프리카</title>
</head>
<body>
	<c:if test="${ not empty list }"> <%-- empty 오른쪽에 입력한 객체의 값이 있으면 false가뜬다 따라서 not 부정문을 통해 ture 값으로 전환해줬다 사용하기위해  --%>
		<ul>
			<c:forEach var="country" items="${list}"> <%-- items 는 country 안에 있는 list 들을 하나씩 꺼내와준다 --%>
				<li> ${ country.name } ${ country.population } </li>
			</c:forEach>
		</ul>
	</c:if>
	
</body>
</html>