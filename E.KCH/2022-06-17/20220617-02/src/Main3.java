
public class Main3 {
	public static void main(String[] args) {
		
		try {
			System.out.println("try ��Ͼ�");
			
			System.out.println("����1");
			
			Object o = new Object();
			String s = (String) o; // �ٿ�ĳ���� �߸���
			
			System.out.println("����2");
			
			System.out.println("����3");
			
			
		} catch (Exception e) { // Exception ������ �����ϱ����� �뵵 �߸��Ⱥκ��� ĳġ�ϰ� �����ϱ����� ? �߸��Ⱥκ��� �˷��ֱ����� �뵵
			System.out.println("catch ��Ͼ�");
		} finally { // finally = Ʈ����,ĳġ�ȿ� ���ܰ� �߻��ϴ��� ������ ������ �����Ű�� / �̰��� �׳� ������ ��µ�
					// ĳġ�κп� ���� Exception �ƴ� �ٸ����� ������ ���̳θ��� ������ ����� �� ���ܰ͵��� ������
			System.out.println("finally ��Ͼ�");
		}
		
		System.out.println("���� ����");
	}
}
