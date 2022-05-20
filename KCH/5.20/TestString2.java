


public class TestString2 {
	public static void main(String[] args) {
		String hello = "Hello"; //"" 안에 들어있는 문구는 하나의 케릭터다 // ""안에들어있는 값은 index의 값으로표현된다
								// index의 순서는 숫자로표기되기때문 Hello 순서대로 01234 이다
		
		char h = hello.charAt(0); // 하나의문자를 찾기위한 메소드 
		System.out.println(h);	// charAt 을통해 (0)을 입력하면 0번째의 입력되어있는 문자열을 찾아준다 (2를 입력할경우) l이 출력된다
		System.out.println(hello.charAt(1));
		System.out.println(hello.charAt(2));
		System.out.println(hello.charAt(3));
		System.out.println(hello.charAt(4));	// (-1) 이런식으로 음수의 값을 입력할수없다	
												// hello 의 값은 01234 인데 4 보다 큰값을 넣을경우 에러뜬다
												// 10글자일경우 -1 만하면 0123456789 이런식으로 계산하기쉽다
												// 띄어쓰기도 하나의 인덱스이기때문에 값을가진다 h e l l o 일경우 8개의값이다
												
		int length = hello.length();
		System.out.println(length); // length 의 경우 ""문구안의 값이 몇자리수인지 알려준다
		
	}
}
	
	