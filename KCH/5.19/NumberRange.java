import java.util.Scanner;

public class NumberRange {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("-정수 하나입력: ");
		int number = scan.nextInt();
		number -=2;
		System.out.println(number);
		
		System.out.print("+정수 하나입력: ");
		int number1 = scan.nextInt();
		number1 +=2;
		System.out.println(number1);
		
	}
}