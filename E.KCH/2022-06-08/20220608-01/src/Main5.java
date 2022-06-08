// 두개의 정수 배열의 합을 가지는 배열을 반환하는 메소드
// 예 ) [1,2,3] [10,11,12,13,14]
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
