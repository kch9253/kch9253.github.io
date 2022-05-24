import java.util.Scanner;

public class Factorial {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long fact = 1; // 팩토리얼의 값은 길기때문에 long 변수사용
		int n;
		
		System.out.printf("정수를 입력하시오:");
		n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.printf("%d!은 %d입니다. \n" , n , fact); // !은 값이 5라면 1x2x3x4x5 의 값 
	}
}