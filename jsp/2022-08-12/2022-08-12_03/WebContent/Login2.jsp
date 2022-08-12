<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 결과</title>
</head>
<body>
<%
String id = request.getParameter("id");
String pwd = request.getParameter("pwd");

//회원 아이디 : user1
//비밀번호 : 1234

String dbid = "kch9253";//DB에서 가져온 데이터
String dbpwd = "1234";//DB에서 가져온 데이터

if(dbid.equals(id)){
	if(dbpwd.equals(pwd)){
		//로그인 성공. 이경우에 쿠키에 id 저장
		Cookie user = new Cookie("id",id);
		response.addCookie(user);
		response.sendRedirect("Loginnext.jsp");//로그인 성공시 main으로
		
	}else{
		
		//비밀번호 오류.
		response.sendRedirect("login.jsp");
	}
}else{
	//아이디 없음.
	response.sendRedirect("login.jsp");
}
%>

</body>
</html>