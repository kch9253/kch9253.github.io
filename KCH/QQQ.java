///////////// 마일 > 킬로미터

import java.util.Scanner;

/* public class QQQ {
	public static void main(String args[]) {
		
		double mile;
		
		double km;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("마일을 입력하시오: ");
		
		mile = in.nextDouble();
		
		km = 1.609 * mile;
		
		System.out.println(mile + "마일은" + km "킬로미터");
		
	}
} */



///////////// 잔돈계산


/* public class QQQ {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("현재 보유금액을 입력해주세요");
		int mymoney = scan.nextInt();
		
		System.out.println("지불해야 할 금액을 입력해주세요");
		int pay = scan.nextInt();
		
		int result = mymoney - pay;
		System.out.println("총 거스름돈은" + result + "입니다");
		
		
		int last = result/5000;
		System.out.println("5000원" + last + "장");
		
		last = result % 5000/1000;
		System.out.println("1000원" + last + "장");
		
		last = result % 1000/500;
		System.out.println("500원" + last + "개");
		
		last = result % 500/100;
		System.out.println("100원" + last + "개");
		
		last = result % 100/50;
		System.out.println("50원" + last + "개");
		
		last = result % 50/10;
		System.out.println("10원" + last + "개");
	}
} */



////////////// 구 부피

/* public class QQQ {
	public static void main(String args[]) {
		
		
		double raius = 4;
		double volume = 3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반지름: ");
		radius = sc.nextDouble();
		
		volume = 
		
		
		
	}
} */



///////// 저금통

/* public class QQQ {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int mo1;
		int mo2;
		int mo3;
		int mo4;
		int sum = 0;
		
		System.out.print("500원동전 몇개?");
		mo1=input.nextInt();
		System.out.print("100원동전 몇개?");
		mo2=input.nextInt();
		System.out.print("50원동전 몇개?");
		mo3=input.nextInt();
		System.out.print("10원동전 몇개?");
		mo4=input.nextInt();
		
		sum = (mo1 * 500) + (mo2 * 100) + (mo3 * 50) + (mo4 * 10);
		
		System.out.println("저금통에 있던 돈의 액수는"  + sum +  "원입니다.");
	}
} */
	

/////////// 나눈 몫과 나머지 

public class QQQ {
	public static void main(String[] args) {
	
	    Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오");
		int A = input.nextInt();
		int B = input.nextInt();
		
		System.out.println(A / B);
		System.out.println(A % B);
		
		
		
		
	}	

}

