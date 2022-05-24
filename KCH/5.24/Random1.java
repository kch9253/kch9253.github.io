import java.util.Random;
import java.util.Scanner;
// import java.uitl.*; == 모든 작업가능 이문구하나로 모든 용어생략가능 

// 0 ~ 9 까지의 무작위 수를 정하여
// 사용자가 해당하는 수의 배수를 순서대로 입력하게끔 하여
// 틀릴경우 종료

// 예 ) 랜덤 수가 6일 경우

// 사용자 입력 
// 6 0
// 12 0
// 18 0
// 21 x 종료

public class Random1 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int ran = random.nextInt(8);
		ran += 2;
		int num;
		
		
		
		System.out.println(ran + "의 배수를 입력하세요");
		
		
		for (int i = 1; ; i++) {
			num = scan.nextInt();
			
			if (num != i * ran) {
				break;
			} 
			System.out.println("O");
		}
		System.out.println("종료");
		
		
		
		// 쌤예시
		
		int number = random.nextInt(8) + 2;
		
		System.out.println(number + "배수를 순서대로 입력하세요");
		
		int anwser = 0;
		while (true) {
			anwser += number;
			int userInput = scan.nextInt();
			
			if (anwser != userInput) {
				break;
			}
		}
		System.out.println("종료");
		
	}
}