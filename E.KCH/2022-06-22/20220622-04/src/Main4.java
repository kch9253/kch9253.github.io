import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		Scanner sc = new Scanner(System.in);
		String menu = null;
		String price = null;
		int x = 0;
		int num = 0; // ���� �ֹ�����
		int total = 0; // �ѱݾ�
		
		while(true) {
			System.out.println("��ȣ�� �Է��Ͽ� �������ּ���");
			System.out.println("1.�޴� ���");
			System.out.println("2.�޴��� ���� ����");
			System.out.println("3.�޴��ֹ�");
			System.out.println("4.�� ��");
			System.out.print(">>> ");
			switch (sc.nextInt()) {
			case 1:
				System.out.print("����Ͻ� �޴� �Է� >> ");
				menu = sc.next();
				if(map.containsKey(menu)==true) {
					System.out.println("�̹� ��ϵǾ��ֽ��ϴ�.");
					continue;
				}
				System.out.print("����Ͻ� ���� �Է� >> ");
				price = sc.next();
				map.put(menu, price);
				System.out.println("��ϵǾ����ϴ�.");
				break;
			case 2:
				//------------------------------------------------------------- �޴�����
				Iterator it = map.keySet().iterator();
				if(it.hasNext()==true) {
					while(it.hasNext()) {
						menu = (String)it.next();
						System.out.println(menu+" : "+map.get(menu));
					}
				}else {
					System.out.println("����� �޴��� �����ϴ�.");
					continue;
				}
				// ------------------------------------------------------------
				System.out.println("----------------------------");
				System.out.println("1.���� | 2.���� | 3.������");
				System.out.print(">>> ");
				switch (sc.nextInt()) {
					case 1:
						System.out.println("���� ��� �Ǿ��ִ� �޴��� "+map.keySet()+"�Դϴ�.");
						System.out.print("�����Ͻ� �޴� �Է� : ");
						menu = sc.next();
						if(map.containsKey(menu)==false) {
							System.out.println("�ش� �޴��� ���������ʽ��ϴ�.");
							continue;
						}else {
							System.out.print("�����Ͻ� ���� �Է� : ");
							price = sc.next();
							map.replace(menu, price);
							System.out.println("�����Ǿ����ϴ�.");
							continue;
						}
					case 2:
						System.out.print("�����Ͻ� �޴� �Է� >> ");
						menu = sc.next();
						if(map.containsKey(menu)==false) {
							System.out.println("�ش� �޴��� �����ϴ�.");
						}else {
							map.remove(menu);
							System.out.println("�����Ǿ����ϴ�.");
							continue;
						}
					default:
						System.out.println("�������� ���ư��ϴ�.");
						continue;
					}
			
				
			case 4:
				System.out.println("���α׷� ����!!");
				System.exit(0);
				break;
				
		
			}
		}
	}
}
