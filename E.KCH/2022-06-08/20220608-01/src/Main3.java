import java.lang.reflect.Array;
import java.util.Arrays;

// ������ �迭�� ���޹޾� ���� ������ ���Ұ��� ������ ���� �迭�� ��ȯ�ϴ� �޼ҵ�

public class Main3 {
	
//	public static int[] copyArray(int[] origin) {
//		int[] copy = new int[origin.length];
//		
//		for (int i = 0; i < origin.length; i++) {
//			copy[i] = origin[i];
//		}
//		return copy;
// 	}
	
	// ������ �迭 2���� �������� (���̿� �� ���Ұ�)�� �˼��ִ� �޼ҵ�
	static boolean equals(int[] number , int[] number2) {
		
		
		if (number.length != number2.length) {
			return false;
		}
		for (int i = 0; i < number.length; i++) {
			if(number[i] != number2[i]) {
				return false;
			}
		}
		return true;
	}
	// ------------------------------------------------------------
	
	public static void main(String[] args) {
//		int[] test = {50, 70, 90, 110};
//		int[] c = copyArray(test);
//		System.out.println(Arrays.toString(c));
		
		
	// ������ �迭 2���� �������� (���̿� �� ���Ұ�)�� �˼��ִ� �޼ҵ�
		int[] number = new int[] {10, 20, 30, 40};
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		System.out.println("ù��° ���̰���: " + number.length);
		int[] number2 = new int[] {20, 30, 50};
		for (int i = 0; i < number2.length; i++) {
			System.out.println(number2[i]);
		}
		System.out.println("�ι�° ���̰���: " + number2.length);
		if(equals(number , number2)) {
			System.out.println("�ι迭�� �����ϴ�");
		} else {
			System.out.println("�ι迭�� ���������ʴ�");
		}
	// ------------------------------------------------------------
				
	}
}




// ������ �迭 2���� �������� (���̿� ���Ұ�) �� �˼��ִ� �޼ҵ�  �� ���� {50,70,90,110} ������
//	public static boolean isSame(int[] left, int[] right) {
//		 if (left.length != right.length) {
//			 return false;
//		 }
//		 for (int i = 0; i < left.length; i++) {
//			 if (left[i] !=  right[i]) {
//				 return false;
//			 }
//		 }
//		 
//		 return true;
//	}



