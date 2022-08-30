<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="USER.UserDAO" %>
<%@ page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>탈퇴처리</title>
</head>
<body>
	<%
request.setCharacterEncoding("utf-8");
String id = (String) session.getAttribute("userid");

String rid =request.getParameter("userid");
String rpass = request.getParameter("userpassword");
String rnm = request.getParameter("username");


Class.forName("com.mysql.cj.jdbc.Driver");
String dbUrl = "jdbc:mysql://localhost:3306/webproject";
String dbId = "kch9253";
String dbPass = "ckdgmlek1";
Connection con = DriverManager.getConnection(dbUrl,dbId,dbPass);
String sql1 = "select * from user where userid=?";
PreparedStatement pstmt = con.prepareStatement(sql1);
pstmt.setString(1,rid);
ResultSet rs = pstmt.executeQuery();

if(rs.next()){
	String rsnm = rs.getString("username");
	out.println("아이디확인");
	if(rs.getString("userpassword").equals(rpass)){
		out.println("비밀번호일치");
		if(rs.getString("username").equals(rnm)){
			out.println("이름일치");
			String sql2 = "delete from user where userid=? and username=? and userpassword=?";
			pstmt = con.prepareStatement(sql2);
			pstmt.setString(1,rid);
			pstmt.setString(2,rnm);
			pstmt.setString(3,rs.getString("userpassword"));
			pstmt.executeUpdate();
			session.invalidate();
			%>
			<script type="text/javascript">
				alert("회원탈퇴되었습니다.");
				location.href="../Signup&Login/Login.jsp";
			</script>
	<%
// 			response.sendRedirect("loginForm.jsp");
		}else{%>
		<script type="text/javascript">
			alert("이름을 확인해주세요.");
			history.back();
		</script>
<%}
	}else{%>
		<script type="text/javascript">
			alert("비밀번호를 확인해주세요.");
			history.back();
		</script>
	<%}
}else{%>
	<script type="text/javascript">
		alert("아이디를 확인해주세요.");
		history.back();
	</script>
	
<%} 


%>
</body>
</html>