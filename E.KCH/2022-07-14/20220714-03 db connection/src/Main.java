import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/world";
		String id = "root";
		String password = "root";
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이브 적재성공");
			
			conn = DriverManager.getConnection(url , id , password);
			System.out.println("데이터베이스 연결성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을수없습니다");
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결에 실패하였습니다");
			System.out.println(e.getMessage());
		} finally {
			if (conn != null) {
				try {
					conn.close();
					System.out.println("연결닫았습니다");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
