import java.util.regex.Pattern;

public class Main5 {
	public static void main(String[] args) {
//		Pattern p = Pattern.compile("\\w+"); // 자바에서는 \ 하나만 표현이 불가능해서 \\ 두개를 넣어줘야한다.
		// + 를 적으면 1글자 이상의 값을 원한다.
		// ? 는 0 이거나 1
		// * 0 이상 
		
		// \w = 표현방식 (문자)
		// \d = 표현방식 (숫자)
		// \s = 표현방식 (공백)
		Pattern p = Pattern.compile("\\d?");
	}
}
