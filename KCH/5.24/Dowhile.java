import java.util.Scanner;

public class Dowhile {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		// while (false) {
			// 문장 입력했다 치고
		// }
		
		System.out.println("10을 나눌수 입력");
		
		int num;
	
		do {
			num = scan.nextInt();
			if (num == 0) {
				System.out.println("0으로 나눌수없음");
			}
		
		} while (num == 0); // while () 옆에 ; 세미콜론 필수 꼭 필수
		System.out.println (10 / num);
		
		// do 같은경우 {}안에 무조건 들어간다 (실행한다는뜻) {} 안에있는 값은 무조건 한번은 수행한다 그후에 반복작업을할지 안할지 정한다
		
		// do { // do while 반복실행 == do {}안에 있는 값이여야만 반복을 할지 안할지 딱 정한다 범위 밖의 값이라면 1번만 실행함
			
		// } while (true); // true 를 입력할경우 무한반복 , false 를 넣을경우 한번만 실행
	}
}
