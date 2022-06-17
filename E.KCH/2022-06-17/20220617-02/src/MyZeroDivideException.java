import java.time.LocalTime;

public class MyZeroDivideException extends RuntimeException { //== Exception 는 모든범위의 오류를 캐치하기때문에 좀더 세밀하게 캐치하기위해 새로운 클래스를 만들어 Exception 를 상속받게하여 따로 처리한다. 
	public MyZeroDivideException(String message) {
		super(message + "," + LocalTime.now() + "에 발생하였음"); // 메세지와 시간기능을 추가하여 언제 발생하였다라고 출력하는데
		// 
	}
	

}
