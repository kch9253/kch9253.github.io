import java.time.temporal.UnsupportedTemporalTypeException;
import java.util.Scanner;

public class Main5 {
	public static int divide(int left, int right) throws MyZeroDivideException {
		if (right == 0) {
			throw new MyZeroDivideException("���� �� ����");
		} else {
			return left / right;
		}
	}
	
	public static int myFunction() {
		// ���� �̿ϼ�
		throw new UnsupportedTemporalTypeException // �����ڵ���� ���뿪Ȱ�� ����Ҽ����� ���� �߸��ưų� �̿ϼ��� �޼ҵ峪 �κ��� ȣ���ϰ������ �׺κп����� ~~�������̴� �̿ϼ��� �˷��ټ�����
								("���ϸ����. ����������");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		myFunction();
		
		
		scan.nextInt();
	}
}

