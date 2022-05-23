

import java.util.Scanner;

public class OnelineIf{
	public static void main(String[] args) {
		boolean con = true;
		
		// if (con) { // if 와 else 수행해야할 문장이 한줄일경우 {} 을 전부생략해도된다. (무조건 한문장일경우에만 {} 생략가능)
			// // 괄호를 생략하고 한줄로 전부 표기하여도된다 if (con) {입력}; else {입력}; 이런식으로
			// System.out.println("참일 경우 실행할 문장");
		// } else {
			// System.out.println("거짓일 경우 실행할 문장");
		// }
		
		// System.out.println("프로그램종료");
		
		
		
		String result = (con) ? "참" : "거짓"; // ?=삼항연산자 : 기준으로 참일경우 왼쪽값을 선택 , 거짓일경우 오른쪽값을 선택하여 나타남
		// 위의 con 값을 참으로 설정해뒀기때문에 ? "참" : "거짓" 중 왼쪽값을 선택하여 참의 결과가 나온다
		// ?= 삼항연산자는 무조건 두가지조건에서 한가지만 선택가능하다 3가지 이상부터 조건의값을 참인지 거짓인지 판별불가능.
		// 문자,정수 등 모두 가능하다
		// int result = (con) ? 100 : -100; int 를 사용하여 활용가능
		System.out.println(result);
		
		// (con) ? System.out.println("참 출력") : System.out.println("거짓출력"); // 이런식으로 프린트출력으로도 가능
		
		System.out.println("프로그램종료");
	}
}

