// 전달받은 정수만큼 "안녕" 이라는 문자열을 출력하는 메소드. (retrun type : void)


public class HelloRobot {
	public static void printHello(int count) { // int count 라는 정수형 타입의 미지수값을 정해주고
		
		for (int i = 0; i < count; i++) { // i < count 를 통해 count에 입력한 값만큼 문자열을 출력하게정해놓고
			System.out.println("안녕");
		}
	} 
		
	public static void main(String[] args) {
		printHello((int) 6); // printHello 라는 위 메소드를 불러와 ((int)6); 정수를 선언하고 값을정하여 위 printHello의 문자열을 출력한다
		}	
}