import java.util.Scanner;

public class Averager {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int total = 0;
		int count = 0;
		
		while (true) {
			System.out.print("점수를 입력하시오: ");
			int grade = scan.nextInt();
			if (grade < 0) 
				break; // 사용자의 값이 음수로 입력한다면 멈추고 결과값을 내준다 / 위 true 의 무한반복때문에 -1 음수를 통해 결과값내기
			
			total += grade;
			count++;
			
			
		// boolean go = true;              // 위사항과 동일한조건으로 출력
		// while (go) {
			// System.out.print ("점수를 입력하시오: ");
			// int grade = scan.nextInt();
			// go = (grade >= 0);
			
			// total += grade;
			// count++;
		}
		}
		System.out.println("평균은" + total / count);
	}
}