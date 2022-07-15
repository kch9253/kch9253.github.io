import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class BookDAO {
	private Connection conn = SingleConn.getConn();
	private PreparedStatement ps;
	private ResultSet rs;
	
	// ���� ��ȣ ��ȸ
	public ResultSet checkNum(int num) {
		String sql = "SELECT * FROM tblBook WHERE num = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, num);
			rs = ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("checkNum() Exception!!!");
		}
		return rs;
	} // checkNum()
	
	// ���� ���� ���
	public int insertBook(BookDTO dto) {
		int succ = 0;
		String sql = "INSERT INTO tblBook VALUES(?, ?, ?, ?, ?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, dto.getNum());
			ps.setString(2, dto.getTitle());
			ps.setString(3, dto.getCompany());
			ps.setString(4, dto.getName());
			ps.setInt(5, dto.getCost());
			succ = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("insertBook() Exception!!!");
		}
		return succ;
	} // insertBook()
	
	public ArrayList<BookDTO> selectBookAll(ArrayList<BookDTO> list) {
		String sql = "SELECT * FROM tblBook ORDER BY num ASC";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				int num = rs.getInt("num");
				String title = rs.getString("title");
				String company = rs.getString("company");
				String name = rs.getString("name");
				int cost = rs.getInt("cost");
				
				BookDTO dto = new BookDTO(num, title, company, name, cost);
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("selectBookAll() Exception!!!");
		}
		return list;
	} // selectBookAll()
	
	// ��� �޼���
	public void display(ArrayList<BookDTO> list) {
		if(list.size() == 0) { 
			System.out.println("�˻��� ����� �����ϴ�.");
		} else {
			for (BookDTO dto : list) {
				System.out.print(dto.getNum() + "\t");
				System.out.print(dto.getTitle() + "\t");
				System.out.print(dto.getCompany() + "\t");
				System.out.print(dto.getName() + "\t");
				System.out.print(dto.getCost() + "\n");
			}
		}
	} // display()
	
	// ���� �˻� �޼���
	public void selectBookTitle(ArrayList<BookDTO> list, String searchTitle) {
		String sql = "SELECT * FROM tblBook WHERE UPPER(title) LIKE UPPER(?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + searchTitle + "%");
			rs = ps.executeQuery();
			while(rs.next()) {
				int num = rs.getInt("num");
				String title = rs.getString("title");
				String company = rs.getString("company");
				String name = rs.getString("name");
				int cost = rs.getInt("cost");
				
				BookDTO dto = new BookDTO(num, title, company, name, cost);
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("selectBookTitle() Exception!!!");
		}
	} // selectBookTitle()
	
	// ���� ���� ���� �޼���
	public int deleteBook(int num) {
		int succ = 0;
		String sql = "DELETE FROM tblBook WHERE num = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, num);
			succ = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("deleteBook() Exception!!!");
		}
		return succ;
		
	} // deleteBook()
	
	// ���� ���� ���� �޼���
	public int updateBook(BookDTO dto) {
		int succ = 0;
		String sql = "UPDATE tblBook SET title = ?, company = ?, ";
		sql += "name = ?, cost = ? WHERE num = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getTitle());
			ps.setString(2, dto.getCompany());
			ps.setString(3, dto.getName());
			ps.setInt(4, dto.getCost());
			ps.setInt(5, dto.getNum());
			succ = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("updateBook() Exception!!!");
		}
		return succ;
	}
	
	// ���� �ֹ� �޼���
	public void orderBook(ResultSet rs, int cnt) {
		try {
			String title = rs.getString("title");
			int cost = rs.getInt("cost");
			int price = cnt * cost;
			
			DecimalFormat df = new DecimalFormat("��#,##0");
			String msg = "\n�ֹ��Ͻ� ���� ���� " + title + "�̰�, ";
			msg += "�ܰ��� " + df.format(cost) + "���̸�, ";
			msg += "�ֹ� ������ " + cnt + "�� �Դϴ�.";
			msg += "\n�� �ֹ� �ݾ��� " + df.format(price) + "���Դϴ�.";
			
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("orderBook() Exception!!!");
		}
	} // orderBook()
	
	// DB Close
	public void dbClose() {
		try {
			if(rs != null) rs.close();
			if(ps != null) ps.close();
			if(conn != null) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("dbClose() Exception!!!");
		}
	}
} // class
