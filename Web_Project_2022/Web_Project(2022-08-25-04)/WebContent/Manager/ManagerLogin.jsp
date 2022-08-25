<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>로그인</title>
	<link rel="stylesheet" href="../css/Login.css">
	<script src="https://kit.fontawesome.com/51db22a717.js" crossorigin="anonymous"></script>
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
}
	</script>
</head>
<body>
	<form method="post" action="./ManagerLoginAction.jsp" name="userInfo" onsubmit="return checkValue()">
	<div class="main-container">
		<div class="main-wrap">
		<header>
			<div class="sel-lang-wrap">
			</div>
			<div class="logo-wrap">
			</div>
		</header>
		
		<section class="login-input-section-wrap">
			<div class="login-input-wrap">	
				<input type="text" placeholder="ID" name="userid" maxlength="20"></input>
			</div>
			<div class="login-input-wrap password-wrap">	
				<input  type="password" placeholder="Password" name="userpassword" maxlength="20" ></input>
			</div>
			<div class="login-button-wrap">
				<input type="submit" class="btn btn-primary form-control" value="로그인">
			</div>
			<br>
			<input type="button" value="돌아가기" onclick="location.href='../Signup&Login/Login.jsp'">
		</section>
<!-- 		<section class="Easy-sgin-in-wrap"> -->
<!-- 				<a href="./ServiceCheck.jsp">회원가입</a> -->
<!-- 				<br> -->
<!-- 				<a href="./findId.jsp">아이디찾기</a>  -->
<!-- 				<br> -->
<!-- 				<a href="./pw_find.jsp">비밀번호찾기</a> -->
<!-- 				<br> -->
<!-- 				<a href="../Manager/ManagerLogin.jsp">관리자페이지</a> -->
<!-- 		</section> -->
		<footer>
			</div>
		</footer>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>	
	<script src="js/bootstrap.js"></script>
	</form>
</body>
</html>