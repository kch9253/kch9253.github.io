public class StaticVariableAndConst3 {
	public static final int NUMBER = 100; // 전역변수 = 변수선언 앞에 static 이있는게 전역변수 // 클래스안에 {} 모든값을 사용할수있는것이 전역변수 / 사용은 쉬우나 모든값을 변수를 주기떄문에 범위가 너무넓고 선언한번 잘못하면 변하면 안되는값도 잘하면 변하기떄문에 잘 사용안하는것이좋다
	// 전역변수를 통한 리스크를 줄이기위해 static final int 를 통한 상수형을 선언하는것이좋다.
	
	public static void test() {
		// NUMBER++;
		System.out.println("테스트메소드에서: " + NUMBER);
	}
	
	public static void main(String[] args) {
		// NUMBER++;
		System.out.println("메인메소드에서: " + NUMBER);
		
		test(); // test 안의 number++ 값이 추가로 불러와졌다 총 number++ 이 2개출력된샘.
		
		System.out.println(Math.PI); 
		
		// double a = Math.abs(-372); // 372라는 값이 abs 안에 들어가 출력된다.
		// System.out.println(a);
		
		double r = Math.random(); // 랜덤으로 실수값들을 출력할수있다
		r = (int) (r * 10); // 실수값의 r 을 정수 int 를 선언하고 r * 1~10000을 입력하여 실수값 * 정수값이 랜덤으로 출력가능하다
		// r 값을 처음에 실수로 선언하고 밑에 추가로 정수를 선언하여 실수와 정수의 합이든 곱이든 그런식으로 활용가능하다 ex) 실수 * 정수
		System.out.println(r);
	}
}