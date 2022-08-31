package FAVORITE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.cj.Session;

import MAP.Map;
import USER.UserDAO;
import kr.co.greenart.dbutil.DBUtil;

public class favoriteDAO {
	
	private String userid;
	private String latclick;
	private String pname;
	private String paddress;
	
	
	private Connection con;
	private ResultSet rs;
	private PreparedStatement ps;
	private Statement st;
	

	
	public favoriteDAO() {
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
	
	
	
	/**
     * mapapi 테이블의 모든 레코드 검색하(Select)는 메서드 작성
     * (검색필드와 검색단어가 들어왔을때는 where를 이용하여 검색해준다.)
     **/
	public ArrayList<favoriteDTO> getMemberlist(String keyField, String keyWord){
	       
        ArrayList<favoriteDTO> list = new ArrayList<favoriteDTO>();
       
        try{//실행
           
//            String sql = "select * from favorite where userid ='kch9253'";
            String sql = "select * from favorite ";
//            if(keyWord != null && !keyWord.equals("") ){
//                sql +="WHERE "+keyField.trim()+" LIKE '%"+keyWord.trim()+"%' order by latclick";
//            }else{//모든 레코드 검색
//                sql +="order by latclick";
//            }
//            if(keyWord != null && !keyWord.equals("") ){
//                sql +="WHERE "+keyField.trim()+" LIKE '%"+keyWord.trim()+"%' order by pname";
//            }else{//모든 레코드 검색
//                sql +="order by userid";
//            }
            if(keyWord != null && !keyWord.equals("") ){
                sql +="WHERE "+keyField.trim()+" LIKE '%"+keyWord.trim()+"%' order by userid";
            }else{//모든 레코드 검색
                sql +="order by userid";
            }
            
            System.out.println("sql = " + sql);
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
           
            while(rs.next()){
            	favoriteDTO vo = new favoriteDTO();
               
                vo.setUserid(rs.getString("userid"));
                vo.setLatclick(rs.getString("latclick"));
                vo.setPname(rs.getString("pname"));
                vo.setPaddress(rs.getString("paddress"));
                
               
                list.add(vo);
            }
        }catch(Exception e){           
            System.out.println(e+"=> getMemberlist fail");         
        }finally{          
            DBUtil.closeConn(con);
            DBUtil.closeRS(rs);
            DBUtil.closeStmt(st);
        }      
        return list;
    }  
	
	  /**
     * Mapapi테이블의 모든 레코드 검색하(Select)는 메서드 작성
     */
	public ArrayList<favoriteDTO> getMemberlist(){
	       
        ArrayList<favoriteDTO> list = new ArrayList<favoriteDTO>();
        try{//실행
        	String sql = "select * from favorite";
            ps = con.prepareStatement(sql);
//            rs = st.executeQuery("select * from favorite where userid=?");
//            rs = st.executeQuery("select * from user as A join favorite as B on A.userid = B.userid where B.userid=?");
            rs = ps.executeQuery();
//            rs = st.executeQuery("select * from favorite where userid = 'kch9253'");
           
            while(rs.next()){
            	favoriteDTO vo = new favoriteDTO();
               
            	vo.setUserid(rs.getString("userid"));
                vo.setLatclick(rs.getString("latclick"));
                vo.setPname(rs.getString("pname"));
                vo.setPaddress(rs.getString("paddress"));
               
                   
                list.add(vo);
            }
        }catch(Exception e){          
            System.out.println(e+"=> getMemberlist fail");        
        }finally{          
        	DBUtil.closeConn(con);
            DBUtil.closeRS(rs);
            DBUtil.closeStmt(st);
        }      
        return list;
    }//getMemberlist

	
	
	// 삭제기능
	public int delfavoritelist(String id) {
        int result = 0;
        try {// 실행
 
            ps = con.prepareStatement("delete from favorite where latclick = ?");
            // ?개수만큼 값 지정
            ps.setString(1, id.trim());
            result = ps.executeUpdate();  //쿼리 실행으로 삭제된 레코드 수 반환.
 
        } catch (Exception e) {
            System.out.println(e + "=> delMemberlist fail");
        } finally {
            DBUtil.closeConn(con);
            DBUtil.closeRS(rs);
            DBUtil.closeStmt(st);
        }
        return result;
    }// delMemberlist  



	
	
	
	

	public favoriteDAO(String userid, String latclick, String pname, String paddress) {
		super();
		this.userid = userid;
		this.latclick = latclick;
		this.pname = pname;
		this.paddress = paddress;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getLatclick() {
		return latclick;
	}
	public void setLatclick(String latclick) {
		this.latclick = latclick;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}

	@Override
	public String toString() {
		return "favoriteDAO [userid=" + userid + ", latclick=" + latclick + ", pname=" + pname + ", paddress="
				+ paddress + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
