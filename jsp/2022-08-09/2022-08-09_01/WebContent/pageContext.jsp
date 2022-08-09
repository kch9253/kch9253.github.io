<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>context가 뭔가요?</p> 정보(객체)들이 모여있는 = context 
	<%-- context = 개발자들이 어플리케이션에 필요한 정보들을 모아둔 공간이라 생각하면됨 --%>
	<%
		ServletRequest req = pageContext.getRequest();
//   		pageContext 의  get 값을 통해 필요한 정보들을 꺼내올수있다 
		out.println(req == request);
		out.println("<br />");
		ServletResponse resp = pageContext.getResponse();
		out.println (resp == response);
	%>
</body>
</html>