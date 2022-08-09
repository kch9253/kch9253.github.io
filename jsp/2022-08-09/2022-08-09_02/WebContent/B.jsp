<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    Date date = new Date();
    SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
    String strdate = simpleDate.format(date);
    %>
    
    오늘 날짜는 <%= strdate %> 입니다
    
    <% Calendar cal = Calendar.getInstance(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 	<h1>B</h1> -->
<%-- 	<p> 오늘은 <%= cal.get(Calendar.YEAR) %>년 --%>
<%-- 			 <%= cal.get(Calendar.MONTH) + 1%>월 --%>
<%-- 			 <%= cal.get(Calendar.DATE) %>일 --%>
<!-- 		입니다. -->

<% Object result = request.getAttribute("result"); %>
<p><%= result %> 
<!-- result 값을 똑같이 지정하고 출력할꺼임 -->

</body>
</html>