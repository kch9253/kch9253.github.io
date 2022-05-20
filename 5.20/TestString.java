

// (참조형타입)
// 문자열 타입은 String // 보통 퍼블릭 스타틱 밑에 소문자로 시작하는데 참조형타입은 대문자로부터 시작한다
// 대문자를 쓴 이유는 클래스를 불러오기때문

public class TestString {
	public static void main(String[] args) {
		String str; // String 은 타입 str 변수이름 
		str = "Hello world"; // 문자열 타입을 불러오기위해선  String 을 불러와야함
		
		System.out.println(str);
		
		String s2 = "다음문자열"; // 이런식으로도 활용가능
		
		System.out.println(s2);
		
		// String concat = str + "\n" + s2; // 문자를 합해서 표현가능함 
		// System.out.println(concat); // "\n" 을통해 칸띄우기가능
		
		String concat = str + (1 + 2) + "\n" + true + s2 + 3.0; 
		System.out.println(concat); 
		
	}
}