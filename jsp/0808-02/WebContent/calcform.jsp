<!-- 
	입력폼
	숫자1
	숫자2
	
	연산자 + - * / 선택
	전송
 -->




<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>연산해보자잉</title>
</head>
<body>
	<form action="./calcresult.jsp">
	<label><input type="number" name="number1" />숫자입력</label>
	<label><input type="number" name="number2"  />숫자입력</label>
	<label><input type="radio" name="plus" value="plus" />더하기</label>
	<label><input type="radio" name="minus" value="minus" />빼기</label>
	<label><input type="radio" name="product" value="product" />곱하기</label>
	<input type="submit">
	</form>
</body>
</html>