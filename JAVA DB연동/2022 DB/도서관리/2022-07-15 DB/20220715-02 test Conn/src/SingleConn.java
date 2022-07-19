import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import kr.co.greenart.dbutil.DBUtil;

public class SingleConn {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		System.out.println("실행흐름 1");
		
		try {
			conn = DBUtil.getConnection();
			
			System.out.println("실행흐름 2");
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT 1");
			
			if (rs.next()) {
				int result = rs.getInt(1);
				System.out.println("확인: " + result);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}

	public static Connection getConn() {
		// TODO Auto-generated method stub
		return null;
	}
}	// SingleTon Class : 특정 역할 하나만 수행하는 클래스
//	// 연결 객체 정의
//	private static Connection conn;
//	
//	// 초기화 블럭(static 블럭) : 가장 먼저 메모리에 로딩 → 실행
//	static {
//		String url = "jdbc:mysql://localhost:3306/my_db";
//		String user = "root";
//		String password = "root";
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn = DriverManager.getConnection(url, user, password);
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("DB Connection Exception!!!");
//		} 
//	}
//
//	//getConn() 정의
//	public static Connection getConn() {
//		return conn;
//	}
//} // class
