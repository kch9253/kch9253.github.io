// 1. 사용자가 입력한 정수가 0이상이며 7의 배수일때 true 를 출력하세요. 나머지경우는 false

// 2. 사용자에게 3개의 정수를 입력받아 순서대로 입력된 수일 경우 true를 출력하세요. 나머지 경우는 false
// 예) 1 2 3 -> ture , 7 9 10 -> false

// 3. 사용자가 입력한 4자리의 정수가 좌우가 같을때 true를 출력하세요. 나머지 경우는 false
// 예) 1221 -> true, 1557 -> false, 9009-> true


//1번
// import java.util.Scanner;
// public class Testsum4 {
	// public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		
		
		// System.out.print("정수가 0이상이며 7의 배수가 맞나요?");
		// int x = scan.nextInt();
				
		// System.out.println(0 <= x && x % 7 == 0);
		
	// }
// }



//2번

// import java.util.Scanner;
// public class Testsum4 {
	// public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		// System.out.print("정수를 입력하세요");
		// int x = scan.nextInt();
		// int y = scan.nextInt();
		// int z = scan.nextInt();
		
		// // x y z -> true ?
		// // x와 y가 연속된 숫자임이 ture && 
		// // y와 z이 연속된 숫자임이 ture 이면 
		// // x y z은  연속된 숫자가 맞다. 
		 // // 4 5 6    5-4 =1  
		 
		// System.out.println(y - x == 1 && z - y == 1);
	
	// }
// }


// 3. 사용자가 입력한 4자리의 정수가 좌우가 같을때 true를 출력하세요. 나머지 경우는 false
// 예) 1221 -> true, 1557 -> false, 9009-> true


import java.util.Scanner;
public class Testsum4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요");
		int a = scan.nextInt();
		int b = a % 1000 / 100;
		int c = a % 100 / 10;
		int d = a % 10;
		a = a / 1000;
	    
		// 1234 % 10 = 4
		// 1234 % 100 / 10 = 3
		// 1234 % 1000 / 100 = 2
		// 1234 / 1000 = 1
		
		System.out.println(a == d & b == c);
	}
}
