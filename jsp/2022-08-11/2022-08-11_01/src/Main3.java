import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {
	public static void main(String[] args) {
		String line = "123 He234llo. 39 Wor48ld! 57"; // 숫자 덩어리 찾자
		Pattern p = Pattern.compile("[0-9]{2,3}"); //우측에 중괄호안에 길이값을 넣을수있다 {2는 인덱스값 012 인 숫자를 찾아줌}
		Matcher m = p.matcher(line); // 0-9가 한글자의 범위고 2,3이 글자범위중 몇자리수 글자인지를 찾는지
		
		m.find();
		System.out.println(m.start());
		System.out.println(m.end());
		
		m.find();
		System.out.println(m.start());
		System.out.println(m.end());
		// 결과값 0,2 
		// 0의 인덱스값이 123이고 2의 인덱스값이 234 이다
	}
}
