import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 정규표현식? = 특정문자열에 대해서 내가원하는 값만 찾아내거나 서식이 맞는지 확인하는 용도
public class Main {
	public static void main(String[] args) {
		String line = "This is a book.";
		Pattern p = Pattern.compile("is");
		Matcher m = p.matcher(line); // Matcher = 패턴객체  (검사하고자하는문장) 넣어줌

//		System.out.println(m.lookingAt()); // lookingAt 은 시작부분이 같냐라고 물어봄 line의 값과 p의 값
		
		boolean find = m.find();
		if (find) { // this 중에 is 를 찾아야하는데 this is 에서 t로 시작해서 01234(공백포함) i를 찾은 시작점 2, s를찾은값 끝 4
			System.out.println(m.start()); // 찾은값의 시작점
			System.out.println(m.end()); // 찾은값의 끝
		}
		
		find = m.find();
		if(find) {
			System.out.println(m.start());
			System.out.println(m.end());
		}
		find = m.find();
		if(!find) {
			System.out.println("읍다");
		}
	}
}
