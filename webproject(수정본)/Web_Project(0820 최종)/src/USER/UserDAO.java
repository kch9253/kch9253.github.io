package USER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserDAO {
	private String UserID;
	private String UserPassword1;
	private String UserPassword;
	private String Username;
	private String Userbir_wrap;
	private String Usergender;
	
	private Connection con;
	private ResultSet rs;
	
	
	public UserDAO() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/webproject";
			String dbID = "root";
			String dbPassword = "0000";
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dbURL, dbID, dbPassword);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("연동안됐음");
		}
	}
	
	// 로그인
	/*
	 * -2: 아이디없음
	 * -1: 서버오류
	 * 0: 비밀번호 틀림
	 * 1: 성공
	 */
	public int login(String UserID, String UserPassword) {
		try {
			PreparedStatement pst = con.prepareStatement("SELECT UserPassword FROM user WHERE UserID = ?");
			pst.setString(1, UserID);
			rs = pst.executeQuery();
			if (rs.next()) {
				return rs.getString(1).equals(UserPassword) ? 1 : 0;
			} else {
				return -2;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	// 중복여부 확인
	public boolean ID_Check(String UserID) {
		try {
			PreparedStatement pst = con.prepareStatement("SELECT * FROM user WHERE UserID = ?");
			pst.setString(1, UserID);
			rs = pst.executeQuery();
			if (rs.next()) {
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	
	// 회원가입
	/*
	 * -1: 서버오류
	 * 0: 이미 존재하는 아이디
	 * 1: 성공
	 */
	public int join(UserDAO userDAO) {
		if(!ID_Check(userDAO.getUserID())) return 0;
		
		try {
			PreparedStatement pst = con.prepareStatement("INSERT INTO user VALUES (?,?,?,?,?)");
			pst.setString(1, userDAO.getUserID());
			pst.setString(2, userDAO.getUserPassword());
			pst.setString(3, userDAO.getUserName());
			pst.setString(4, userDAO.getUserbir_wrap());
			pst.setString(5, userDAO.getUserGender());
			return pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	// 유저 데이터 가져오기
	public UserDAO getUser(String UserID) {
		try {
			PreparedStatement pst = con.prepareStatement("SELECT * FROM user WHERE UserID = ?");
			pst.setString(1, UserID);
			rs = pst.executeQuery();
			if (rs.next()) {
				UserDAO userDAO = new UserDAO();
				userDAO.setUserID(rs.getString(1));
				userDAO.setUserPassword(rs.getString(2));
				userDAO.setUserName(rs.getString(3));
				userDAO.setUserbir_wrap(rs.getString(4));
				userDAO.setUserGender(rs.getString(5));
				return userDAO;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	
	
	
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		this.UserID = userID;
	}
	public String getUserPassword1() {
		return UserPassword1;
	}
	public void setUserPassword1(String userPassword1) {
		this.UserPassword1 = userPassword1;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		this.UserPassword = userPassword;
	}
	public String getUserName() {
		return Username;
	}
	public void setUserName(String userName) {
		this.Username = userName;
	}
	public String getUserbir_wrap() {
		return Userbir_wrap;
	}
	public void setUserbir_wrap(String userbir_wrap) {
		Userbir_wrap = userbir_wrap;
	}
	public String getUserGender() {
		return Usergender;
	}
	public void setUserGender(String userGender) {
		this.Usergender = userGender;
	}
	
}
