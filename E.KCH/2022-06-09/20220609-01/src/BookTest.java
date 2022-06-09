//package test;
import java.util.Scanner;

//import com.encore.book.Book;
//import com.encore.bookmanager.BookManager;
//import com.encore.magazine.Magazine;

public class BookTest {

	public static void main(String[] args) {// ����å DB
		
		Book Book = new Book();
		String Book1 = new Book1("9788954620512", "���̾�", "�츣�� �켼", "������", 8500.0, "�Ҿ��� ������ ��ġ�� ��ȥ�� �ڼ���");
		Book c = new Magazine("9788954620260", "��� ���е���", "������", "���ƻ��̾�", 8500.0, "�ʵ��л��� ���� �Ѵ޿� �� �� �����ϴ� ���и�ȭ ����", 2020, 3);
		Book d = new Book("9771975252008", "�ð� ����", "�̳���", "���е���", 9900.0, "�� 13ȸ ���е��� ��� ���л� ������");
		Book e = new Magazine("9771228402006", "����21", "������", "����21", 3800.0, "���ѹα��� ��ȭ ���� ����", 2020, 4);
		
		Book[] bs  = {a,b,c,d,e,};
		
		printBooks(bs);
	}
	
	
	public static void printBooks(Book[] bs) {// ��� �޼ҵ�
		
//		BookManager service = new BookManager(100); // ���� �ִ� �����Ǽ��� 100������ ����
		
		// ���� �޼ҵ��� �迭���� �޾ƿ� ����å ��ü���� service�� �ִ� �迭�� �߰���
		for(int i = 0; i < bs.length; i++) {
			service.insertBook(bs[i]);
		}
		
		boolean menu = true; // �޴� ����ġ
		while(menu == true) { // �޴� ����ġ�� �����ִ� ���� ���ѹݺ�
			System.out.println("===============================");
			System.out.println("S ���� ���� ������ ���� �������Դϴ�.");
			System.out.println("1. ������ ��ü ����å ��ȸ");
			System.out.println("2. ������ ����å �߰�");
			System.out.println("3. å ã��");
			System.out.println("4. ��üå ���� �հ� �� ��� ��ȸ");
			System.out.println("===============================");
			
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt(); // �޴� ��ȣ �Է�

			// 1. ������ ��ü ����å ��ȸ
			if(choice == 1) {
				System.out.println("��ü ����å �� "+service.getNumberOfBooks()+"��");
				for(Book b : service.getAllBook()) {
					System.out.println(b);
				}
			}
			
			// 2. ������ ����å �߰�
			else if(choice == 2) {
				// service.insertBook(new Book("9788937460586", "�˴ٸ�Ÿ", "�츣�� �켼", "������", 6300.0, "�켼�� �Ҽ��� ����ȭ�� ��ó�� ����"));
				// service.insertBook(new Magazine("9771227130009", "����", "������", "���̴���", 12000.0, "�����Ͽ��� ���ÿ� ����ǰ� �ִ� �������� ���� ������", 2019, 11));
				System.out.println("ISBN�� �Է��ϼ���."); 
				String isbn = sc.next(); 
				System.out.println("å ������ �Է��ϼ���."); sc.nextLine();
				String title = sc.nextLine();
				System.out.println("�۰��� �Է��ϼ���.");
				String author = sc.nextLine();
				System.out.println("���ǻ縦 �Է��ϼ���.");
				String publisher = sc.nextLine();
				System.out.println("������ �Է��ϼ���.");
				Double price = sc.nextDouble(); sc.nextLine();
				System.out.println("������ ������ �Է��ϼ���.");
				String desc = sc.nextLine();
				System.out.println("�Ϲݵ����̸� true, �����̸� false�� �Է��ϼ���."); 
				Boolean bkOrMaga = sc.nextBoolean();
				if(bkOrMaga.equals(true)) {
					service.insertBook(new Book(isbn, title, author, publisher, price, desc));
				}
				else if(bkOrMaga.equals(false)) {
					System.out.println("�Ⱓ������ �Է��ϼ���.");
					int year = sc.nextInt();
					System.out.println("�Ⱓ���� �Է��ϼ���.");
					int month = sc.nextInt();
					service.insertBook(new Magazine(isbn, title, author, publisher, price, desc, year, month));
				}
				System.out.println("����å�� �߰��Ǿ����ϴ�.");
			}
			
			// 3. å ã��
			else if(choice == 3) {
				System.out.println("===============================");
				System.out.println("� ������� å�� ã�ڽ��ϱ�?");
				System.out.println("1. ISBN���� å ã��");
				System.out.println("2. å �������� å ã��");
				System.out.println("3. ���ǻ�� å ã��");
				System.out.println("4. �������� å ã��");
				System.out.println("5. ��������");
				System.out.println("===============================");
				sc.nextLine();
				int search = sc.nextInt(); 
				if(search == 1) {
					System.out.println("ISBN�� �Է��ϼ���.");
					String isbn = sc.next(); sc.nextLine();
					if(service.searchBook(isbn) == null) System.out.println("��ġ�ϴ� å�� �����ϴ�.");
					else System.out.println(service.searchBook(isbn));
				}
				else if(search == 2) {
					System.out.println("å ������ �Է��ϼ���.");  sc.nextLine();
					String title = sc.nextLine(); 
					int count = 0;
					for(Book b : service.searchBookByTitle(title)) {
						if(b != null) System.out.println(b); 
						else count++;
					}
					if(count == service.searchBookByTitle(title).length) {
						System.out.println("��ġ�ϴ� å�� �����ϴ�.");
					}
				}
				else if(search == 3) {
					System.out.println("���ǻ縦 �Է��ϼ���.");
					String publisher = sc.next();
					int count = 0;
					for(Book b : service.searchBookByPublisher(publisher)) {
						if(b != null) System.out.println(b);
						else count++;
					}
					if(count == service.searchBookByPublisher(publisher).length) {
						System.out.println("��ġ�ϴ� å�� �����ϴ�.");
					}
					
				}
				else if(search == 4) {
					System.out.println("������ �Է��ϼ���.");
					double price = sc.nextDouble(); sc.nextLine();
					int count = 0;
					for(Book b : service.searchBook((double)price)) {
						if(b != null) System.out.println(b);
						else count++;
					}
					if(count == service.searchBook((double)price).length) {
						System.out.println("��ġ�ϴ� å�� �����ϴ�.");
					}
				}
				else if(search == 5) menu = true;
				else System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			
			// 4. ��üå ���� �հ� �� ��� ��ȸ
			else if(choice == 4) {
				System.out.println("��üå ���� �հ� : " + service.getSumPriceOfBooks());
				System.out.println("��üå ���� ��� : " + service.getAveragePriceOfBooks());
			}
			
			// �߸� �Է����� ���
			
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
}