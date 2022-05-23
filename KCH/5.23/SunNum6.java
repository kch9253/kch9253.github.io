
// 사용자가 몇개의 정수를 입력할지 먼저 정한후
// 정수를 입력하면
// 합과 평균을 구해서 출력하는 프로그램


import java.util.Scanner;
public class SunNum6 {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		
		
		// System.out.println("정수를 입력하세요.");
		
		// int sum = 0;
		// for (int i = 0; i < 5 ; i++) {
			// int a = scan.nextInt();
			// sum += a;
			
		
			
		// }
		// System.out.println("합: " + sum);
		// System.out.println("평균값: " + sum / 5);
		
		
		
		
		// (쌤예시)
		
		// System.out.println("몇번 ?"); // 정수를 몇번입력할지 지정한다
		// int count = scan.nextInt(); // 카운트라는 미지수의 값을 정해줬다
		
		// int sum = 0;
		// for (int i = 0; i < count; i++) { // 몇번입력할지의 count 값을 i < count 로 지정을했고
			// sum += scan.nextInt(); // sum 은 기본적으로 몇번입력한값의 합산이 나오는출력
			
		// }
		// System.out.println("합: " + sum);
		// System.out.println("평균: " + (sum / count)); // sum 합산의 count를 나눠 평균을 나눈다
		
		
		
		// 짝수 , 홀수의 합 , 평균
		
		System.out.println("정수 몇번입력?");
		int count = scan.nextInt();
		
		int sum = 0;
		int j = sum % 2 == 0;
		int h = sum % 3 == 0;
		for (int i = 0; i < count; i++) {
			sum += scan.nextInt();
			
		}
		System.out.println("짝수의 합: " + (j + sum) );
	}
}