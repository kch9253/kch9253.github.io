import java.util.Scanner;

public class Gcd {
	public static void main (String[] args) {
		int x, y, r; // 선언이 , 를 통해 여러개를 적었을땐 정수형 선언이 여러개 필요할때 쓰인다 / int를 3개를 나눠서해도되고 한눈에해도됨
		System.out.print("두개의 정수를 입력하시오(큰수 , 작은수): ");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();
		
		while (y != 0) { // while 은 ()조건을 만족할때까지 반복수행
			r = x % y;
			x = y;
			y = r;
		}
		System.out.printf("최대 공약수는 %d입니다 \n" , x);
	}
}