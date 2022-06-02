import java.util.*;
class DiceGame {
	
	int diceFace; // 알트+쉬프트+R = 입력된 모든이름을 한꺼번에 변경가능
	int userGuess; // 컨트롤 + 왼클릭 = 원하는 클래스로 이동
	
	private void rollDice() { // 랜덤값을 설정하기위한 코드
		Random random = new Random();
		diceFace = random.nextInt(6) + 1;
	} // private int 값을 넣은이유는 return 값을 사용하기위해
	private int getUserInput(String prompt) { //사용자가 입력하기위한 코드
		System.out.println(prompt); // string 을넣은이유는 밑에 "예상값을 입력" 문구를 넣기위해
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	private void checkUserGuess() {	// 맞고 틀리고를 판별하는 코드
		if (diceFace == userGuess) { // 사용자의 입력값이 내가 설정한 랜덤값과 맞냐 
			System.out.println("맞음");
		} else {
			System.out.println("틀림");
		}			
} // public void 를 쓴이유는 접근제한자를 풀고 메인클래스에 호출하기위해
	public void startPlaying() { // 메인클래스에 사용자의 입력값이 맞냐 틀리냐의 입력값을 전부 출력하기위한 코드
		userGuess = getUserInput("예상값을 입력: ");
		rollDice();
		checkUserGuess();
	}	
}

public class DiceGameTest {
	public static void main(String[] args) {
		DiceGame game = new DiceGame(); 
		game.startPlaying();
	}
}
