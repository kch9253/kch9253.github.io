<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
	
		String latclick = request.getParameter("latclick");
		String number = request.getParameter("number");
		String opentime = request.getParameter("opentime");
		String category = request.getParameter("category");
		String img = request.getParameter("img");
		String route = request.getParameter("route");
	
		Connection con = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		 //콘솔 출력 테스트 차례대로 위도, 경도, 주소, 장소명
		System.out.println(latclick);
		System.out.println(number);
		System.out.println(opentime);
		System.out.println(category);
		System.out.println(img);
		System.out.println(route);
		 
		 try {
			 session.setAttribute("latclick", latclick);
			 System.out.println("드라이버 로드 성공 !");
			 
			String DRIVER = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/webproject";
			String id = "root";
			String pass = "0000";
			Class.forName(DRIVER);
			
			con = DriverManager.getConnection(url, id, pass);
			System.out.println(con.toString());
			System.out.println("JDBC Connector 연결 성공 !");
			
			String sql = "delete from mapapi2 where latclick=?";
					
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, latclick);
			pstmt.setString(2, number);
			pstmt.setString(3, opentime);
			pstmt.setString(4, category);
			pstmt.setString(5, img);
			pstmt.setString(6, route);
			
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
 			alert("삭제완료"); 
  			location.href="MapManager.jsp"; 
  		</script>  
	
	
</body>
</html>