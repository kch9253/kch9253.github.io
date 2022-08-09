<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인적정보</title>
</head>
<body>
	<!-- 
		입력폼
		사용자 이름
		사용자 나이 
	 -->
	 
	 <form action="welcome.jsp">
	 	이름 <input type="text" name="name" required />
	 	나이 <input type="number" name="age" required />
	 	<input type="submit">
	 </form>
</body>
</html>