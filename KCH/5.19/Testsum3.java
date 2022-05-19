

// 0 ~ 100 사이??

// import java.util.Scanner;

public class Testsum3 {
	public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		
		// 숫자가 0이상'이고' 100이하 인가?     '이거나'는 or 연산자 '이거' 는 end 연산자 
		// 초과,크다는 or 같거나,이거나 는 end
		int number = 33;
		
		// System.out.println(0 <= number); // 한번에 하나씩 밖에 못물어봄  0 <= number 이값을 먼저인식
		// System.out.println(number <= 100); // 이렇게 2번 물어봐야함
		
		System.out.println(0 <= number && number <= 100);
	}
}