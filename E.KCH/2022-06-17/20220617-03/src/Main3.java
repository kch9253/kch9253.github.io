
public class Main3 {
	public static void main(String[] args) {
		String longLine = "apple banana carrot dount";
		
//		int first = longLine.length()-12; //
//		System.out.println(first);
//		System.out.println(longLine.charAt(first));
//		int last = longLine.length()-5;
//		System.out.println(last);
//		System.out.println(longLine.charAt(last));
		
		String result = longLine.substring(longLine.length()-12 , longLine.length()-5);
		// 문자열을 자를때 안에 입력된 - 값은 오른쪽에서부터 length 값을 하나하나씩 잘라나간다
		// -12 일경우 longLine 의 마지막 문구인 dount 의 t 부터 시작해서 -1 씩 자리수를 찾아간다
		// -1 은 t , -2은 n -3은 u 이런식이다 == 값을 자른기준으로 그뒤에값들이 출력된다.
		// 예로들어 만약에 -5를 하면 dount 가 다 출력된다. 
		// 인덱스로 값을 찾아 출력하면 각 자리의 값만 하나하나씩 문자가 출력되지만
		// 랭스값으로 자리수를 찾을경우 -12를하면 carrot dount 가 출력되지만 -5를 추가해서 dount 를 잘라줬다.
		// carrot 의 맨앞 c 값은 -12 이고 dount 의 d는 -5이다
	
		System.out.println(result);
	}
}
