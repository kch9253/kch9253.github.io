<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="Map.MapDAO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>저장하는창</title>
</head>
<body>
	<form action="./MapinsertDB.jsp" method="post">
		<label>아이디 :<input type="text" id="id" name="id" value="" > 
    <br>
    <br>
    		<label>상호명 :<input type="text" id="id2" name="id2" value="" > 
   
    <br>
    <br>
    		<label>테스트 :<input type="text" id="title" name="title" value="" > 
    <br>
    <br>
    		<label>테스트 : :<input type="text" id="number" name="number" value="" > 
    <input type="submit" value="저장하기">
	</form>
	
</body>
</html>