import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("프로그램시작");
		Scanner scan = new Scanner(System.in);
		
	try { // 예외처리할거임 (버그와 예외는 구별해서 프로그램 처리해야한다)
		System.out.println("왼쪽수 입력?");
		int left = scan.nextInt();
		System.out.println("오른쪽 입력?");
		int right = scan.nextInt();
		
		if (right != 0) {
			System.out.println("나눈몫 : " + (left / right));
		} else {
			System.out.println("분모에 0을 입력할수없습니다.");
		}
	} catch (InputMismatchException e) { //== InputMismatchException : 예외를 처리하기위해 불러옴
		System.out.println("숫자를 입력해야합니다."); // 위에 스캐너입력값이 숫자로 설정해뒀는데 만약 문자를 입력할경우 예외적인 상황을 우회하기위해 설정해둠 / 숫자를 다시입력해라 라는 예외
		// 만약 left 에 숫자를 입력하고 right 에 문자를 입력했을경우 catch 는 다시 right 로 돌아간다
		System.out.println(e.getMessage()); // 예외값에 대한 메세지출력가능
		e.printStackTrace(); // 예외가 발생한 경로를 콘솔창에 출력하는 메소드
	} 
		System.out.println("프로그램 종료");
		
		
		// 위 입력값중 예외가 생길수있는부분을 캐치한다
		
//		try { // try catch = 예외처리
//			// 프로그램 흐름문장 = try (정상작동한다? 그럼 catch 건너뛰고 밑에 있는 값으로 흐름을 이어간다)
//		} catch(예외타입) {
//			// catch = 예외를 처리하는 문장 (예외를 처리하고 블럭밖으로 정상적으로 흐름을 이어간다)
//		}
				
	}
}

// Exception int thread "main" = 콘솔창에 오류가뜰경우 (Exception)= 예외
// ArithmeticException = 오류가 생긴이유
// 말이안돼는 입력값을 넣어 오류현상을 if 같은 조건값을 넣어줘서 오류를 없애줄수있다. (예외문을 통해)


