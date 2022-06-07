package first.second;

public class AnotherClass {
	public int number; // 퍼블릭값의 경우 메인폴더에서도 공유가 바로가능하다.
	private int mysecret; 
	int test; // 디폴드 패키지값의 경우 메인폴더에 공유불가하며 같은패키지속에 속한 클래스에서는 공유가 가능하다.
		
}
