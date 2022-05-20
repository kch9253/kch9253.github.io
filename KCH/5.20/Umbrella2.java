

// 사용자의 점수(정수형)을 입력받아
// 60점 이상이면 "합격" 출력
// 60점 미만이면 "불합격" 출력 문자열과 부족한 점수도 같이출력

import java.util.Scanner;

public class Umbrella2{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// System.out.print("점수를 입력하세요");
		// int number = scan.nextInt();
		
		// if (number >= 60){
			// System.out.println("합격입니다");
		// }
		
		// else {
			// System.out.println("불합격입니다");
			// System.out.println(60 - number);
		// }
	

	
		// 쌤예시
		
		System.out.println("점수? ");
		int score = scan.nextInt();
		
		// 60점 이상
		if (score >= 60) {
		System.out.println("합격");
		}
		//60점 미만 
		else { 
		System.out.println("불합격");
		// System.out.println("부족한점수는" + (60 - score));
		System.out.printf("부족한점수는: %d", 60 - score); // 위입력값의 똑같은 값 
		}
		
	}
}