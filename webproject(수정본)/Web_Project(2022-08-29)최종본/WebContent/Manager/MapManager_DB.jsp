<%@page import="org.apache.catalina.core.ApplicationContext"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter" %>    
<%@ page
import = "java.sql.Connection"
import = "java.sql.DriverManager"
import = "java.sql.SQLException"
import = "java.sql.Statement"
import = "java.sql.PreparedStatement"
%>
<%@ page import="MAP.Map"%>


<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="initial-scale=1.0">
	<title> Autocomplete Place Write </title>
    
<style>

</style>
</head>

<body>
<div id="wrapper">

<h1> 돌아가서 추가정보를 저장해주세요! </h1>

<!-- 클래스 내용 DB Write -->

<%
		request.setCharacterEncoding("UTF-8");

	    	String lat = request.getParameter("latclick");  
			String lng = request.getParameter("lngclick");
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
		System.out.println(lng);
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
			 
		session.setAttribute("latclick", lat); // 세션보내기위해 설정해둠 (latclick 라는 아이디값을 활용하여 세션을 유지하고 보여주고자 하는 뷰 파일 (test.jsp 에다가 세션값을 전달할거임))
// 		HttpSession session2 = request.getSession(true);
		
		System.out.println("드라이버 로드 성공 !");
		
		String DRIVER = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/webproject";
		String id = "root";
		String pass = "0000";
		Class.forName(DRIVER);
		
		con = DriverManager.getConnection(url, id, pass);
		System.out.println(con.toString());
		System.out.println("JDBC Connector 연결 성공 !");
		
		// input data
		
				String sql = "INSERT INTO mapapi (latclick, lngclick, paddress, pname, number, opentime , category, img, route, homepage, road, menu) values (?,?,?,?,?,?,?,?,?,?,?,?)";
				
				
		
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, lat);
				pstmt.setString(2, lng);
				pstmt.setString(3, paddress);
				pstmt.setString(4, pname);
				pstmt.setString(5, number);
				pstmt.setString(6, opentime);
				pstmt.setString(7, category);
				pstmt.setString(8, img);
				pstmt.setString(9, route);
				pstmt.setString(10, homepage);
				pstmt.setString(11, road);
				pstmt.setString(12, menu);
				
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
  			location.href="./MapManager.jsp"; 
  		</script> 
  		
		
		
</div>
</body>
</html>