
// 사용자가 입력한 5개의 정수의 합 구하기

import java.util.Scanner;
public class SunNum5 {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("5개의 정수입력");
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int num = scan.nextInt();
			sum += num;
		}
		System.out.println(sum);
	}
}