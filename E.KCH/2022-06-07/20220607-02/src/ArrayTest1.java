import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		final int STUDENTS = 5 ; // 5번의 입력값을 정해놓기위해 상수값 5를 지정해줬다.
		int total = 0;
		Scanner scan = new Scanner(System.in);
		
		int[] scores = new int[STUDENTS];
		
		for (int i = 0; i < STUDENTS; i++) {
			System.out.println("성적을 입력하세요");
			scores[i] = scan.nextInt();
		}
		
		for (int i = 0; i < STUDENTS; i++) {
			total += scores[i];
		}
		System.out.println("평균성적은" + total / STUDENTS + "입니다");

	}

}
