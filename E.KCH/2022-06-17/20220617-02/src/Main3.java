
public class Main3 {
	public static void main(String[] args) {
		
		try {
			System.out.println("try 블록안");
			
			System.out.println("문장1");
			
			Object o = new Object();
			String s = (String) o; // 다운캐스팅 잘못함
			
			System.out.println("문장2");
			
			System.out.println("문장3");
			
			
		} catch (Exception e) { // Exception 오류를 보고하기위한 용도 잘못된부분을 캐치하고 수정하기위한 ? 잘못된부분을 알려주기위한 용도
			System.out.println("catch 블록안");
		} finally { // finally = 트라이,캐치안에 예외가 발생하던지 말던지 무조건 실행시키는 / 이값은 그냥 무조건 출력됨
					// 캐치부분에 값이 Exception 아닌 다른값이 들어가더라도 파이널리는 무조건 실행됨 그 예외것들은 에러뜸
			System.out.println("finally 블록안");
		}
		
		System.out.println("정상 종료");
	}
}
