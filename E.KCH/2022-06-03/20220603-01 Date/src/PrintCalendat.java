/*

*/
import java.util.*;

public class PrintCalendat {

	

	public static void main(String[] args) {
			
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
	
		System.out.println("�⵵�� �Է��ϼ��� : ");
		int year = sc.nextInt(); //�⵵
		System.out.println("���� �Է��ϼ��� : ");
		int month = sc.nextInt(); //��
		System.out.println("�ϸ� �Է��ϼ��� : ");
		int day = sc.nextInt();
		System.out.println("������ �Է��ϼ��� : ");
		String week = sc.nextLine();

		cal.set(Calendar.YEAR, year); //�Է¹��� �⵵�� ����
		cal.set(Calendar.MONTH, month); //�Է¹��� ���� ����
		cal.set(Calendar.DATE, day);
		cal.set(Calendar.DAY_OF_WEEK , );
//		cal.set(Calendar.DAY_OF_WEEK, week);

		System.out.println("           ����:"+year+"��"+month+"��"+day+"��"+week+ "����");
		System.out.println("   ��    ��    ȭ     ��     ��     ��    ��");

		cal.set(year,month-1,1); //�Է¹��� ���� 1�Ϸ� ����
		                         //month�� 0�� 1���̹Ƿ� -1�� ���ش�
		  
		int end = cal.getActualMaximum(Calendar.DATE); //�ش� �� ������ ��¥
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); //�ش� ��¥�� ����(1:�Ͽ��� �� 7:�����)
		

		for(int i=1; i<=end; i++) {
			if(i==1) {
				for(int j=1; j<dayOfWeek; j++) {
					System.out.print("    ");
				}
			}
			if(i<10) { //���ڸ����� ��� ������ �߰��ؼ� �ٸ��߱�
				System.out.print(" ");
			}
			System.out.print(" "+i+" ");
			if(dayOfWeek%7==0) { //���ٿ� 7�Ͼ� ���
				System.out.println();
			}
			dayOfWeek++;
		}
//		System.out.println("------------");
		

		
		
	}	
}
