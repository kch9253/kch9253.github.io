<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아프리카</title>
</head>
<body>
		<%
		List<String> namelist = (List<String>)request.getAttribute("names");
		List<Integer> poplist = (List<Integer>)request.getAttribute("populations");
	%>
	<ul>
	<% 
		for (int i = 0; i < namelist.size(); i++) { %>
			<li><%= namelist.get(i) %>
				인구 -
				<%= poplist.get(i) %>
			</li>
		<% }%>	
	</ul>
</body>
</html>