<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="USER.UserDAO" %>
<%@ page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8"); %>
<!-- scope="page" -->

<jsp:useBean id="user" class="USER.UserDAO"  />
<jsp:setProperty name="user" property="UserID" />
<jsp:setProperty name="user" property="UserPassword" />
<jsp:setProperty name="user" property="Username" />
<jsp:setProperty name="user" property="Userbir_wrap" />
<jsp:setProperty name="user" property="Usergender" />

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<%
		// 입력하지 않은 항목이 있을 경우
	    if (user.getUserID() == null || user.getUserPassword() == null || user.getUserName() == null || 
	        user.getUserbir_wrap() == null || user.getUserGender() == null) {
	    	PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('입력해야하는 항목이 남아있습니다.')");
			script.println("history.back()");
			script.println("</script>");
	    } else {
	    	
	    	UserDAO userDAO = new UserDAO(); // 데이터베이스에 접근할 수 있는 객체
	    	
	    	int result = userDAO.join(userDAO);
	    	
	    	
	    	if (result == -1) {  // 동일한 ID를 입력했을 경우 데이터베이스에서 오류 발생 (userID는 고유한 기본키 PK)
	    		PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('이미 존재하는 아이디입니다.')");
				script.println("history.back()");
				script.println("</script>");
	    	} else {  // 회원가입이 정상적으로 이루어진 경우
	    		PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("location.href='./Login.jsp'");
				script.println("</script>");
	    	}
	    }

	%>
</body>
</html>