<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.ArrayList"%>
<%@page import="MAP.Map"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="FAVORITE.favoriteDTO" %>    
    <jsp:useBean id="dao" class="MAP.MapDAO" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
String id = (String) session.getAttribute("userid");


if(id == null) {
	// 로그인페이지 이동
	response.sendRedirect("../Manager/MapUser.jsp");
}

String userpassword = request.getParameter("userpassword");

final String DRIVER = "com.mysql.cj.jdbc.Driver";
final String DBURL = "jdbc:mysql://localhost:3306/webproject";
final String DBID = "kch9253";
final String DBPW = "ckdgmlek1";

Class.forName(DRIVER);
Connection con = DriverManager.getConnection(DBURL, DBID, DBPW);
System.out.println("디비 연결성공");

String sql = "select * from user where userid=?";
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setString(1, id);

ResultSet rs = pstmt.executeQuery();

%>
<%

request.setCharacterEncoding("UTF-8");
String userid		= request.getParameter("userid");
String latclick1		= request.getParameter("latclick");
String pname		= request.getParameter("pname");
String paddress		= request.getParameter("paddress");

Connection conn = null;
Statement stmt = null;
PreparedStatement pstmtt = null;

System.out.println(userid);
System.out.println(latclick1);
System.out.println(pname);
System.out.println(paddress);


try {
	 
	session.setAttribute("latclick1", latclick1); // 세션보내기위해 설정해둠 (latclick 라는 아이디값을 활용하여 세션을 유지하고 보여주고자 하는 뷰 파일 (test.jsp 에다가 세션값을 전달할거임))
//		HttpSession session2 = request.getSession(true);
	
	System.out.println("드라이버 로드 성공 !");
	
	String DRIVER1 = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/webproject";
	String id1 = "kch9253";
	String pass = "ckdgmlek1";
	Class.forName(DRIVER);
	
	con = DriverManager.getConnection(url, id1, pass);
	System.out.println(con.toString());
	System.out.println("JDBC Connector 연결 성공 !");
	
	// input data
	
			String sql1 = "INSERT INTO favorite (latclick, userid, pname, paddress) values (?,?,?,?)";
			
			
	
			pstmt = con.prepareStatement(sql1);
			pstmt.setString(1, latclick1);
			pstmt.setString(2, userid);
			pstmt.setString(3, pname);
			pstmt.setString(4, paddress);

			
			System.out.println("SQLServerStatement 개체 생성 !");
								
			pstmt.executeUpdate();
			
			
			} catch(SQLException e) {
				System.out.println("SQLException : " + e.getMessage());

			} finally {
				if(stmt != null) {
					try {
						stmt.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				if(con != null) {
					try {
						con.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
	
	%>
		<script type="text/javascript">  
			alert("저장완료"); 
			location.href="./MapUser.jsp"; 
		</script> 
		






</body>
</html>