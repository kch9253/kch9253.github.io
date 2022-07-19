import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
//		Connection conn = null;
//		Statement stmt = null;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db",
//					"root", "root");
//			
//			// table A : 컬럼 B VARCHAR(10) PK
//			String query = "CREATE TABLE C (B VARCHAR(10) PRIMARY KEY);";
//			stmt = conn.createStatement();
//			
//			stmt.executeUpdate(query); // executeUpdate = 테이블을 (추가,변경,삭제) 를 위한 메소드 
//			//------------------------------------------------------
//			
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//			
//		} finally {
//			if (stmt != null) {
//				try {
//					stmt.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//			if (conn != null) {
//				try {
//					conn.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//		}
	}
}
