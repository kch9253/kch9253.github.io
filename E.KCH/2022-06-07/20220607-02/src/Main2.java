// ���̰� 5�� ���� int �� �迭�� ���� �ʱ�ȭ�ϰ�
// ��� ������ ���� 100���� �����غ�����.


public class Main2 {

	public static void main(String[] args) {
		int[] aBox; //ó������ �ʱ�ȭ�� �����ְ�
		aBox = new int[5]; // �ʱ�ȭ�Ѱ��� �ҷ��ͼ� �ڸ����� �������ش�
		
		System.out.println("�迭�� ���̰�: " + aBox.length); 
		
//		aBox[0] = 100; // ���� �����Ѱ��� 5�� �׻� 0���� �����ϱ⶧���� -1 ������ ������Ѵ�.
//		aBox[1] = 100;
//		aBox[2] = 100;
//		aBox[3] = 100;
//		aBox[4] = 100;
		
		for (int i = 0; i < aBox.length; i++) {
			aBox[i] = 100;
		}
		
		for (int i = 0; i < aBox.length; i++) {
			System.out.println(i + "��° index�� ���Ұ�: " + aBox[i]);
		}
		
		
		
//		System.out.println(aBox[0]);
//		System.out.println(aBox[1]);
//		System.out.println(aBox[2]);
//		System.out.println(aBox[3]);
//		System.out.println(aBox[4]);

	}

}
