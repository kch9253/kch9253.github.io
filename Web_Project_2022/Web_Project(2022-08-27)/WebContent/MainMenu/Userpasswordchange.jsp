<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="USER.UserDAO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호변경</title>
<script type="text/javascript">
function checkValue() {
	var form = document.userInfo;
	
	if(!form.userid.value) {
		alert("아이디를 입력하세요.");
		return false;
	} 	
	if(!form.userpassword.value) {
		alert(" 현재비밀번호를 입력하세요.");
		return false;
	}
	if(!form.changepassword.value) {
		alert("새로운 비밀번호를 입력하세요.");
		return false;
	}
	if(!form.changepassword2.value) {
		alert("새로운 비밀번호 확인을 입력하세요.");
		return false;
	}
	if(form.changepassword.value != form.changepassword2.value) {
		alert("변경할 비밀번호가 맞지않습니다.");
		return false;
	}
}
</script>



</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
String id = (String) session.getAttribute("userid");


if(id == null) {
	// 로그인페이지 이동
	response.sendRedirect("../Signup&Login/Login.jsp");
}

String userpassword = request.getParameter("userpassword");

final String DRIVER = "com.mysql.cj.jdbc.Driver";
final String DBURL = "jdbc:mysql://localhost:3306/webproject";
final String DBID = "root";
final String DBPW = "0000";

Class.forName(DRIVER);
Connection con = DriverManager.getConnection(DBURL, DBID, DBPW);
System.out.println("디비 연결성공");

String sql = "select * from user where userid=?";
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setString(1, id);

ResultSet rs = pstmt.executeQuery();

%>
<form action="UserpasswordchangeAction.jsp" method="post" name="userInfo" onsubmit="return checkValue()">

	<center>
 아이디 : <input type="text" id="id" class="int" name ="userid" maxlength="20" value="<%= id%>" disabled>
<br>
<br>
 현재비밀번호 : <input type="password" id="password" class="int" name ="userpassword" maxlength="20" value="" >
<br>
<br>
 새비밀번호 : <input type="password" id="changepassword" class="int" name ="newpassword" maxlength="20" value="" >
<br>
<br>
 새비밀번호확인 : <input type="password" id="changepassword2" class="int" name ="newpassword2" maxlength="20" value="" >
<br>	
<br>
<input type="submit" value="변경하기">	
	</center>
</form>


</body>
</html>