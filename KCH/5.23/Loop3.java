

public class Loop3 {
	public static void main(String[] args) {
		// 0 부터 100사이의 수 중 3의 배수 또는 7의 배수를 출력해보세요
		
		// int a = 0;
		// while (a <= 100 ) {
			// if (a % 3 == 0 || a % 7 == 0) {
				// System.out.println(a);
			// }
		    // a++;
		// }
		
		
		// 0부터 100사이의 수중 일의 자리수가 3.6.9 일때만 출력.
		
		int a = 0;
			
		while (a <= 100) {
			if (a % 10 == 3 || a % 10 == 6 || a % 10 == 9) {
				System.out.println(a);
			}
			a++;
				
		}
	}
}