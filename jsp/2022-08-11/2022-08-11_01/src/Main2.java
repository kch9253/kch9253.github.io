import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
	public static void main(String[] args) {
		String line = "1 He2llo. 2 Wor4ld! 5"; // 숫자만 찾자
		Pattern p = Pattern.compile("[0-9]"); // [0-9] = 정규식표현식 [] 안에 문자열범위를 설정할수있다 시작0에서 9사이에 숫자로되어있는 문자면 찾아내려고 범위설정함
		Matcher m = p.matcher(line);
		
		m.find();
		System.out.println(m.start());
		m.find();
		System.out.println(m.start());
		m.find();
		System.out.println(m.start());
		m.find();
		System.out.println(m.start());
		m.find();
		System.out.println(m.start());
// 결과값 0,4,10,15,20 		
	}
}
