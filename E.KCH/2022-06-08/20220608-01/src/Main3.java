import java.lang.reflect.Array;
import java.util.Arrays;

// 정수형 배열을 전달받아 같은 길이의 원소값을 가지는 정수 배열을 반환하는 메소드

public class Main3 {
	
//	public static int[] copyArray(int[] origin) {
//		int[] copy = new int[origin.length];
//		
//		for (int i = 0; i < origin.length; i++) {
//			copy[i] = origin[i];
//		}
//		return copy;
// 	}
	
	// 정수형 배열 2개가 동일한지 (길이와 각 원소값)을 알수있는 메소드
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
		
		
	// 정수형 배열 2개가 동일한지 (길이와 각 원소값)을 알수있는 메소드
		int[] number = new int[] {10, 20, 30, 40};
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		System.out.println("첫번째 길이값은: " + number.length);
		int[] number2 = new int[] {20, 30, 50};
		for (int i = 0; i < number2.length; i++) {
			System.out.println(number2[i]);
		}
		System.out.println("두번째 길이값은: " + number2.length);
		if(equals(number , number2)) {
			System.out.println("두배열은 동일하다");
		} else {
			System.out.println("두배열은 동일하지않다");
		}
	// ------------------------------------------------------------
				
	}
}




// 정수형 배열 2개가 동일한지 (길이와 원소값) 을 알수있는 메소드  위 메인 {50,70,90,110} 에대한
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



