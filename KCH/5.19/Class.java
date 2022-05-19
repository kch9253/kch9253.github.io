

// 사용자에게 정수 하나를 입력받아서
// 입력 값 -2 ~ +2 범위의 정수를 출력해보세요
// 예) 7 -> 5 6  7  8 9

import java.util.Scanner;

public class Class {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
	    
	
		System.out.println("정수를 입력하세요");
		int a = i.nextInt();
		
	
		
	    
		
		// System.out.println("+정수값");
		// a = i.nextInt();
		
		// a = a++;
		// a = a++;
		
		
		// System.out.println("-정수값");
		// b = i.nextInt();
		
		// b = a--;
		// b = a--;
		
	
        // System.out.println(a);
        // System.out.println(b);			
		
		a = --a;
		System.out.printf("%d %d %d %d %d"
		, --a , ++a , ++a , ++a , ++a);		
	}
}