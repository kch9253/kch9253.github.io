
// 사용자가 입력한 원하는 반복 만큼만 
// 0부터 1씩 증가하는 수를 출력하기

import java.util.Scanner;

public class Gugudan1 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = 0;
		int b;
		System.out.println("정수입력");
		b = scan.nextInt();
		while (a < b) {
			System.out.println(a);
			a++;
		}
	}
}
