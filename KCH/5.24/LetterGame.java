import java.util.Scanner;
import java.util.Random; // 랜덤이라는 클래스를 출력할시 이값 필수입력

public class LetterGame {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Random 이라는 클래스 역활은 말그대로 랜덤으로 변수값이 생기는역활
		Random random = new Random(); // Scanner 와 비슷한역활 ()안에 값을 입력하여 랜덤값의 최종값을 지정 (정답)
		
		
		int answer = random.nextInt(100); //정답 
		int guess; // 숫자입력
		int tries = 0; // 입력횟수
		
		
		do {
			System.out.print("정답을 추측하여 보시오.");
			guess = scan.nextInt(); // nextInt 는 무조건 정수
			tries++; // 입력횟수가 몇번인지 갯수세는
			
			if (guess > answer) // 정답보다 큰값을 입력했을경우
				System.out.println("제시한 정수가 높습니다");
			if (guess < answer) // 정답보다 낮은값을 입력했을경우
				System.out.println("제시한 정수가 낮습니다");
		} while (guess != answer); // 숫자입력값과 정답이 다를때 다시 수행할수있게 != 를 표시
		
		System.out.printf("축하합니다. 시도 횟수=%d \n" , tries);
	}
	
}