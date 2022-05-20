
// 정수 2개를 입력 받아서 큰수에서 ~ 작은수로 나눈 몫과 나머지를 출력

import java.util.Scanner;

public class Umbrella3{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두개의 정수를 입력하세요");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int div;
		int mod;
		if (a != 0 && b != 0) {
				if (a > b){ //// 큰수
					// a/ b , a % b 계산하기
				div = a / b ;
				mod = a % b ;
				}
				else { /// 작은수
					// b / a , b % a 계산하기
				div = b / a ;
				mod = b % a ;
				}
				System.out.println("몫: " + div);
				System.out.println("나머지: " + mod);
				}
		else {
			System.out.println("0을 입력하면안됨");
		}
		
		
		
	}
}