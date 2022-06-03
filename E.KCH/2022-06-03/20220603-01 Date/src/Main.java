import java.time.LocalDate;
import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		// java.util.Calendar = ��¥�� ��Ÿ����
//		Calendar now = Calendar.getInstance();
		// static �� ���� ���� ��ü���ƴϴ�. static ���� Ŭ������ �̸����� ȣ���̰����ϴ�
		// ex) main.staticOO
		// Calendar ������� new Calendar �� ����ϴ°��̾ƴ� ���ν��Ͻ����� �ҷ��;��Ѵ�
		// 1.8 ~~ java.time.LocalDate = 
		// �����ΰ��� ������ �帧���� ���� ������ �������߸� ��밡���ϴ�
		// �����ΰ��� 
		
		
//		System.out.println("����� Ȯ�� : " + Calendar.YEAR);
//		
//		System.out.println(now.get(Calendar.YEAR)); // �̸��� Ŭ������ ���� ������̸� ������ �����ϰ� ����ƽ�� ������ �������ִ� 
//		System.out.println(now.get(Calendar.MONTH) +1); 
//		System.out.println(now.get(Calendar.DAY_OF_MONTH));
//		System.out.println(now.get(Calendar.DAY_OF_WEEK));
//		// ������ �Ͽ��ϱ��� 1�� ������ 2�� �������
		
		LocalDate now = LocalDate.now();
		System.out.println(now.getYear()); // ��� get ������ �ϳ��� ��ü�� �����ִ�
		
		System.out.println(now.getMonth());
		System.out.println(now.getMonthValue());
		
		System.out.println(now.getDayOfMonth());
		
		System.out.println(now.getDayOfWeek());
		System.out.println(now.getDayOfWeek().getValue());
		
	}

}
