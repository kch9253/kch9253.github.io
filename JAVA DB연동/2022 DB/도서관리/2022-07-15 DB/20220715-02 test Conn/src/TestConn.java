import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import kr.co.greenart.dbutil.DBUtil;

public class TestConn {
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
}
