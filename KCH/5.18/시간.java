//시간 출력
// 3666/3600
// (3666%3600)/60
// (3666%3600)%60

import java.util.Scanner

public class 시간 {
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("몇시냐")
		int a = scan.nextInt(); //최종값
        int B = a / 3600; //시
        int C = (a % 3600) / 60; //분
        int D =	(a % 3600) % 60; //초

        System.out.println(B + "몇시 " + C "몇분 " + D "몇초 ");
	}
}
		