// 사용자의 사각형의 밑변과 높이를 정수로 입력
// 사각형의 둘레와 넓이를 출력
import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		System.out.println("사각형 둘레,넓이구하기")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("밑변을 입력하세요: ");
		int length = scanner.netxInt();
		System.out.print("높이을 입력하세요: ");
		int height = scanner.netxInt();
		
		
		
		System.out.println("둘레: " (length + height) * 2);
		System.out.println("넓이: " length * height);
		
	}
}