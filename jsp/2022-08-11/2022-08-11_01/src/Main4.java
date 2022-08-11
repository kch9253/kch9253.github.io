import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main4 {
	public static void main(String[] args) {
//		String line1 = "lowercase";
//		String line2 = "UPPERCASE";
//		String line3 = "1q2w3e";
		
		
//		Pattern p = Pattern.compile("[a-z]{9}"); // a~z 까지 소문자 {9} 범위가 맞을경우 밑에 matches를 통해 참,거짓값 출력가능
//		Matcher m1 = p.matcher(line1); // A-Z 대문자설정하여 line2 의 범위값이 참인지 거짓인지도 가능
//		
//		System.out.println(m1.matches()); // matches = 해당 정규표현식이랑 비교하는 문자열이랑 표현이 일치할때 true 
		
//		Pattern p = Pattern.compile("[0-9a-z]{6}");
//		Matcher m = p.matcher(line3);
//		System.out.println(m.matches());
		
		//아이디는 영소문자와 숫자로 이루어져야하고 최대 10자임 (영문자로 시작해야함).
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디입력하세요");
		 String line4 = scan.nextLine();
		 Pattern p1 = Pattern.compile("^[a-zA-Z]{1}[a-zA-Z0-9_]{4,11}$"); 
		 Matcher m2 = p1.matcher(line4);
		 System.out.println(m2.matches());
		 
		 if (m2.matches()) {
			 System.out.println("유효한 id");
		 } else {
			 System.out.println("올바르지 않은 입력값입니다.");
		 }
		 
		 // 전화번호
		 System.out.println("전화번호 입력하세요 " + "ex) xxx-xxxx-xxxx");
		 String line5 = scan.nextLine();
		 Pattern p2 = Pattern.compile("\\d{3}-\\d{4}-\\d{4}"); 
		 Matcher m3 = p2.matcher(line5);
		 System.out.println(m3.matches());
		 
		 if (m3.matches()) {
			 System.out.println("유효한 id");
		 } else {
			 System.out.println("올바르지 않은 입력값입니다.");
		 }
	}
}
