import java.util.Arrays;

public class Main4 {
	static void printArray(char[] array) { // ��Ʈ+����Ʈ+R = �ش��ϴ� ���� �� ���� ��������
		for (int i = 0; i < array.length; i++) { // length = �ڸ���
			System.out.print(array[i]);
			
		}
	}

	// �迭�� ��� ���Ҹ� ���ڿ��� ǥ���ؼ� ��ȯ�ϴ� �޼ҵ�
	static String arrayToString(char[] target) {
		String str = "";
		for (int i = 0; i < target.length; i++) {
			str += target[i];
		}
		return str;
	}
	
	// �ɸ��� �迭���� �ϳ��� Ư�� ������ �ε����� ã�� ��ȯ�ϴ� �޼ҵ�
	static int whereIs(char[] target, char c) {
		for (int i = 0; i < target.length; i++) {
			if (target[i] == c) {
				return i; // �� ���ϰ��� char �� ���� ã�������� �����ϱ⶧���� �ؿ� ���ϰ� -1 �� �߰��� �Է��Ѵ�.
			}
		}
		return -1;
	}
	


	public static void main(String[] args) {
		char[] hello = {'H' , 'e' , 'l' , 'l' , 'o' };
		String relust = Arrays.toString(hello); // Arrays.toString = ���ڿ� ��ȯ�ϴ� ������ڵ�
		System.out.println(relust);
		
//		printArray(hello);
//		String result = arrayToString(hello);
//		System.out.println(result);
		
//		for (int i = 0; i < hello.length; i++) {
//			System.out.println(hello[i]);
//		}
		
		
		// �� ���� �迭�� o ���ڿ� �ش��ϴ� �ε����� ã�ƺ���
//		int[] Box = new int[4];
//		System.out.println("l�� �ڸ�����: " + Box.length);
		
//		for (int i = 0; i < hello.length; i++) {
//			if (hello[i] == 'o') {
//				System.out.println("ã��: " + i);
//			}
//		}

		
	}
}
