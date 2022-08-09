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
		request.setAttribute("reqAttr", "요청 객체에 존재하는 값");
	 	request.setAttribute("reqInt", 22);
	%>
<!-- 	request 객체는 한번의 요청에 대해서만 값을 전달해주고 request 객체의값들은 소멸된다. -->
<!--    해당 파일에서 request 값을 <% %> 를 통해 설정해주고 <%= %> 를 통해 호출해서 한번 사용했기때문에 getReqAttr 의 파일에서 호출해도 null값이 뜨는거다 -->
<!-- 	application 객체는 요청을 해두면 계속 유지되지만 request 객체는 한번 요청을해서 그값을쓴다면 다음요청에서는 null 값이된다. -->
	<%=	request.getAttribute("reqAttr") %>
	<%=	request.getAttribute("reqInt") %>
</body>
</html>