// 사용자가 3대 측정
// 벤치 , 스쿼트, 데드
// 합이 500이상이면 진실
// 500아니면 거짓

import java.util.Scanner;

public class Testsum2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// // System.out.print("3대 500이상 침?");
		// // int x = scan.nextInt();
		// // x = 500;
		// // System.out.print("3대 500이상 침?");
		// // int y = scan.nextInt();
		// // y = 500;
		
		// System.out.println("3대 500이상 가능?" + x >= 500);
		// int x = scan.nextInt();
		// x = 500;
		// System.out.println("3대 500이상 가능?" + y >= 510);
		// int y = scan.nextInt();
		// y = 500;
		
		System.out.print("벤치, 스쿼트, 데드 순으로 3번입력해주세요");
		int bench = scan.nextInt();
		int squat = scan.nextInt();
		int dead = scan.nextInt();
		
		int sum = bench + squat + dead;
		System.out.println(500 <= sum);
	}
}