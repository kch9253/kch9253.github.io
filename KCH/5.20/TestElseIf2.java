
// 정수 2개와 연산자(문자열 + - * / )등을 입력받아 사칙연산을 수행하는 계산기 프로그램




import java.util.Scanner;
public class TestElseIf2{
	public static void main(String[] args) {
			
		/**계산기**/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요");
		String str1 = scan.nextLine();
		
		System.out.println("사칙연산 기호중 하나를 입력하세요");
		String op = scan.nextLine();
		
		System.out.println("두번째 숫자를 입력하세요");
		String str2 = scan.nextLine();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int num3;
		
		if(op.equals("+")) {
			num3 = num1 + num2;
		}
		else if(op.equals("-")) {
			num3 = num1 - num2;
		}
		else if(op.equals("/")) {
			num3 = num1 / num2;
		}
		else{
			num3 = num1 * num2;
		}
		
		System.out.println(str1 + op + str2 + "=" + num3);
	}
}