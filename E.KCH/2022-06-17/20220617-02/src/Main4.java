
public class Main4 {
	public static void main(String[] args) {
		
		try {
			int left = 10;
			int right = 0;
			
			if (right == 0) {
				// 0���� �������� �� (�������� ��Ȳ)
				// ���� ��� ��������.
				throw new MyZeroDivideException("0���� ������ �������� ��Ȳ�� �߻��߽��ϴ�~~~"); // �����ذ��ϱ����� �θ� �����ڸ� ���� ȣ�Ⱑ���ϴ�.
			} // try �ȿ� �߸��� �κ��� ĳġ�Ͽ� ĳġ�� (e) �� ����.
			
		} catch (MyZeroDivideException e) {
			System.out.println(e.getMessage()); // try�ȿ� �߸��Ⱥκ��� ĳġ�Ͽ� Exception (e) = e �ȿ� ���� e.�ٸ޼����� ���� �� Ʈ��������Ʈ���� �޾Ƽ� ������ش�.
		}
		
		
		
		
		
		
		
		
	}
}
