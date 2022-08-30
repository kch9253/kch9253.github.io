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
<title>Insert title here</title>
</head>
<body>
<%
String id = (String) session.getAttribute("userid");
if (id == null) {
	response.sendRedirect("../Signup&Login/Login.jsp");
}

request.setCharacterEncoding("UTF-8");

String userpassword = request.getParameter("userpassword");
String passwd1 = request.getParameter("passwd1");

final String DRIVER = "com.mysql.cj.jdbc.Driver";
final String DBURL = "jdbc:mysql://localhost:3306/webproject";
final String DBID = "kch9253";
final String DBPW = "ckdgmlek1";

Class.forName(DRIVER);
Connection con = DriverManager.getConnection(DBURL, DBID, DBPW);
System.out.println("updatePro : 드라이브로드와 디비연결성공");

String sql = "select userpassword from user where userid=?";
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setString(1, id);

ResultSet rs = pstmt.executeQuery();


if(rs.next()){ //아이디있는 경우
	if(userpassword.equals(rs.getString("userpassword"))){// 비밀번호 일치하는 경우
		sql = "update user set userpassword=?" + "where userid=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, passwd1);
		pstmt.setString(2, id);
		pstmt.executeUpdate();
		%>
			 <script type="text/javascript">
			 	alert("비밀번호변경완료");
			 	location.href="../Manager/MapUser.jsp";
			 </script>
	<% 		
	}else{%> // 비밀번호 불일치하는 경우
		<script type="text/javascript">
			alert("현재비밀번호 확인해주세요")
			history.back(); //뒤로가기.
		</script>
<%} 	
	}else{%> //아이디없는 경우
	<script type="text/javascript">
		alert("비회원입니다")
		history.back(); //뒤로가기.
	</script>
	<%}
%>
</body>
</html>