<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% request.setAttribute("asdf", "zxc"); %>
	<c:set var="jjj" value="value2" scope="request"/> <%-- scope 안에 리퀘스트나 어플리케이션 선택하여 전달방식을 전할수있다 --%>
	
	${ asdf }
	${ jjj }
	<hr/>
	<c:url var="searchGoogle" value="http://google.com/search"> <%-- 주소값을 만들어 설정해주는태그 --%>
		<c:param name="q" value="검색파라미터" />
	</c:url>
	
	<c:out value="출력할때쓰는데" />
	
	<a href="${ searchGoogle }">구글 검색</a>
</body>
</html>