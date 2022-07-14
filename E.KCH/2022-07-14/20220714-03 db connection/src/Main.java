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
			System.out.println("����̺� ���缺��");
			
			conn = DriverManager.getConnection(url , id , password);
			System.out.println("�����ͺ��̽� ���Ἲ��");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹��� ã���������ϴ�");
		} catch (SQLException e) {
			System.out.println("�����ͺ��̽� ���ῡ �����Ͽ����ϴ�");
			System.out.println(e.getMessage());
		} finally {
			if (conn != null) {
				try {
					conn.close();
					System.out.println("����ݾҽ��ϴ�");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
