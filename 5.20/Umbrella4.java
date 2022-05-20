
// 3개의 정수를 입력받아
// 가장 큰수를 출력하세요

import java.util.Scanner;

public class Umbrella4{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("세개의 정수를 입력하세요");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		// int sum = a > b && b > c;
		// if (sum) {
		// System.out.println("가장큰수는?: " + sum);
		// }
		
		int max;
		if (a > b) {
			if (a > c) {
		     
				max = a;
			}else {
				max = c;
				}
			}
		}
		    else {
			if (b > c) {
				max = b;
			
			}
			else{
				max = c;
				}
			
			
		}
		System.out.println("가장큰수는: " + max);
	}
}