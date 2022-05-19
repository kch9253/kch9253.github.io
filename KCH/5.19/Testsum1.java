
// 사용자가 입력한 정수가
// 짝수면 ture
// 홀수면 false를 출력해보세요

import java.util.Scanner;

public class Testsum1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.print("짝수를입력하세요");
		int x = scan.nextInt();
		
		System.out.println(x % 2 == 0);
	
		
		
	}
}