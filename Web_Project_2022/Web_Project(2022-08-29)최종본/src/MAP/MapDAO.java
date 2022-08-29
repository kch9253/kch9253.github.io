package MAP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import USER.User;
import kr.co.greenart.dbutil.DBUtil;

public class MapDAO {
	private Connection con;
	private ResultSet rs;
	private PreparedStatement ps;
	private Statement st;
	

	
	public MapDAO() {
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
	
	
	
	/**
     * mapapi 테이블의 모든 레코드 검색하(Select)는 메서드 작성
     * (검색필드와 검색단어가 들어왔을때는 where를 이용하여 검색해준다.)
     **/
	public ArrayList<Map> getMemberlist(String keyField, String keyWord){
	       
        ArrayList<Map> list = new ArrayList<Map>();
       
        try{//실행
           
            String sql = "select * from mapapi ";
           
            if(keyWord != null && !keyWord.equals("") ){
                sql +="WHERE "+keyField.trim()+" LIKE '%"+keyWord.trim()+"%' order by latclick";
            }else{//모든 레코드 검색
                sql +="order by latclick";
            }
            System.out.println("sql = " + sql);
            st = con.createStatement();
            rs = st.executeQuery(sql);
           
            while(rs.next()){
            	Map vo = new Map();
               
                vo.setPname(rs.getString(1));
                vo.setPaddress(rs.getString(2));
                vo.setNumber(rs.getString(3));
                vo.setCategory(rs.getString(4));
                vo.setLatclick(rs.getString(5));
                
               
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
	public ArrayList<Map> getMemberlist(){
	       
        ArrayList<Map> list = new ArrayList<Map>();
       
        try{//실행
            st = con.createStatement();
            rs = st.executeQuery("select * from mapapi ");
           
            while(rs.next()){
            	Map vo = new Map();
               
            	vo.setPname(rs.getString(1));
                vo.setPaddress(rs.getString(2));
                vo.setNumber(rs.getString(3));
                vo.setCategory(rs.getString(4));
                vo.setLatclick(rs.getString(5));
                   
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
	public int delMemberlist(String id) {
        int result = 0;
        try {// 실행
 
            ps = con.prepareStatement("delete from mapapi where latclick = ?");
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
}//end
	
	
	
	

