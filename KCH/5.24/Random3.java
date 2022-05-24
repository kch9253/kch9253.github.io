import java.util.Random;
import java.util.Scanner;

// 사용자에게 비번물어보고 동일할경우 통과
// 최대 3번 기회줌


// public class Random3 {
	// public static void main (String[] args) {
		// Scanner scan = new Scanner(System.in);
		// Random random = new Random();
		
		// System.out.println("비밀번호를 입력하세요");
		
		// int ran = random.nextInt(9);
		// ran += 2;
		// int num;
		
		// for (int i = 1; i <= 3; i++) {
			// num = scan.nextInt();
			// if (ran != num * i) {
				// continue;
			// } System.out.println("정답");
		// } System.out.println("틀렸습니다");
	// }
// }
	
	


// Fizz Buzz
// 1 2 (3의 배수는 Fizz) 4 (5의 배수는 Buzz) 7 8 
// 35까지

public class Random3 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		// Random random = new Random();
		
		for (int i = 1; i <=35; i++) {
			System.out.println(i);
			if (i % 3 == 0) {
				System.out.print("Fizz");
			}
		}
		
	
		
		
	}
}


// fibonacci 수열
// 1 1 2 3 5 8 13 21 34 ...
// 100 이하



// public class Random2 {
	// public static void main (String[] args) {
		// Scanner scan = new Scanner(System.in);
		// Random random = new Random();

		
// 사용자가 입력한 정수가 소수임을 확인하여 출력하는 프로그램		



// public class Random2 {
	// public static void main (String[] args) {
		// Scanner scan = new Scanner(System.in);
		// Random random = new Random();
