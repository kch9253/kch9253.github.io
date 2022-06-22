import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ConsolePresenter {
	private DiaryManage manager;
	public ConsolePresenter() {
		manager = new DiaryManageImpl();
	}
	public void start() {
		while (true) {
			menu();
			Scanner scan = new Scanner(System.in);
			int number = scan.nextInt();
	
			switch (number) {
			case 1:
				add();
				break;
			case 2:
				list();
				break;
			case 3:
				edit();
				break;
			case 4:
				delete();
				break;
			default:
				System.out.println("���� �޴�");
			}
		}
	}
	
	public void menu() {
		System.out.println("�޴�");
		System.out.println("1��. �߰�, 2��. ���, 3��. ����, 4��. ����(������ ��)");
	}
	
	public void add() {
		Scanner scan = new Scanner(System.in);
		System.out.println("��¥? yyyy-MM-dd ��)2022-06-21");
		String date = scan.next();
		System.out.println("����?");
		String title = scan.next();
		System.out.println("����?");
		String weather = scan.next();
		System.out.println("����?");
		String content = scan.next();
		
		LocalDate day = LocalDate.parse(date);
		new Diary(day, title, weather, content);
		
		manager.add(new Diary(day, title, weather, content));
	}
	
	public void list() {
		System.out.println("-�ϱ� ���-");
		List<Diary> list = manager.list();
		for (Diary d : list) {
			System.out.println(d);
		}
	}
	
	public void edit() {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ��¥?");
		String date = scan.next();
		LocalDate day = LocalDate.parse(date);
		
		System.out.println("����?");
		String content = scan.next();
		
		manager.edit(day, content);
	}
	
	public void delete() {
		manager.deleteFirst();
		System.out.println("���� �Ǿ����ϴ�");
	}
}
