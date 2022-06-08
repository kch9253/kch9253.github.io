import java.util.Arrays;

public class Main6 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
//		int[] temp = {40, 50, 60};
		
		Arrays.fill(arr, 100);
		
		System.out.println(Arrays.toString(arr)); // arr 3자리수 값을  전부 100으로 출력한다.
		
		
//		int[] another = Arrays.copyOfRange(temp, 0, 2);
//		System.out.println(Arrays.toString(another));
		
		
		
		
		
		
		int[] copy = Arrays.copyOf(arr, 6); // 6 = 길이값 (늘리고 줄이기가능)
		// (arr, arr.length) 값을 쓸경우 arr 값을 그대로 복사후 출력
		
		System.out.println(Arrays.toString(copy));
		System.out.println(Arrays.equals(arr, copy)); // equlas 는 참,거짓 (arr 과 copy 길이와 원소값이 같아야 참)
	}
}
