// ��������
public class Main7 {
	public static void someMethod(double d, int... arr) { // ���� �Ķ���� ���� ������ �Է��ϰ������ int... ���� �Ǹ������� �־����
										// double ���� ù��° �� 40�� �԰� , int... �迭�ǰ��� ������ 50,60,70,80 ����Ѵ�
		
		// �ε������� ��ȯ�ϴ¹��
		for (int number : arr) { // : �������� �������� �迭ó�� �������� �������ִ� ��ü�� ����
			 // �귯���� ������ ������ ���������� ������ �ٲܼ�����
			// ó�� ���� ������ ���� Ȯ���Ϸ��� : �� �� ����ġ���� ����
			// ���� �����ϴ� �������� ����ġ���� ����ϴ°��� �����ʴ�  , ���� Ȯ���ϴ� �뵵�θ� ����ϴ°�������.
			// arr[1] = 50; �̷������� ���� �����ϴ°��� �����ʴ�.
			System.out.println(number);
		}
	}
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		
		someMethod(40, 50, 60, 70, 80);
		
//		someMethod(arr);
//		someMethod(new int[] {20, 30, 40, 50, 60}); // someMethod ��� ������ arr ���� �迭�� �¾ƾ��Ѵ�
//		System.out.println("---");
//		someMethod(new int[] {4, 5, 6});
	}
}

	// ���� 2���� ���޹޾� ���� ���ؼ� ��ȯ�ϴ� �޼ҵ�
// 	public static int sum(int a, int b) {
// 		for (int i = 0; i < numbers.length; i++) {
// 			sum += numbers[i];
// 		}
// 		return sum;
// 	}
//
// 	public static void main(String[] args) {
// 		int result = sum(10, 20, 30, 40, 50,);
// 		System.out.println(result);
// 	}