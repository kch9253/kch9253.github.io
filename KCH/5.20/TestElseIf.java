
// 컵 사이즈 알려주기 
// 사용자의 정수를 입력받아서 
// 200 이상이면 large
// 100 이상 ~ 200미만 medium
// 100 미만 small

import java.util.Scanner;
public class TestElseIf{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cup = 250;
		
		String size;
		if (cup >= 200) {
			size = "large";
		} else if (cup >= 100) { // else 에서 if 를 붙여 if 의 기존조건을 한번더 물어볼수있다
			size = "medium";
		} else {
			size = "small";
		}
		System.out.println(size);
		
		
		
		
		if (조건식) {  // 3가지 조건중 무조건 하나라도 실행되는건아니다 전부 거짓이면 작동안함
			 
		} else if (다른 조건식) {
			
		} else if (다른 조건식) {     
			 
		}
		
		
	}
}