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
	
	String latclick = request.getParameter("latclick");  
	String lngclick = request.getParameter("lngclick");
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
 		System.out.println(latclick);
		System.out.println(lngclick);
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
			String id = "kch9253";
			String pass = "ckdgmlek1";
			Class.forName(DRIVER);
			
			con = DriverManager.getConnection(url, id, pass);
			System.out.println(con.toString());
			System.out.println("JDBC Connector 연결 성공 !");
			
			String sql = "update mapapi set pname=?, paddress=?, number=?, category=?, opentime=?, img=?, route=?, homepage=?, road=?, menu=?, lngclick=? where latclick=? ";
					
			
			pstmt = con.prepareStatement(sql);
// 			pstmt.setString(1, latclick);
			pstmt.setString(1, pname);
			pstmt.setString(2, paddress);
			pstmt.setString(3, number);
			pstmt.setString(4, category);
			pstmt.setString(5, opentime);
			pstmt.setString(6, img);
			pstmt.setString(7, route);
			pstmt.setString(8, homepage);
			pstmt.setString(9, road);
			pstmt.setString(10, menu);
			pstmt.setString(11, lngclick);
			pstmt.setString(12, latclick);
			
			System.out.println("SQLServerStatement 개체 생성 !");
			
			int result = pstmt.executeUpdate();
			System.out.println(result);
			
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