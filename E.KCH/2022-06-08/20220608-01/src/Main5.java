// �ΰ��� ���� �迭�� ���� ������ �迭�� ��ȯ�ϴ� �޼ҵ�
// �� ) [1,2,3] [10,11,12,13,14]
// [11,13,15,13,14]

public class Main5 {
	
	public static int[] sumArray(int[] left, int[] right) {
		int[] copy;
		int[] target;
		
		copy = left.length > right.length ? copy(left, 0) : copy(right, 0);
		if (left.length > right.length) {
			copy = copy(left, 0);
			target = right;
		} else {
			copy = copy(right, 0);
			target = left;
		}
		
		for (int i = 0; i < target.length; i++) {
			copy[i] += target[i];
		}
		
		return copy;
	}
	
	
	
//		if(left.length > right.length) {
//			int[] copy = copy(left, 0);
//			for (int i = 0 ; i < copy.length; i++) {
//				copy[i] += right[i];
//			}
//			return copy;
//		} else {
//			int[] copy = copy(right, 0);
//			for (int i = 0 ; i < copy.length; i++) {
//				copy[i] += left[i];
//			}
//			return copy;
//		}
//	}
	
	
	
	
	public static int[] copy(int[] arr, int newLength) {
		int[] larger = new int [arr.length + newLength];
		for (int i = 0; i < arr.length; i++) {
			larger[i] = arr[i];
		}
		return larger;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		int [] arr = {10, 20, 30};
		int [] arr2 = {5, 6, 7, 8, 9};
	}
}
