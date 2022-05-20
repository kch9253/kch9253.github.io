// 사용자의 학점
// 점수를 입력받아
// 90점 이상 ~ A
// 80점 이상 90점 미만 B
// 70점 이상 80점 미만 C
// 60점 이상 70점 미만 D
// 60점미만 F

import java.util.Scanner;
public class TestElseIf1{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// System.out.println("점수를 입력하세요");
		// int a = scan.nextInt();
		
		
		// String size;
		// if (a >= 90) {
			// size = "A";
		// } else if (a >= 80) {
			// size = "B";
		// } else if (a >= 70) {
			// size = "C";
		// } else if (a >= 60) {
		    // size = "D";			
		// } else { size = "f";
			
		// }
		// System.out.println(size);
		
		
		// (쌤 예시)
		
		System.out.println("점수를 입력하세요");
		int score = scan.nextInt();
		
		char grade;
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("학점은: " + grade);
	}
}