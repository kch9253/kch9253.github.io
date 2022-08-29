<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="USER.UserDAO" %>
<%@ page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8"); %>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<%
        String userID		= request.getParameter("userid");
        String userPassword = request.getParameter("userpassword");
        String userName		= request.getParameter("username");
        String userbir_wrap	= request.getParameter("userbirwrap");
        String userNumber		= request.getParameter("usernumber");
        String userGender		= request.getParameter("usergender");
        
     	// -1: 서버 오류 / 0: 이미존재하는 아이디 / 1: 성공
        if(userID == null || userPassword == null || userName == null 
        || userbir_wrap == null || userNumber == null || userGender == null) {
        	PrintWriter script = response.getWriter();
        	script.println("<script>");
        	script.println("alert('빈칸을 확인해 주세요')");
        	script.println("history.back()");
        	script.println("</script>");
        } else {
        	UserDAO userDAO = new UserDAO();
        	
        	userDAO.setUserID(userID);
        	userDAO.setUserPassword(userPassword);
        	userDAO.setUserName(userName);
        	userDAO.setUserbir_wrap(userbir_wrap);
        	userDAO.setUserGender(userGender);
        	userDAO.setUsernumber(userNumber);
        	
            int result = userDAO.join(userDAO);
            	
            if(result == -1) {
            	PrintWriter script = response.getWriter();
            	script.println("<script>");
            	script.println("alert('이미 아이디가 존재합니다.')");
            	script.println("history.back()");
            	script.println("</script>");
            } 
            else {
            	PrintWriter script = response.getWriter();
            	script.println("<script>");
            	script.println("alert('회원가입을 축하드립니다.')");
            	script.println("location.href = './Login.jsp'");
            	script.println("</script>");
            }
        }
        %>
</body>
</html>