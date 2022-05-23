import java.util.Scanner;

public class Gugudan {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// int a = 1;
		// while (a <= 9) {
			// System.out.printf("%d * %d = %d\n" , 4 , a, 4 * a);
			// a++;
		// }
		
		// 4단말고 사용자의 입력을 받아 원하는 단수의 구구단 출력하는 프로그램
		
		int a = scan.nextInt();
		
		int a = 1;
		while (a <= 9) {
			System.out.printf("%d * %d = %d\n" , 4 , a, 4 * a);
			a++;
		}
		
	}
}