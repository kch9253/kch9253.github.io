// 1. 사용자가 입력한 정수가 0이상이며 7의 배수일때 true 를 출력하세요. 나머지경우는 false


// import java.util.Scanner;
// public class Testsum4 {
	// public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		
		
		// System.out.print("정수가 0이상이며 7의 배수가 맞나요?");
		// int x = scan.nextInt();
				
		// System.out.println(0 <= x && x % 7 == 0);
		
		
		// number >= 0 && number % 7 == 0 (쌤 예시)
		
	// }
// }



//// 2. 사용자에게 3개의 정수를 입력받아 순서대로 입력된 수일 경우 true를 출력하세요. 나머지 경우는 false
// 예) 1 2 3 -> ture , 7 9 10 -> false


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
		
		
		//(쌤예시)  가운데를 기준으로 왼쪽으로 1만큼 크고 오른쪽으로 -1 값이면됨
		
		
		             // 예를 들어  x++ 를 공백에 추가입력할시 밑에 x 값은 +1이 먹혀서 x값이 바뀐다 
					 //  x y z 가 1 2 3 일경우 x 랑 y 값이 같아진다
					 
					 
		          // y == (x +1) && y == (z -1)         y - 1 == x && y +1 == z   두가지가능
				  // 위 첫번째 예시의경우 관계연산자중 +/*- 이런 부호들이 먼저 적용이 되기때문에 () 를 통해 우선순위를 주는게좋다
				     // == => 이런부호들은 뒤에 붙는것이 맞다
		
		
		//// double int char 등 출력을하고싶을땐 값을 꼭 넣어줘야함 
		// double a; / println(a); 출력불가능 값이없음 / double = 10; println(a); : 10출력가능
		
	
	// }
// }


// 3. 사용자가 입력한 4자리의 정수가 좌우가 같을때 true를 출력하세요. 나머지 경우는 false
// 예) 1221 -> true, 1557 -> false, 9009-> true


// import java.util.Scanner;
// public class Testsum4 {
	// public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		// System.out.print("정수를 입력하세요");
		// int a = scan.nextInt();
		// int b = a % 1000 / 100;
		// int c = a % 100 / 10;
		// int d = a % 10;
		// a = a / 1000;
	    
		
		
		// // 1234 % 10 = 4
		// // 1234 % 100 / 10 = 3
		// // 1234 % 1000 / 100 = 2
		// // 1234 / 1000 = 1
		
		// System.out.println(a == d & b == c);
		
		
		//      % 와 / 를 활용하여 각자리수의 소수점을 뺀 ex)1234의 천,백,십,일 자리수값들을 구해 && 를통해 맞냐 틀리냐를 판정
		
		// (쌤예시)
		// int n = scan.nextInt();
		// int a = n / 1000; // 천의자리수
		// int b = n % 1000 / 100; // 백의자리수
		// int c = n % 100 / 10; // 십의자리수
		// int d = n % 10; // 일의자리수
		
	    //// 문자열로도 가능하다
		
		// System.out.println((a == d) && (b == c));

		
	// }
// }
