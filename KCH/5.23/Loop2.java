

public class Loop2 {
	public static void main(String[] args) {
		
		// int i = 1;
		
		// while (i <= 10000) {
			// System.out.println(i);
			// i++;
		// }
		
		
		// int i = 20;
		// while (i <= 29) {
			// System.out.println(i);
			// i++;
		// }
		
		
		// int i = 10;
		// while (i >= 0) {
			// System.out.println(i);
			// i--;
		// }
		
		
		// int i = 0; // 배수값구하기
		// while (true) {
			// System.out.println(i);
			// i += 3;
			
		// }
		
		
		// int i = 0;  // 100보다 작은 3의배수
		// while (i < 100) {
			// System.out.println(i);
			// i += 3;
		// }
		
		
		
		int a = 0;
		
		while (a <= 8) { // 홀수 짝수 구분하여 출력되는
			System.out.println( (a % 2 == 0) ? "★" : "☆");
			++a;
		}
	
		
	}
}
