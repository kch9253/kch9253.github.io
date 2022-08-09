<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>application 기본객체</p>
	<p>자바 웹 어플리케이션의 설정 등을 설정하거나 접근할수있는 객체입니다.</p>	
	<%= application.getMajorVersion() %>
	
	<p><%= application.getInitParameter("myParamName") %></p>
	<p><%= application.getInitParameter("mySetting") %></p>	
	
	<%-- web.xml 안에 콘텍스트파람 안에 파람네임,벨류값을 설정해두고 위 사항처럼 application.getInitParameter 를통해
	web.xml 안에 설정해둔 지정값들을 호출하여 사용할수있다 --%>
</body>
</html>