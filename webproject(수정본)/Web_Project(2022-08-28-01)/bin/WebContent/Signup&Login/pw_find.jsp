<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="USER.UserDAO" %>
<%@ page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function id_search() { 
 	var frm = document.idfindscreen;

 	if (!frm.userid.value) {
	  alert("아이디를 입력해주세요");
	  return false;
	 }
	 if (!frm.username.value) {
		  alert("이름을 입력해주세요");
		  return false;
	 }
	 if (!frm.usernumber.value) {
		  alert("핸드폰번호를 입력해주세요");
		  return false;
	 }

 frm.method = "post";
 frm.action = "findpwResult.jsp"; //넘어간화면
 frm.submit();  
 }
	</script>
</head>
<body>
	<form name="idfindscreen" method = "post" onsubmit="return id_search()">
			<div class = "search-title">
				<h3>비밀번호찾기</h3>
			</div>
		<section class = "form-search">
			<div class = "find-id">
				<label>아이디</label>
				<input type="text" onKeyup = "addHypen(this);" name="userid" class = "btn-phone" placeholder = "등록한 아이디">
			</div>
			<div class = "find-name">
				<label>이름</label>
				<input type="text" name="username" class = "btn-name" placeholder = "등록한 이름">
			<br>
			</div>
			<div class = "find-phone">
				<label>번호</label>
				<input type="text" onKeyup = "addHypen(this);" name="usernumber" class = "btn-phone" placeholder = "휴대폰번호를 '-'없이 입력">
			</div>
			<br>
	</section>
	<div class ="btnSearch">
		<input type="button" name="enter" value="찾기"  onClick="id_search()">
		<input type="button" name="cancle" value="취소" onclick="location.href='Login.jsp'">
 	</div>
 </form>
</body>
</html>