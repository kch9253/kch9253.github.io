// 전달받은 두문자열의 길이값의 합을 반환하는 메소드

public class StringConcatLenght {
	public static int getToalLength (String str1 , String str2) { // 길이값을 구하기때문에 인트를 선언했다
		return str1.length() + str2.length(); // length = 길이값구하는
		// str1,2 를 통해 문자열을 선언해주고 () 필수 ()안에 몇자가 들어갈지 값이 필요하기때문에
	}
	
	
	public static void main (String[] args) {
		int length = getToalLength("abcde", "가나다라");
		System.out.println(length);
		
	}
}