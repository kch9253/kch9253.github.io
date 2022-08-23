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
<%@ page import="Map.MapDAO"%>


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

클래스 등록이 완료되었습니다!

<!-- 클래스 내용 DB Write -->

<%
		request.setCharacterEncoding("UTF-8");

	    	String lat = request.getParameter("latclick");  
			String lng = request.getParameter("lngclick");
	    	String paddress = request.getParameter("paddress");
	    	String pname = request.getParameter("pname");


		Connection con = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		 //콘솔 출력 테스트 차례대로 위도, 경도, 주소, 장소명
		System.out.println(lat);
		System.out.println(lng);
        System.out.println(paddress);
		System.out.println(pname);
		
		try {
		
		System.out.println("드라이버 로드 성공 !");
		
		String DRIVER = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/webproject";
		String id = "kch9253";
		String pass = "ckdgmlek1";
		Class.forName(DRIVER);
		
		con = DriverManager.getConnection(url, id, pass);
		System.out.println(con.toString());
		System.out.println("JDBC Connector 연결 성공 !");
		
		// input data
		
				String sql = "INSERT INTO mapapi (latclick, lngclick, paddress, pname) values (?, ?, ?, ?)";
				
		
		
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, lat);
				pstmt.setString(2, lng);
				pstmt.setString(3, paddress);
				pstmt.setString(4, pname);
				
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
			location.href="MapManager.jsp";
		</script>
		
		
		
</div>
</body>
</html>