import java.util.Scanner;

class Menu1 {
	public static final int MAX = 10;
}

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		int ord = 10;	//����ڰ� �Է��� �޴��� �����ϴ� ����
		int num = 0;    //�޴��� ������ ������ ����
		int x = 0;      //���ǹ� �ȿ� �� ����, ������ ���� �����ϴ� ����
		int total = 0;  //�� �ݾ�
		
		while(ord != 0) {  //����ڰ� �޴� �Է½� 0�� �Է��� ������ �ݺ�
			System.out.println("�ֹ��Ͻ� �޴��� �Է����ּ���.\n 1.¥���  2.«��  3.������ ");
			ord = Integer.parseInt(sc.nextLine());
			System.out.println("�ֹ��Ͻ� �޴��� ������ �Է����ּ���.");
			num = Integer.parseInt(sc.nextLine());
			
			if(ord == 1) {
				x = 2500;
			} else if(ord == 2) {
				x = 4000;
			} else if(ord == 3) {
				x = 4000;
			} 
			total += x*num;   
			System.out.print("�����Ͻðڽ��ϱ�? 0.����  5.���\n");
			ord = Integer.parseInt(sc.nextLine());		
		}
		System.out.println("�ֹ��Ͻ� �޴��� �� �ݾ��� "+total+"�� �Դϴ�.");
		
		
		
		
	}
}
