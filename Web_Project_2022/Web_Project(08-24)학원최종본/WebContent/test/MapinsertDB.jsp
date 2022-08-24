<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="Map.MapDAO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DB에 넣자</title>
</head>
<body>
<%

		request.setCharacterEncoding("UTF-8");
			
			String id = request.getParameter("id");
			String id2 = request.getParameter("id2");
			String title = request.getParameter("title");
			String number = request.getParameter("number");

		Connection con = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		
		System.out.println(id);
		System.out.println(id2);
		System.out.println(title);
		System.out.println(number);
		
		try {
			System.out.println("드라이버 로드 성공 !");
			
			String DRIVER = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/webproject";
			String userid = "kch9253";
			String pass = "ckdgmlek1";
			Class.forName(DRIVER);
			
			con = DriverManager.getConnection(url, userid, pass);
			System.out.println(con.toString());
			System.out.println("JDBC Connector 연결 성공 !");
			
			
			String sql = "INSERT INTO mapapi (id,  id2,title,number) values (?,?, ?,?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, id2);
			pstmt.setString(3, title);
			pstmt.setString(4, number);
			
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
			location.href="testMain.jsp";
		</script>	
			
		

</body>
</html>