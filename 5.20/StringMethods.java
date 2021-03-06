


public class StringMethods {
	public static void main(String[] args) {
		String hello = "hello"; // index 의 경우 못찾으면 그냥 -1 로뜸
		
		int index = hello.indexOf("o"); // 이런식으로 인덱스안에있는 문자를 찾아주는 기능도가능 ("") 찾고자하는 문자를 입력하면됨
		System.out.println(index);	// ★ 무조건 왼쪽부터 찾기시작해서 해당하는 문자의 해당위치를 숫자로 알려줌
		
		int index2 = hello.indexOf("ll"); // 붙어있는 문자의경우 찾을수있지만 eo 이런식으로 문구를 넣으면 못찾는다 값 : -1
		System.out.println(index2);
		
		int index3 = hello.lastIndexOf("l"); // ★ 오른쪽부터 찾는기능
		System.out.println(index3);
		
		int index4 = hello.indexOf("l" , 4); // 이런식으로 시작점을 찍어주고 부터 찾을수있다 "" 뒤에 , 숫자를입력하면
		System.out.println(index4);   //그 숫자의 자리수부터 찾기시작한다 -1 이뜨는이유는 01234 의값은 "o" 이기때문 못찾아서 -1뜸
		
		int notFound = hello.indexOf("a"); //없다는걸 찾아주는기능인데 인덱스는 마이너스 자체를 탑재하지않아 없는 문자의 경우 - 로표기된다
		System.out.println(notFound); 
	}
}