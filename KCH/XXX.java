// 사용자에게 정수 하나를 입력받아서
// 제곱 값을 출력하는 프로그램

import java.util.Scanner;

public class XXX {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 하나 입력해주세요: ");
		int x = scan.nextInt();
		
		System.out.println("제곱값: " + (x * x));
	}
}