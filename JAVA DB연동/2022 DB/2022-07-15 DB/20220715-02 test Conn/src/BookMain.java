import java.util.Scanner;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import kr.co.greenart.dbutil.DBUtil;

public class BookMain {
	public static void menuPrint() {
		System.out.println("\n=====���� ����====");
		System.out.println("���� ���� ��� : 1");
		System.out.println("���� ��� ���� : 2");
		System.out.println("���� ���� �˻� : 3");
		System.out.println("���� ���� ���� : 4");
		System.out.println("���� ���� ���� : 5");
		System.out.println("���� �ֹ� ��û : 6");
		System.out.println("���� ���� ���� : 7");
		System.out.println("==================\n");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		while(true) {
			menuPrint();
			System.out.print("�޴��� �Է��ϼ���> ");
			String menu = scanner.nextLine();
			BookInput input = new BookInput(scanner);
			
			if(menu.equalsIgnoreCase("1")) {
				input.bookInsertInput();
			} else if (menu.equalsIgnoreCase("2")) {
				input.bookSearchAllInput();
			} else if (menu.equalsIgnoreCase("3")) {
				input.bookDeleteInput();
			} else if (menu.equalsIgnoreCase("4")) {
				input.bookUpdateInput();
			} else if (menu.equalsIgnoreCase("5")) {
				input.bookSearchTitleInput();
			} else if (menu.equalsIgnoreCase("6")) {
				input.bookOrderInput();
			} else if(menu.equalsIgnoreCase("7")) {
				System.out.print("���� �����Ͻðڽ��ϱ�(Y/N)> ");
				String isExit = scanner.nextLine();
				if(isExit.equalsIgnoreCase("y")) {
					System.out.println("���� ���� ���α׷��� �����մϴ�.");
					BookDAO dao = new BookDAO();
					dao.dbClose();
					System.exit(0);
					break;
				} else if (isExit.equalsIgnoreCase("n")) {
					System.out.println("����ϼ̽��ϴ�.");
					continue;
				} else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					continue;
				} // if, else if, else
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			} // if else
		} // while()
	} // main()
} // class
