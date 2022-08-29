<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="MAP.MapDAO"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
	
	String lat = request.getParameter("latclick");  
// 	String lng = request.getParameter("lngclick");
	String paddress = request.getParameter("paddress");
	String pname = request.getParameter("pname");
	String number = request.getParameter("number");
	String opentime = request.getParameter("opentime");
	String category = request.getParameter("category");
	String img = request.getParameter("img");
	String route = request.getParameter("route");
	String homepage = request.getParameter("homepage");
	String road = request.getParameter("road");
	String menu = request.getParameter("menu");
	
		Connection con = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		 //콘솔 출력 테스트 차례대로 위도, 경도, 주소, 장소명
 		System.out.println(lat);
// 		System.out.println(lng);
        System.out.println(paddress);
		System.out.println(pname);
		System.out.println(number);
		System.out.println(opentime);
		System.out.println(category);
		System.out.println(img);
		System.out.println(route);
		System.out.println(homepage);
		System.out.println(road);
		System.out.println(menu);
		 
		 try {
// 			 session.setAttribute("latclick", latclick);
			 System.out.println("드라이버 로드 성공 !");
			 
			String DRIVER = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/webproject";
			String id = "root";
			String pass = "0000";
			Class.forName(DRIVER);
			
			con = DriverManager.getConnection(url, id, pass);
			System.out.println(con.toString());
			System.out.println("JDBC Connector 연결 성공 !");
			
			String sql = "update mapapi set paddress=?, pname=?, number=?,opentime=?,category=?,img=?,route=?, homepage=?, road=?, menu=? where latclick=? ";
					
			
			pstmt = con.prepareStatement(sql);
// 			pstmt.setString(1, lat);
// 			pstmt.setString(1, lng);
			pstmt.setString(1, paddress);
			pstmt.setString(2, pname);
			pstmt.setString(3, number);
			pstmt.setString(4, opentime);
			pstmt.setString(5, category);
			pstmt.setString(6, img);
			pstmt.setString(7, route);
			pstmt.setString(8, homepage);
			pstmt.setString(9, road);
			pstmt.setString(10, menu);
			pstmt.setString(11, lat);
			
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
 			alert("수정완료"); 
  			location.href="./MapManagerUpdate.jsp"; 
  		</script>  
	
	
</body>
</html>