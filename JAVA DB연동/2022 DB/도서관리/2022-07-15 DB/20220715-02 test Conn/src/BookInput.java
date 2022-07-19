import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class BookInput {
	private Scanner scanner;
	public BookInput(Scanner scanner) {
		this.scanner = scanner;
	}
	//���� ���� ��� ���� ȭ��
	public void bookInsertInput() {
		System.out.println("\n���� ���� ��� ȭ���Դϴ�.");
		System.out.print("����� ������ ��ȣ�� �Է��ϼ���> ");
		int num = Integer.parseInt(scanner.nextLine());
		
		BookDAO dao = new BookDAO();
		ResultSet rs = dao.checkNum(num);
		try {
			if(rs.next() == true) {	// �˻� ����� �ִ�.
				System.out.println(num + "�� ������ �̹� ��ϵǾ� �ֽ��ϴ�!");
				System.out.println("�ٸ� ��ȣ�� �Է����ּ���!");
			} else {				// �˻� ����� ���� : ��� ���� �� �߰� ���� �Է¹޴´�. 
				System.out.print("������ �Է��ϼ���> ");
				String title = scanner.nextLine();
				System.out.print("���ǻ縦 �Է��ϼ���> ");
				String company = scanner.nextLine();
				System.out.print("���ڸ� �Է��ϼ���> " );
				String name = scanner.nextLine();
				System.out.print("�ܰ��� �Է��ϼ���> ");
				int cost = Integer.parseInt(scanner.nextLine());
//				System.out.println(num + "\t" + title + "\t" + company + "\t" + name + "\t" + cost); // ����� �������� Ȯ���ϴ� ����
				
				BookDTO dto = new BookDTO(num, title, company, name, cost);
				int succ = dao.insertBook(dto);
				if(succ > 0) {
					System.out.println(num + "�� ���� ������ ��ϵǾ����ϴ�.");
				} else {
					System.out.println(num + "�� ���� ������ ��� �����Ͽ����ϴ�.");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("bookInsertInput() Exception!!!");
		}
	} // bookInsertInput()
	
	// ���� ��� ����
	public void bookSearchAllInput() {
		System.out.println("\n���� ��� ���� ȭ���Դϴ�.");
		ArrayList<BookDTO> list = new ArrayList<>();
		BookDAO dao = new BookDAO();
		list = dao.selectBookAll(list);
		dao.display(list);
	} // bookSearchAllInput()
	
	// ���� ���� �˻�
	public void bookSearchTitleInput() {
		System.out.println("\n���� ���� �˻� ȭ���Դϴ�.");
		System.out.print("�˻��� ������ ������ �Է��ϼ���> ");
		String searchTitle = scanner.nextLine();
		ArrayList<BookDTO> list = new ArrayList<>();
		BookDAO dao = new BookDAO();
		dao.selectBookTitle(list, searchTitle);
		dao.display(list);
	} // bookSearchTitleInput()
	
	// ���� ���� ����
	public void bookDeleteInput() {
		System.out.println("\n���� ���� ���� ȭ���Դϴ�.");
		System.out.print("������ ������ ��ȣ�� �Է��ϼ���> ");
		int num = Integer.parseInt(scanner.nextLine());
		BookDAO dao = new BookDAO();
		ResultSet rs = dao.checkNum(num);
		
		try {
			if(rs.next() != true) { // �ش� ��ȣ�� ������
				System.out.println(num + "�� ������ ��ϵǾ� ���� �ʽ��ϴ�.");
			} else {
				int succ = dao.deleteBook(num);
				if(succ > 0) {
					System.out.println(num + "�� ���������� �����Ǿ����ϴ�.");
				} else {
					System.out.println(num + "�� �������� ������ �����߽��ϴ�.");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("bookDeleteInput() Exception!!!");
		}
	} // bookDeleteInput()
	
	// ���� ���� ����
	public void bookUpdateInput() {
		System.out.println("\n���� ���� ���� ȭ���Դϴ�.");
		System.out.print("������ ������ ��ȣ�� �Է��ϼ���> ");
		int num = Integer.parseInt(scanner.nextLine());
		BookDAO dao = new BookDAO();
		ResultSet rs = dao.checkNum(num);
		try {
			if(rs.next() != true) {
				System.out.println(num + "�� ������ ��ϵǾ� ���� �ʽ��ϴ�.");
			} else {
				System.out.print("������ ������ ������ �Է��ϼ���> ");
				String title = scanner.nextLine();
				System.out.print("������ ������ ���ǻ縦 �Է��ϼ���> ");
				String company = scanner.nextLine();
				System.out.print("������ ������ ���ڸ� �Է��ϼ���> ");
				String name = scanner.nextLine();
				System.out.print("������ ������ �ܰ��� �Է��ϼ���> ");
				int cost = Integer.parseInt(scanner.nextLine());
				BookDTO dto = new BookDTO(num, title, company, name, cost);
				int succ = dao.updateBook(dto);
				if(succ > 0) {
					System.out.println(num + "�� ���������� �����Ǿ����ϴ�.");
				} else {
					System.out.println(num + "�� �������� ������ �����߽��ϴ�.");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("bookUpdateInput() Exception!!!");
		}
	} // bookUpdateInput()
	
	// ���� �ֹ� ��û
	public void bookOrderInput() {
		System.out.println("\n���� �ֹ� ��û ȭ���Դϴ�");
		System.out.print("�ֹ��� ������ ��ȣ�� �Է��ϼ���> ");
		int num = Integer.parseInt(scanner.nextLine());
		BookDAO dao = new BookDAO();
		ResultSet rs = dao.checkNum(num);
		try {
			if(rs.next() != true) { 
				System.out.println("�Է��Ͻ� " + num + "�� ������ ��ϵǾ� ���� �ʽ��ϴ�.");
			} else {
				System.out.print("�ֹ��� ������ ������ �Է��ϼ���> ");
				int cnt = Integer.parseInt(scanner.nextLine());
				
				dao.orderBook(rs, cnt);
				
//				String title = rs.getString("title");
//				int cost = rs.getInt("cost");
//				int price = cnt * cost;
//				
//				DecimalFormat df = new DecimalFormat("��#,##0");
//				String msg = "\n�ֹ��Ͻ� ���� ���� " + title + "�̰�, ";
//				msg += "�ܰ��� " + df.format(cost) + "���̸�, ";
//				msg += "�ֹ� ������ " + cnt + "�� �Դϴ�.";
//				msg += "\n�� �ֹ� �ݾ��� " + df.format(price) + "���Դϴ�.";
//				
//				System.out.println(msg);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("bookOrderInput() Exception!!!");
		}
	} // bookOrderInput()
} // class
