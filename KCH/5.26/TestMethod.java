// 문장이 이름 붙이기(메소드)

public class TestMethod { // printRepeat = 메소드이름   main이 없더라도 void 는 필요함 / 이름옆에 () 필수
	public static void printRepeat () { // void main 이라면 밑에 printRepeat(); 가없어도 출력가능한데 main없기때문에 
		// {} = 메소드 몸통 // 메소드를 class 밖으로 빼면 안됨
			for (int i = 0; i < 3; i++) {  // 밑에 따로 printRepeat(); 를통해 호출하여 작동하게 만들었다
			System.out.println("반복 중");
		}
	}
	
	// printHello
	public static void printHello() {		// 몸통 {} 없이 저장하면 에러뜸
		int number = 10;
		System.out.println("Hello");
		System.out.println("초기화한 변수 값: " + number);
	}
	
	public static void main (String[] args) {
		System.out.println("프로그램 시작~");
		
		printHello();
		// System.out.println("헬로안에서 초기화한 변수 값: " + number); //이값을입력시 에러뜨는이유는 위 number값이 범위밖이라 에러뜸
		
		// printRepeat(); // 위에 새로운 클래스 명을 지정해둔 값을 호출하여 작동
						// void main 에 있는 조건값이라면 실행이 가능한데 위 void 값만주고 작동하기위한 조건값을 줘도 작동안함
						// for 을 통해 반복문도 호출할수있다 (위에 for값과 이구간에 for 값을 중복줘서 반복문 가능)
		System.out.println("프로그램 끝~");
	}
}