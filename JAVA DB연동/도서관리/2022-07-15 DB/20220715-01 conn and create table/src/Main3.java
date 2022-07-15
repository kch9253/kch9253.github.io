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
			conn = makeConnection(); // Ŀ�ؼ� ����
			stmt = conn.createStatement(); // Ŀ�ؼ� ��ü����
			rs = stmt.executeQuery("SELECT * FROM books"); // ��ɳ��� (books �� ȣ���ض�)
			
			while (rs.next()) { // rs.next() �� �ݺ������� ȣ���ϸ� �ѹ� ȣ��ȴ� // books �ȿ� �����Ͱ��� �������̱⶧���� �ݺ����� ���� ȣ���ߴ�
				int id = rs.getInt("bookID"); // Ű���� �������̱⶧���� �����Ŀ� ȣ����
				String title = rs.getString("title"); // Ÿ��Ʋ�� �������� �������ְ� get ���� ���� ȣ��
				int price = rs.getInt("price");
				
				System.out.println(id + "," + title + "," + price); // Ű��,����,���� �ݺ��������� �ȿ�����ִ� ������ ����ȣ��
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close(); // ���� while �ݺ����� ��� �������̶� close�� ���� ��絥���Ͱ��� ȣ���ϰ� �ݾ���
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
			System.out.println(result + "���� �߰��Ǿ����ϴ�.");
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
//		insertBook("���ο� å�Դϴ�", 13000);     // ���ο� å�� ������ ������ �߰���
//		insertBook("����", 123456);
		selectAllBook(); // books �ȿ�����ִ� ���̺� ���� �ҷ���
	}
}
