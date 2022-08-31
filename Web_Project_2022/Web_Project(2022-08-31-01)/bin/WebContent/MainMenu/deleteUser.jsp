<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page import="USER.UserDAO" %>
<% request.setCharacterEncoding("UTF-8"); %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원탈퇴</title>
<script type="text/javascript">
function checkValue() {
	var form = document.userInfo;
	
	if(!form.userid.value) {
		alert("아이디를 입력하세요.");
		return false;
	}
	if(!form.userpassword.value) {
		alert("비밀번호를 입력하세요.");
		return false;
	}
	if(!form.username.value) {
		alert("이름을 입력하세요.");
		return false;
	}
}	
</script>
</head>
<body>

	
	<center>
		<br><br><br>
		<h2>회원탈퇴</h2>
		<br>
		<form name="userInfo" action="deletePro.jsp" method="post" onsubmit="return checkValue()">
		
		<h4>아이디: <input type="text" name="userid" maxlength="20"></h4>
		<h4>비밀번호: <input type="password" name="userpassword" maxlength="15"></h4> 
		<h4>이름: <input type="text" name="username" maxlength="10"></h4> 
		<input type="submit" value="회원탈퇴">
		<input type="button" value="돌아가기" onclick="location.href='../Signup&Login/MapMain.jsp'">
		</form>
	</center>

</body>
</html>