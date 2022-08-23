<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="Map.MapDAO"%>
<%-- <%@ page --%>
<%-- import = "java.sql.Connection" --%>
<%-- import = "java.sql.DriverManager" --%>
<%-- import = "java.sql.SQLException" --%>
<%-- import = "java.sql.Statement" --%>
<%-- import = "java.sql.PreparedStatement" --%>
<%-- %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
String id = (String) session.getAttribute("latclick");

// if(id == null) {
// 	// 로그인페이지 이동
// 	response.sendRedirect("../Signup&Login/MapMain.jsp");
// }

final String DRIVER = "com.mysql.cj.jdbc.Driver";
final String DBURL = "jdbc:mysql://localhost:3306/webproject";
final String DBID = "kch9253";
final String DBPW = "ckdgmlek1";

Class.forName(DRIVER);
Connection con = DriverManager.getConnection(DBURL, DBID, DBPW);
System.out.println("디비 연결성공");

String sql = "select * from mapapi where latclick=?";
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setString(1, id);

ResultSet rs = pstmt.executeQuery();

String latclick = "";
String lngclick = "";
String paddress = "";
String pname = "";


if(rs.next()) {
	latclick = rs.getString("latclick");
	lngclick = rs.getString("lngclick");
	paddress = rs.getString("paddress");
	pname = rs.getString("pname");
}





%>
	<form method="post" action="../test/test.jsp">

<!-- 	 <input type="text" id="fulladdress" name="fulladdress" style="width:90%;" disabled>  -->
    <br>
    <br>
    <label>상호명 :<input type="text" id="pname" name="pname" value="<%=pname%>" > 
    <br>
    <br>
    <label>주소 :<input type="text" id="paddress" name="paddress" value="<%=paddress%>" >  
    <br>
    <br>
    <label>좌표ID값 :<input type="text" id="latclick" name="latclick" value="<%=latclick%>" > 
    <br>
    <br>
    <label>좌표위도 :<input type="text" id="lngclick" name="lngclick" value="<%=lngclick%>" >
    <br>
    <br>
    </form>
</body>
</html>