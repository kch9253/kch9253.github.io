<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="user.UserDTO"%>
<%@ page import="user.UserDAO"%>
<%@ page import="java.io.PrintWriter"%>
<%
	//사용자가 보낸 데이터를 한글을 사용할 수 있는 형식으로 변환
	request.setCharacterEncoding("UTF-8");
	String UserID = null;
	String userPassword = null;
	String Username	= null;
	String Userbir_wrap = null;
	String Usergender = null;

	if (request.getParameter("UserID") != null) {
		UserID = (String) request.getParameter("UserID");
	}
	if (request.getParameter("userPassword") != null) {
		userPassword = (String) request.getParameter("userPassword");
	}
	if (request.getParameter("Username") != null) {
		Username = (String) request.getParameter("Username");
	}
	if (request.getParameter("Userbir_wrap") != null) {
		Userbir_wrap = (String) request.getParameter("Userbir_wrap");
	}
	if (request.getParameter("Usergender") != null) {
		Usergender = (String) request.getParameter("Usergender");
	}
	

	if (UserID == null || userPassword == null || 
			Username == null || Userbir_wrap == null || Usergender == null) {
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('입력이 안 된 사항이 있습니다.')");
		script.println("</script>");
		script.close();
		return;
	}

	UserDAO userDAO = new UserDAO();
	int result = userDAO.join(UserID, userPassword, Username, Userbir_wrap, Usergender);
	if (result == 1) {
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('회원가입에 성공했습니다.')");
		script.println("location.href='index.jsp';");
		script.println("</script>");
		script.close();
		return;
	}
%>
