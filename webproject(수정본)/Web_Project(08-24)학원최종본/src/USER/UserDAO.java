package USER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserDAO {
	private String userid;
	private String userpassword1;
	private String userpassword;
	private String username;
	private String userbirwrap;
	private String usergender;
	private String usernumber;
	
	private Connection con;
	private ResultSet rs;
	private PreparedStatement ps;
	
	public UserDAO() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/webproject";
			String dbID = "kch9253";
			String dbPassword = "ckdgmlek1";
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
	public int login(String userid, String userpassword) {
		try {
			PreparedStatement pst = con.prepareStatement("SELECT userpassword FROM user WHERE userid = ?");
			pst.setString(1, userid);
			rs = pst.executeQuery();
			if (rs.next()) {
				return rs.getString(1).equals(userpassword) ? 1 : 0;
			} else {
				return -2;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	// 아이디 중복여부 확인
	public boolean ID_Check(String userid) {
		try {
			PreparedStatement pst = con.prepareStatement("SELECT * FROM user WHERE userid = ?");
			pst.setString(1, userid);
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
//	// 아이디찾기
	public String findId(String member_name, String member_phone) {
		String mid = null;
		
		try {
			String sql = "select userid from user where username=? and usernumber=? ";
			ps = con.prepareStatement(sql);
			ps.setString(1, member_name);
			ps.setString(2, member_phone);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				mid = rs.getString("userid");
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mid;
	}
	// 비밀번호찾기
	public String findPw(String member_id, String member_name, String member_phone) {
		String mid = null;
		
		try {
			String sql = "select userpassword from user where userid=? and username=? and usernumber=? ";
			ps = con.prepareStatement(sql);
			ps.setString(1, member_id);
			ps.setString(2, member_name);
			ps.setString(3, member_phone);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				mid = rs.getString("userpassword");
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mid;
	}
	
	
	// 회원가입
	/*
	 * -1: 서버오류
	 * 0: 이미 존재하는 아이디
	 * 1: 성공
	 */
	public int join(UserDAO userDAO) {
//		if(!ID_Check(userDAO.getUserID())) return 0;
		
		try {
			PreparedStatement pst = con.prepareStatement("INSERT INTO user VALUES (?,?,?,?,?,?)");
			pst.setString(1, userDAO.getUserID());
			pst.setString(2, userDAO.getUserPassword());
			pst.setString(3, userDAO.getUserName());
			pst.setString(4, userDAO.getUserbir_wrap());
			pst.setString(5, userDAO.getUserGender());
			pst.setString(6, userDAO.getUsernumber());
			
			return pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	// 유저 데이터 가져오기
	public UserDAO getUser(String userid) {
		try {
			PreparedStatement pst = con.prepareStatement("SELECT * FROM user WHERE userid = ?");
			pst.setString(1, userid);
			rs = pst.executeQuery();
			if (rs.next()) {
				UserDAO userDAO = new UserDAO();
				userDAO.setUserID(rs.getString(1));
				userDAO.setUserPassword(rs.getString(2));
				userDAO.setUserName(rs.getString(3));
				userDAO.setUserbir_wrap(rs.getString(4));
				userDAO.setUserGender(rs.getString(5));
				userDAO.setUsernumber(rs.getString(6));
				return userDAO;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	

	
//	public String id_search(String name, String phone){  //이름,핸드폰번호로 찾기
//		  con=cm.getConnection();
//		  ResultSet rs=null;
//		  PreparedStatement pstmt =null; //보안적으로좋다
//		  String user_id=null; //찾을아이디
//		  String sql="select user_id from USERDB_JSH2 where USER_NAME=? and USER_PHONE=?";
//		  
//		  try{
//		   pstmt=con.prepareStatement(sql); //쿼리
//		   pstmt.setString(1, name); //첫번째 ?를 스트링 id로 넣음
//		   pstmt.setString(2, phone); //두번째 ?에 스트링 pw 넣음
//		   
//		   rs=pstmt.executeQuery(); //쿼리를 실행해서 결과값을 rs로 저장
//		   while(rs.next()){ //rs가 끝날때까지 반복
//		    user_id=rs.getString("user_id"); //cnt를 디비에서 가져온 cnt에 저장  
//		   }
//
//		  }catch(Exception e){
//		   System.out.println(e);
//		  }finally{
//		   new DBClose().close(con,pstmt,rs); //디비연결 종료
//		  }
//		  return user_id;
//		 }
	
	
	
	
	
	
	public String getUserID() {
		return userid;
	}
	public void setUserID(String userID) {
		this.userid = userID;
	}
	public String getUserPassword1() {
		return userpassword1;
	}
	public void setUserPassword1(String userPassword1) {
		this.userpassword1 = userPassword1;
	}
	public String getUserPassword() {
		return userpassword;
	}
	public void setUserPassword(String userPassword) {
		this.userpassword = userPassword;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
	}
	public String getUserbir_wrap() {
		return userbirwrap;
	}
	public void setUserbir_wrap(String userbir_wrap) {
		userbirwrap = userbir_wrap;
	}
	public String getUserGender() {
		return usergender;
	}
	public void setUserGender(String userGender) {
		this.usergender = userGender;
	}
	public String getUsernumber() {
		return usernumber;
	}
	public void setUsernumber(String usernumber) {
		this.usernumber = usernumber;
	}
	
	
}
