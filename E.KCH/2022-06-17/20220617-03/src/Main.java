public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("사용가능"); // () 인스턴스 안에 생성자 값없이 만들수도있고 안에 문자열을 넣어서 사용도 가능하다.
		sb.append(",One="); // append = 문자열을 붙일수있다 (뒤에붙음) 
		sb.append(1); // 어펜드는 자기자신을 참조한다 2번어펜드는 1번을 참조하고 3번어펜드는 2번을 참조하고 그런식으로
		sb.append(",DoubleValue="); // 어펜드값 그냥 위에서부터 아래로 차례대로 합쳐져서 출력된다고 보면됨.
		sb.append(255.0);
		String result = sb.toString(); // 투스트링을 통해 위 추가로 입력한 어펜트 문자열값들이 전부 합산되어 출력된다.
		System.out.println(result);
		// sb. 은 값변경가능하다 사이추가, 잘라내거나 뭐 등등 
		// sb.reverse(); == 차례대로 입력한 어펜드의 순서를 거꾸로 변경도할수있다 (어펜드안에입력한 값들이 순서만 바뀌어서 출력되는게아니고 안에입력한 입력값자체가 거꾸로 출력된다)
		// 예로들어 마지막 255.0 부터 리버스 값으로 순서변경을 주면 0.552 이런식으로 부터 진행한다
		
		
		
		StringBuffer sbuffer; // 스트링버퍼는 자유분방한 빌더와는 다르게 정격하게 안전하게 출력하기위한 메소드다
		
		
		sb.setCharAt(0 , 'Q');
		sb.insert(0, "시작");
		
//		String str = "원본 문자열";
//		String other = "다른 문자열";
//		// String origin = "원본 문자열";
//		
//		String concat = str + other;
//		System.out.println(concat);
		//System.out.println("원본 문자열 다른 문자열" == concat);
		
		// System.out.println(str == origin);
	}
}
