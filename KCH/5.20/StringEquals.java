
// 문자하나하나가 동일하게 이뤄졌는지 찾는기능
// 문자열의 경우 참조다

public class StringEquals {
	public static void main(String[] args) {
		String a = "hello"; // a 가 "hello" 를 참조한다
		String b = "hello"; // b 의경우도 "hello" 문구가 같기떄문에 hello의 박스를 같이참조한다
		String llo = "llo";
		
		System.out.println(a == b); // 인덱스값을 확인하는게 아닌 참조하는 대상의 "" 같은지를 확인한다
		
		System.out.println(a == ("he" + llo)); // () 안에 he 와 llo 의 거짓이뜨는경우는 he , llo 박스가 각각형성됐기때문
		                                       // 위에 이미 "llo" 의 박스를 형성했기때문
											   // "he" 한박스 llo 한박스
											   // a != 이렇게 물어볼경우 다르기때문에 true 라고뜸
		
		System.out.println("문자열값 동등 확인");
		System.out.println(a.equals("he" + llo)); // .equals == ★ 문자열값이 같은지 확인
												  // .equals 를 넣을경우 a의 전체적인값을 확인하는데 a가 ("he" + llo)안에있는 
												  // 모든 문구를 한글자씩 확인하여 거짓인지 진실인지 판정한다
												  // 박스로 생각하여 튕기지않고 () 자체를 박스로 생각하고 하나하나씩 문자를 찾아낸다
	}
}