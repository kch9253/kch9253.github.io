// public class TestMethod2 {
	// //메소드의 이름. 영소문자로 시작. 여러단어가 있으면 다음 단어의 첫번쨰 글자를 대문자로. 이름을 동사로 입력하는것이 좋다
	// public static int sum () { // sum 처럼 메소드이름과 변수이름 동일하게 입력할수있다
		// int a = 10;				// sum () 이렇게 지정한경우 밑에 입력값을 sum 을계속 쓸수가있다 () 안에값을 지정했지만 지정값이없어서
		// int b = 20;				// return type : void (없음) = 뱉어내는게없다
		// int sum = a + b;		// sum 값을 밖으로 출력하고싶을때 뱉어내고자하는 입력값과 동일한 조건의 값을 적어주면된다
		
		// return sum; // 위에 void 대신 int 값만 입력하면 에러가뜬다 이럴경우 return 값; 을 입력하여 
	// }				// return = 반환 / return sum 값을 메인값에 int result = sum(); 값을 만들고 프린트로 출력한다
					// return 값이 있다면 메인에 출력하고싶을때 result 값은 필수적으로 필요하다
					
// // 순서 = 메인이 아닌 메소드에 있는 정수값을 메인에 출력하고싶을때 메소드의 void 값을 int 으로 변경하고 메소드안에 return sum; 값을 지정해준다 그리고 메인메소드에 int result = sum(); 값을 설정해주고 프린트(result); 를 통해 메인메소드에 출력해준다 (메소드 값에서 메인메소드로 값을 불러와서 출력하는 방법)	


// public static void main (String[] args) {
		// System.out.println("시작");
		
		// int result = sum();
		// System.out.println(result);
		
		// System.out.println("끝");
		

	// }
// }




// -------------------------------------------------------------------------------------------

		// pi 메소드 (3.14 실수값을 반환하는 메소드)
		
public class TestMethod2 {
	public static double pi() {
		double pi = 3.14;
		
		return pi;
	}
}	

public static void main (String[] args) {
			double result = pi();
		System.out.println(result);
}	

// -------------------------------------------------------------------------------------------