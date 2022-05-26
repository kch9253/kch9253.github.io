public class Methods {
	// 숫자 하나가 짝수,홀수인지 알고싶음 이기능을 할수있는 메소드 종류
	boolean isEven(int)
	int isEven(int)
	void isEven(int) // void 의 return 값은 먹히지않는다
	char isEven(int)
	
	
	public static int increase(int a) {
		a++;
		return a;
	}
	
	// public static int,int createTwoNumber() { // int int 두개의 메소드를 호출할수없다 하나의 메소드만 호출가능하고 
		// return 20, 30; 						  // return 값도 하나만 정하여 보낼수있다
	// }
	
	public static boolean test() { // 에러가뜨는이유는 리턴하고자하는 값의 타입과 위의 타입값이랑 같아야 한다 boolean = true 이렇게형성
		return 10;			       // return 10; 값을 출력하고싶다면 int 타입으로 메소드를 정해줘야한다
	}							   // 메소드를 여러개 생성하여 메인메소드에 출력하고싶다면 항상 메소드의 타입과 return의 타입값이 일치해야한다
	
	public static void main(String[] args) {
		int a = 10;
		a = increase(a); // () 안에 정수값을 꼭 넣어줘야한다 위 increase ()안에 int a 라는 정수를 선언했기때문
					// Call By Value
		System.out.println(a);
	}
}