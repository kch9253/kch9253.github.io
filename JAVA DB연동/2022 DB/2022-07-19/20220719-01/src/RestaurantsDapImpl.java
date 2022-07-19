import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Result;

import kr.co.greenart.dbutil.DBUtil;

// 구현클래스 끝에 Impl 붙이는게 좋음
public class RestaurantsDapImpl implements RestaurantsDao{
	private Restaurant resultMapping (ResultSet rs ) throws SQLException {
		int id = rs.getInt("id");
		String name = rs.getString("name");
		String phoneNumber = rs.getString("phoneNumber");
		String address = rs.getString("address");
		return new Restaurant(id, name, phoneNumber, address);	
	}
	@Override
	public int create(String name, String phoneNumber, String address) throws SQLException {
		String query = "INSERT INTO restaurants (name, phoneNumber, address) VALUES (?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query); // prepareStatement 를통해 위 ? 값에 파라미터값을 넣어줄수있다
			pstmt.setString(1, name);
			pstmt.setString(2, phoneNumber);
			pstmt.setString(3, address);
			
			return pstmt.executeUpdate(); // 위에 셋스트링으로 준비를 미리 해놨기때문에 ()안의 값은 비워둔다
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
			}
		} 
	@Override
	public List<Restaurant> read() throws SQLException {
		String query = "SELECT * FROM restaurants";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Restaurant> list = new ArrayList<>();
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				
				list.add(resultMapping(rs));
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
		return null;
	}
	@Override
	public Restaurant read(int id) throws SQLException {
		String query = "SELECT * FROM restaurants WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // ResultSet = 행을 읽을수있게 도와주는 객체
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
				
			if (rs.next()) {
				return resultMapping(rs);
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
		return null;
	}
	@Override // 수정
	public int update(int id, String name, String phoneNumber, String address) throws SQLException {
		String query = "UPDATE restaurants SET name = ?, phoneNumber = ?, address = ? WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, phoneNumber);
			pstmt.setString(3, address);
			pstmt.setInt(4, id);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}
	@Override // 삭제
	public int delete(int id) throws SQLException {
		String query = "DELETE FROM restaurants WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}
}













