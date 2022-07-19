import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main3 {
	public static Connection makeConnection() {
		String url = "jdbc:mysql://localhost:3306/my_db";
		String id = "root";
		String password = "root";
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	public static void selectAllBook() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = makeConnection(); // 커넥션 만듬
			stmt = conn.createStatement(); // 커넥션 객체만듬
			rs = stmt.executeQuery("SELECT * FROM books"); // 명령날림 (books 를 호출해라)
			
			while (rs.next()) { // rs.next() 를 반복문없이 호출하면 한번 호출된다 // books 안에 데이터값이 여러개이기때문에 반복문을 통해 호출했다
				int id = rs.getInt("bookID"); // 키값은 정수형이기때문에 생성후에 호출함
				String title = rs.getString("title"); // 타이틀도 마찬가지 선언해주고 get 값을 통해 호출
				int price = rs.getInt("price");
				
				System.out.println(id + "," + title + "," + price); // 키값,제목,가격 반복문을통해 안에들어있는 값들을 전부호출
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close(); // 위에 while 반복값이 계속 실행중이라서 close를 통해 모든데이터값을 호출하고 닫아줌
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static int insertBook(String title, int price) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		try {
			conn = makeConnection();
			stmt = conn.createStatement();
			
			result = stmt.executeUpdate("INSERT INTO books (title, price) VALUES ("
					+ "'" + title + "', " + price
					+ ");");
			System.out.println(result + "행이 추가되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
//		insertBook("새로운 책입니당", 13000);     // 새로운 책의 정보와 가격을 추가함
//		insertBook("연습", 123456);
		selectAllBook(); // books 안에들어있는 테이블 값들 불러옴
	}
}
