import java.util.Scanner;

// ���� ���� ���α׷� 
// ��Ϻ���
// ���ݼ����� (��������, �������� ���ð���)
// �о߸� �����ؼ� �ش� �о߸� ����

//1.  �ۺ��λ� / �迵�� / �������� / ����Ҽ� / 12600��
//2. ������������ / ��ȣ�� / ���������� / ����Ҽ� / 12600��
//3. ���ݾ˰��ִ°� �׶��� �˾Ҵ���� / ����ȭ / ������ / ���� / 8100��
//4. �ڽ��� / Į ���̰� / ���̾𽺺Ͻ� / ���� ���� / 16650��
//5. ������ ���� / �迵�� / ���е��� / ������ / 12150��

// -----
// �󼼺���
// ���� ��������
// ���� �����߰�

// �帣���ø�� / �帣������ ���ݰ� �����̸�,�۰����,�������


// �帣�� �Է��ϸ� �ش� �帣��Ͽ� ���õ� å���� , �۰� , ���� , �帣 , ���� �� �߰��ϰ�
// �ݴ�� å���� �Է��ϸ� ������ ������ ���ζ߰��ϴ�
// �迭 ���� ���� , �۰� , ���� , �帣 , ����  �� 5��

public class Main {
	String[] name = new String[5]; // ����
	String[] genre = new String[5]; // �帣
	String[] Writer = new String[5]; // �۰�
	String[] Publishing = new String[5]; // ����
	int[] won = new int[5]; // ����
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("�ش��ȣ�� �Է��Ͽ� �帣�������ϼ���: " + "1.����Ҽ�/" + "2.����/" + "3.���а���/" + "4.������" );
			int number = scan.nextInt();
			System.out.println("------------------------------------------------");
			if (number == 1) {
				System.out.println("����Ҽ� ����Ʈ�Դϴ�.");
				System.out.println("����:�ۺ��λ�");				
			} else if (number == 2) {
				System.out.println("���� ����Ʈ�Դϴ�.");
			} else if (number == 3) {
				System.out.println("���а��� ����Ʈ�Դϴ�.");
			} else if (number == 4) {
				System.out.println("������ ����Ʈ�Դϴ�.");
			} else {
				return;
			} 
		}
		
		
//		System.out.println("�ش��ȣ�� �Է��Ͽ� �帣�������ϼ���: " + "1.����Ҽ�/" + "2.����/" + "3.���а���/" + "4.������");
//		int number = scan.nextInt();
//		for (int i = 0; i < 5; i++) {
//				
//			if (number == 1) {
//				System.out.println("����Ҽ� ����Ʈ�Դϴ�.");
//			} else if (number == 2) {
//				System.out.println("���� ����Ʈ�Դϴ�.");
//			}
//					
//		}
	}	
}
