import java.util.Scanner;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import kr.co.greenart.dbutil.DBUtil;

public class BookMain {
	public static void menuPrint() {
		System.out.println("\n=====도서 관리====");
		System.out.println("도서 정보 등록 : 1");
		System.out.println("도서 목록 보기 : 2");
		System.out.println("도서 제목 검색 : 3");
		System.out.println("도서 정보 삭제 : 4");
		System.out.println("도서 정보 수정 : 5");
		System.out.println("도서 주문 신청 : 6");
		System.out.println("도서 관리 종료 : 7");
		System.out.println("==================\n");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		while(true) {
			menuPrint();
			System.out.print("메뉴를 입력하세요> ");
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
				System.out.print("정말 종료하시겠습니까(Y/N)> ");
				String isExit = scanner.nextLine();
				if(isExit.equalsIgnoreCase("y")) {
					System.out.println("도서 관리 프로그램을 종료합니다.");
					BookDAO dao = new BookDAO();
					dao.dbClose();
					System.exit(0);
					break;
				} else if (isExit.equalsIgnoreCase("n")) {
					System.out.println("취소하셨습니다.");
					continue;
				} else {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				} // if, else if, else
			} else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			} // if else
		} // while()
	} // main()
} // class
