import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("���α׷�����");
		Scanner scan = new Scanner(System.in);
		
	try { // ����ó���Ұ��� (���׿� ���ܴ� �����ؼ� ���α׷� ó���ؾ��Ѵ�)
		System.out.println("���ʼ� �Է�?");
		int left = scan.nextInt();
		System.out.println("������ �Է�?");
		int right = scan.nextInt();
		
		if (right != 0) {
			System.out.println("������ : " + (left / right));
		} else {
			System.out.println("�и� 0�� �Է��Ҽ������ϴ�.");
		}
	} catch (InputMismatchException e) { //== InputMismatchException : ���ܸ� ó���ϱ����� �ҷ���
		System.out.println("���ڸ� �Է��ؾ��մϴ�."); // ���� ��ĳ���Է°��� ���ڷ� �����ص״µ� ���� ���ڸ� �Է��Ұ�� �������� ��Ȳ�� ��ȸ�ϱ����� �����ص� / ���ڸ� �ٽ��Է��ض� ��� ����
		// ���� left �� ���ڸ� �Է��ϰ� right �� ���ڸ� �Է�������� catch �� �ٽ� right �� ���ư���
		System.out.println(e.getMessage()); // ���ܰ��� ���� �޼�����°���
		e.printStackTrace(); // ���ܰ� �߻��� ��θ� �ܼ�â�� ����ϴ� �޼ҵ�
	} 
		System.out.println("���α׷� ����");
		
		
		// �� �Է°��� ���ܰ� ������ִºκ��� ĳġ�Ѵ�
		
//		try { // try catch = ����ó��
//			// ���α׷� �帧���� = try (�����۵��Ѵ�? �׷� catch �ǳʶٰ� �ؿ� �ִ� ������ �帧�� �̾��)
//		} catch(����Ÿ��) {
//			// catch = ���ܸ� ó���ϴ� ���� (���ܸ� ó���ϰ� �������� ���������� �帧�� �̾��)
//		}
				
	}
}

// Exception int thread "main" = �ܼ�â�� ���������� (Exception)= ����
// ArithmeticException = ������ ��������
// ���̾ȵŴ� �Է°��� �־� ���������� if ���� ���ǰ��� �־��༭ ������ �����ټ��ִ�. (���ܹ��� ����)


