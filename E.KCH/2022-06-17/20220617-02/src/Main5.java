import java.time.temporal.UnsupportedTemporalTypeException;
import java.util.Scanner;

public class Main5 {
	public static int divide(int left, int right) throws MyZeroDivideException {
		if (right == 0) {
			throw new MyZeroDivideException("나눌 수 없음");
		} else {
			return left / right;
		}
	}
	
	public static int myFunction() {
		// 아직 미완성
		throw new UnsupportedTemporalTypeException // 개발자들과의 소통역활로 사용할수있음 뭔가 잘못됐거나 미완성된 메소드나 부븐을 호출하고싶을때 그부분에대해 ~~진행중이다 미완성이 알려줄수있음
								("내일만들게. 아직덜만듬");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		myFunction();
		
		
		scan.nextInt();
	}
}

