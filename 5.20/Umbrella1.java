
//사용자가 정수를 입력받아
//짝수면 "짝수입니다" 출력하기
// 홀수면 "홀수입니다" 출력하기

import java.util.Scanner;

public class Umbrella1{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// int a = scan.nextInt();
	
		// if (a % 2 == 0) {

			// System.out.println("짝수입니다?");
			
			
		// }
		
		
		
		
		// 쌤예시
		
		
		/* if(조건식) { if 안의 값이 진실 일경우  else 의 입력값은 건너뛰고 다음문장으로간다
			// 문장 1
			// 문장 2
		} */
		 
		/* else { if 안의 값이 거짓일경우 if {}값을 건너뛰고 else {} 안에있는 값이 입력된다
			//문장 3 
			//문장 4
		} */
		
		
		System.out.print("정수를 입력하세요");
		int number = scan.nextInt();
		
		if (number % 2 == 0) {  // if 뒤에는 (){} 형식적으로 필수입력해야함
			System.out.println("짝수입니다.");
		}
		
		// if (number % 3 == 0) { 
			// System.out.println("홀수입니다.");	
		// }
		
		else { // 위 if 홀수입니다 의 다르게 응용한 방법
			System.out.println("홀수입니다.");
		}
		
		
		System.out.println("프로그램종료");	
	}
}