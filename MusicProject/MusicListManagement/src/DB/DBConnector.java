package DB;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
 
public class DBConnector {
 
    private Connection con = null;
//    private String driverName = "com.mysql.jdbc.Driver";
//    private String dbURL = "jdbc:mysql://192.168.0.20:3306/melon";
//    private String dbUser = "IT";
//    private String dbPassword = "1234";
    private Statement stmt;
    private PreparedStatement pstmt;
    private ResultSet rs;
    
    private ArrayList<Album> data = new ArrayList<>();
	private String driverName;
	private String dbUser;
	private String dbPassword;
	private String dbURL;
        
    public DBConnector() {
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(dbURL, dbUser, dbPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //μμ μΆκ°
    public void insertDB(String name, String date, String singer, String title, String genre, InputStream picture, String picName, int picLength, InputStream music, String musicName, int musicLength){
        try {
            String sql = "insert into album (name, date, singer, title, genre, picname, musicname)"
                    + "values (?, ?, ?, ?, ?, ?, ?)";                    
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, date);
            pstmt.setString(3, singer);
            pstmt.setString(4, title);
            pstmt.setString(5, genre);
            pstmt.setString(6, picName);
            pstmt.setString(7, musicName);
            pstmt.executeUpdate();
            
            sql = "insert into pic (picname, picture, piclength) values (?, ?, ?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, picName);
            pstmt.setBinaryStream(2, picture, picLength);
            pstmt.setInt(3, picLength);
            pstmt.executeUpdate();
            
            sql = "insert into music (musicname, music, musiclength) values (?, ?, ?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, musicName);
            pstmt.setBinaryStream(2, music, musicLength);
            pstmt.setInt(3, musicLength);
            pstmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(pstmt!=null){
                    pstmt.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    
    }
    
    //μμ λͺ©λ‘ λ³΄κΈ°
    public ArrayList<Album> showDB(){
        try {
            String sql = "select a.*, p.picture, p.piclength, m.music, m.musiclength from album a join pic p join music m on a.picname = p.picname and a.musicname = m.musicname";
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                Album ab = new Album();
                ab.setId(rs.getInt(1));
                ab.setName(rs.getString(2));
                ab.setDate(rs.getString(3));
                ab.setSinger(rs.getString(4));
                ab.setTitle(rs.getString(5));
                ab.setGenre(rs.getString(6));
                ab.setPicName(rs.getString(7));
                ab.setMusicName(rs.getString(8));
                ab.setPicture(rs.getBinaryStream(9));
                ab.setPicLength(rs.getInt(10));
                ab.setMusic(rs.getBinaryStream(11));
                ab.setMusicLength(rs.getInt(12));
                data.add(ab);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(rs!=null){
                    rs.close();
                }
                if(stmt!=null){
                    stmt.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return data;
    }
    //μμ κ²μ
    public Album selectDB(int id){
        Album ab = new Album(); 
        try {
            String sql = "select a.*, p.picture, p.piclength, m.music, m.musiclength from album a join pic p join music m on a.picname = p.picname and a.musicname = m.musicname and id="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                ab.setId(rs.getInt(1));
                ab.setName(rs.getString(2));
                ab.setDate(rs.getString(3));
                ab.setSinger(rs.getString(4));
                ab.setTitle(rs.getString(5));
                ab.setGenre(rs.getString(6));
                ab.setPicName(rs.getString(7));
                ab.setMusicName(rs.getString(8));
                ab.setPicture(rs.getBinaryStream(9));
                ab.setPicLength(rs.getInt(10));
                ab.setMusic(rs.getBinaryStream(11));
                ab.setMusicLength(rs.getInt(12));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(rs!=null){
                    rs.close();
                }
                if(stmt!=null){
                    stmt.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return ab;
    }
    //μμ μμ 
    public void updateDB(int id, String name, String date, String singer, String title, String genre, String picName, InputStream picture, int length, String musicName, InputStream music, int musicLength){
        try {
            String sql = "update album set name=?, date=?, singer=?, title=?, genre=?, picname=?, musicname=? where id=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, date);
            pstmt.setString(3, singer);
            pstmt.setString(4, title);
            pstmt.setString(5, genre);
            pstmt.setString(6, picName);
            pstmt.setString(7, musicName);
            pstmt.setInt(8, id);
            pstmt.executeUpdate();
            
            sql = "update pic set picture=?, piclength=? where picname=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setBinaryStream(1, picture, length);
            pstmt.setInt(2, length);
            pstmt.setString(3, picName);
            pstmt.executeUpdate();
            
            sql = "update music set music=?, musiclength=? where musicname=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setBinaryStream(1, music, musicLength);
            pstmt.setInt(2, musicLength);
            pstmt.setString(3, musicName);
            pstmt.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(pstmt!=null){
                    pstmt.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }        
    }
    //μμ μ­μ 
    public void deleteDB(int id){
        try {
            String picName = null;
            String sql = "select picname from album where id="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            if(rs.next()){
                picName = rs.getString(1);
            }
            
            String musicName = null;
            sql = "select musicname from album where id="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            if(rs.next()){
                musicName = rs.getString(1);
            }    
            
            sql = "delete from album where id=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            
            sql = "delete from pic where picname=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, picName);
            pstmt.executeUpdate();
            
            sql = "delete from music where musicname=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, musicName);
            pstmt.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(pstmt!=null){
                    pstmt.close();
                }
                if(rs!=null){
                    rs.close();
                }
                if(stmt!=null){
                    stmt.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
