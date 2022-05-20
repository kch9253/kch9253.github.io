
// 문자열타입 으로 바꾸는작업

public class IntegerToString {
	public static void main(String[] args) {
		String strNum = String.valueOf (12345); // String.valueOf () 안의 값을 문자로 바꿔준다 ""이 생략해도 문자열로 가능
		System.out.println(strNum); // () 안의값을 실수형으로도 가능
		
		String strNum2 = "" + 12345; // 이런식으로도 가능
		System.out.println(strNum2);
		
		
		// int i = 5055;
		// String strNum2 = "" + i; // 이런식으로 가능
		
		// System.out.println(strNum2.charAt(0));
		
		int i = 5055;
		String strNum3 = "" + i;
		
		System.out.println(i + 100); // 숫자를 더하여 계산한 문구로도 표현가능하다
		System.out.println(strNum3 + 100);
		
	}
}