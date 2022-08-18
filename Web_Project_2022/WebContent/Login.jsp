<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>로그인</title>
	<link rel="stylesheet" href="Login.css">
	<script src="https://kit.fontawesome.com/51db22a717.js" crossorigin="anonymous"></script>
</head>
<body>
	<div class="main-container">
		<div class="main-wrap">
		<header>
			<div class="sel-lang-wrap">
<!-- 				<select class="lang-select"> -->
<!-- 					<option>한국어</option> -->
<!-- 					<option>English</option> -->
<!-- 				</select> -->
			</div>
			<div class="logo-wrap">
<!-- 				<img src="img/logo.png"> -->
			</div>
		</header>
		<section class="login-input-section-wrap">
			<div class="login-input-wrap">	
				<input placeholder="Username" type="text"></input>
			</div>
			<div class="login-input-wrap password-wrap">	
				<input placeholder="Password" type="password"></input>
			</div>
			<div class="login-button-wrap">
				<button type="button" onclick="location.href='freeBoardWrite.jsp'">로그인</button>
			</div>
<!-- <!-- 			<div class="login-stay-sign-in"> --> 
<!-- <!-- 				<i class="far fa-check-circle"></i> --> 
<!-- <!-- 				<span>Stay Signed in</span> --> 
<!-- 			</div> -->
		</section>
		<section class="Easy-sgin-in-wrap">
<!-- 			<h2>Easier sign in</h2> -->
<!-- 			<ul class="sign-button-list"> -->
<!-- 				<li><button><i class="fas fa-qrcode"></i><span>Sign in with QR code</span></button></li> -->
<!-- 				<li><button><i class="fab fa-facebook-square"></i><span>Facebook</span></button></li> -->
<!-- 				<li><button><i class="fab fa-line"></i><span>line</span></button></li> -->
<!-- 			</ul> -->
<!-- 			<p class="forget-msg">Sign up</p> -->
				<a href="./SignUp.jsp">회원가입</a>
		</section>
		<footer>
<!-- 			<div class="copyright-wrap"> -->
<!-- 			<span>	<img src="img/logo.png"> Copyright © NAVER Corp. All Rights Reserved.</span> -->
			</div>
		</footer>
		</div>
	</div>
	
</body>
</html>