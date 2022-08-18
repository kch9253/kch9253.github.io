package user;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.DatabaseUtil;

public class UserDAO {
	Connection conn = DatabaseUtil.getConnection();

	public int join(String UserID, String userPassword, String Username, String Userbir_wrap, String Usergender) {
		String SQL = "INSERT INTO USER VALUES (?,?,?,?,?)";
		try {
			// 각각의 데이터를 실제로 넣어준다.
			PreparedStatement pstmt = conn.prepareStatement(SQL);

			// 쿼리문의 ?안에 각각의 데이터를 넣어준다.
			pstmt.setString(1, UserID);
			pstmt.setString(2, userPassword);
			pstmt.setString(3, Username);
			pstmt.setString(4, Userbir_wrap);
			pstmt.setString(5, Usergender);
			

			// 명령어를 수행한 결과 반환, 반환값: insert가 된 데이터의 개수
			return pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
}
