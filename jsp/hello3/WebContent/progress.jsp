<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 처리</title>
</head>
<body>
	<p>로그인처리 요청이 전달됨?</p>
	<%
		String id = request.getParameter("userid");
		
		if (id.length() > 0) {
			out.println(id + "님 방가");
		} else {
			out.println("입력해주세요.");
			response.sendRedirect("./login.jsp");
		}
	%>
</body>
</html>