
public class Main {
	public static void main(String[] args) {
		// ������ ���� ������ �迭�� ������
		// 2�ڸ� ���� ������ ����� �ܼ�â�� ����غ�����
		int[] arr = {15, 32, 222, 119, 534, 36, 9, 1234};
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int number = arr[i];
			
			if (number >= 10 && number < 100) {
				count++;
			}
		}
		System.out.println("����: " + count);
		System.out.println("-- ��� --");
		
		for (int i = 0; i < arr.length; i++) {
			int number = arr[i]; 
			if (number >= 10 && number < 100)  {
				System.out.println(arr[i]);
			}
		}
	}
}
