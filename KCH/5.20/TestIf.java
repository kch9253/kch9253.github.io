

//제어문 = 흐름 / 일렬로 잘 흘러가다가 중간에 새로운 흐름을 체크하기위해 ,생성할수있는

public class TestIf{
	public static void main(String[] args) {
		
		// if(조건식(논리값)) {} = 필수값 ()선 {}후  =  (조건식 (논리값) ) = 진실 혹은 거짓 
		                                  // ()안에 있는값이 진실일경우  {}안에 있는 입력한값들이 제대로 작동한다
										  // () 안에있는 값이 거짓일경우 {}안에있는 내용들을 건너뛰고 {}끝나는 부분뒤로부터 흘러간다
		
		
		
		
		
		boolean condition = true; // 지정해둔 boolean condition 값을 진실로 설정해뒀기때문에 {}안에있는 값이 진실로 정상작동하고
		if (condition) {			// 진실의 {}끝나는 지점 다음 입력값이 작동한다
			System.out.println("조건문 블록 안입니다.") // if (condition) {} 괄호안의 입력값이 맞냐 if-then
		}
		System.out.println("프로그램종료");
	}
}