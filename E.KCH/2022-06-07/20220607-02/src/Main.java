public class Main {
	public static void main(String[] args) {
		int[] aBox; // ������ �迭 ��������. // []�� ����� �ش�Ÿ���� �������������ִ� �Ѱ����ǰ��� �ԷºҰ���
		aBox = new int[4]; // ���̰� 4�� �迭 �ʱ�ȭ // ó���� �迭���� ���صθ� ���� �����Ҽ�����. [] �ȿ� �Է��Ѱ� �״�λ��
		// ���̰��� ���ϴ� ��� ����� Ÿ���� ����Ǿ� ���� �Ұ���
		System.out.println("�迭�� ���̰�: " + aBox.length); 
		
		aBox[0] = 56;
		aBox[1] = 57;
		aBox[2] = 58;
		aBox[3] = 59;
		
		System.out.println(aBox[0]);
		System.out.println(aBox[1]);
		System.out.println(aBox[2]);
		System.out.println(aBox[3]);
	}
}
