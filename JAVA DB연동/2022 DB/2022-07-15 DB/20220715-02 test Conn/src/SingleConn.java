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
		
		System.out.println("�����帧 1");
		
		try {
			conn = DBUtil.getConnection();
			
			System.out.println("�����帧 2");
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT 1");
			
			if (rs.next()) {
				int result = rs.getInt(1);
				System.out.println("Ȯ��: " + result);
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
}	// SingleTon Class : Ư�� ���� �ϳ��� �����ϴ� Ŭ����
//	// ���� ��ü ����
//	private static Connection conn;
//	
//	// �ʱ�ȭ ��(static ��) : ���� ���� �޸𸮿� �ε� �� ����
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
//	//getConn() ����
//	public static Connection getConn() {
//		return conn;
//	}
//} // class
