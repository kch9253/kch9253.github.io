<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>jsp 표현식</p>
	${ "qwer" } 
	${ 123 }
	${ 55.432 }
	${ true }
<%-- ${} 안에 입력한값이 웹이 그대로 표출됨 (el 표현식) --%>
	<br/>
	${ 1 + 2 }
	${ true && false }
	<br/>
	${ pageContext.request.requestURI }
<!-- el 을 사용할경우 모든객체들의 get을 통해 따로 호출할필요없다 -->
	 
</body>
</html>