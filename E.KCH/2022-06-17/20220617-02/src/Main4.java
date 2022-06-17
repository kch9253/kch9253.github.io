
public class Main4 {
	public static void main(String[] args) {
		
		try {
			int left = 10;
			int right = 0;
			
			if (right == 0) {
				// 0으로 나눌려고 함 (예외적인 상황)
				// 보고서 적어서 던질거임.
				throw new MyZeroDivideException("0으로 나누는 예외적인 상황이 발생했습니다~~~"); // 오류해결하기위한 부모를 생성자를 통해 호출가능하다.
			} // try 안에 잘못된 부분을 캐치하여 캐치값 (e) 에 들어간다.
			
		} catch (MyZeroDivideException e) {
			System.out.println(e.getMessage()); // try안에 잘못된부분을 캐치하여 Exception (e) = e 안에 들어가서 e.겟메세지를 통해 위 트라이프린트값을 받아서 출력해준다.
		}
		
		
		
		
		
		
		
		
	}
}
