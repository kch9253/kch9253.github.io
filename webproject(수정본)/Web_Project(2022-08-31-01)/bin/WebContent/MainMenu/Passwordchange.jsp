<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 변경</title>
<script type="text/javascript">


	function checkValue() {
	var form = document.userInfo;
	
	if(!form.userpassword.value) {
		alert("현재 비밀번호를 입력하세요..");
		return false;
	}
	if(!form.newpw.value) {
		alert("변경할 비밀번호를 입력하세요.");
		return false;
	}
	if(!form.newpw2.value) {
		alert("변경할 비밀번호 확인을 입력하세요.");
		return false;
	}
	if(form.newpw.value != form.newpw2.value) {
		alert("비밀번호가 맞지않습니다.");
		return false;
	}
}
</script>




</head>
<body>
	<center>
		<br><br><br>
		<h2>비밀번호변경</h2>
		<br>
		<form name="userInfo" onsubmit="return checkValue()" method="post" action="PasswordchangePro.jsp">
		
		<h4>현재비밀번호: <input type="password" name="userpassword" maxlength="20"></h4>
		<h4>새비밀번호: <input type="password" name="newpw" maxlength="20"></h4> 
		<h4>새비밀번호확인: <input type="password" name="newpw2" maxlength="20"></h4> 
		<input type="submit" value="변경하기">
		<input type="button" value="돌아가기" onclick="location.href='../Signup&Login/MapMain.jsp'">
		</form>
	</center>



</body>
</html>