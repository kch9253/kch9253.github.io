
public class Main2 {
	public static void main(String[] args) {
		String s = null;
		
		try {
			String local = "��������";
			
			int[] arr = new int[0];
			arr[1] = 10;
			
			int div = 10 / 0; // ������ͽ��� ���ܹ߻� = �ؿ� ĳġ���� �־������ʾұ⶧���� �������� ����Ʈ�� ����̾ƴ� �׳� ��������
			s.equals("asdf");
			
			System.out.println("����ǳ�?"); // ��� ����ȵ�
			
			
			
			
		} catch (NullPointerException e) {
			
			//System.out.println(local); // ���� try {} �ȿ� local ���� ĳġ�� {} �ȿ� �ҷ��ü�����.
 			
			System.out.println("�� ����Ʈ �ͼ��� ó��");
			//e.printStackTrace(); // �̷��� ����Ұ�� NullPointerException ��������� 
		}  catch (ArithmeticException e) { // 10 / 0 �� �������� �������� ArithmeticException �� ���� ����ó���ߴ�
			System.out.println("�� �ͼ��� ó��");
		}  catch (ArrayIndexOutOfBoundsException e) { // ���� arr �迭���� 0���� �������ְ� �迭 1���� �ҷ����� ArrayIndexOutOfBoundsException ������ �װ��� ó���ϱ����� ĳġ��
			System.out.println("�ε��� ����ó��");
		}  catch (Exception e) { // Exception : ��翹�ܸ� ó���ϴ� ��� (�ؿ� �ּ�ó���� ����ó���� ����ؼ� ��� ó���Ҽ�����)
			System.out.println("��翹�ܴ� ���⼭ ����.");
		} // Exception �� ��翹�ܸ� ó���ϴ� ���̶� �ںθ�� �ǰ��̴� �θ��ǰ��� �ǹؿ� ���־� ���α׷� �帧��� ������ �Ʒ��� �������� �������� ĳġ�Ͽ� ����ó���ϴ� ����̴�.  ��Exception �� �׻� �� �ؿ� �־��Ѵ� ���� 
		System.out.println("���� ����");
	}
}
