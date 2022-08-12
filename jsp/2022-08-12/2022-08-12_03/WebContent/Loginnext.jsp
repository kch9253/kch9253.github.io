<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인페이지</title><%-- 로그인 성공시 페이지 --%>
</head>
<body>
<h2>메인 페이지</h2>
<%
	String id = null;
	Cookie[] cs = request.getCookies();
	
	
	for(Cookie c : cs){
		if(c.getName().equals("id")){
			id = c.getValue();
		}
	}
	if(id == null){//로그아웃후에 main페이지로 주소값을 입력해도 접속되지않게 방지 (로그인페이지호출)
		response.sendRedirect("login.jsp");
	}
%>
<%=id %> 님 반갑습니다.
<a href="Logout.jsp">로그아웃</a>
</body>
</html>