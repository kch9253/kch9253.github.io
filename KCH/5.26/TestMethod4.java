// public class TestMethod4 {
	 // // 정수 하나를 전달받아 1 ~ 100 사이의 수이면 // 리턴타입 메소드이름(파라미터(개수, 타입, 순서))
	 // public static boolean between (int number) {
		 // if (number >= 1 && number <= 100) {
			 // return true;
		 // } else {
			  // return false;
		 // }		 		
	 // }
	
	
	 
// public static void main(String[] args) {
		 // System.out.println(between(150));
		 // System.out.println(between(50));
		 // System.out.println(between(-50));
		 // System.out.println(between(100));
	 // }
// }

// 사용자가 국어 영어 수학 점수를 입력을 하는데 (사용자 입력값은 1~100 사이여야함) 1~100 사이 잘못입력하면 잘못입력했다고 알려줘야함
// 입력한 점수와 , 점수 합을 출력해보세요 


import java.util.Scanner;

// public class TestMethod4 {
	// public static int between (int number){
		// if (number >= 1 && number <= 100) {
			// return true;
		// } else {
			// return false;
		// }
	// }
	
// public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
	
		// int korean;
		// int english;	
		// int math;	
	
		
		// System.out.print("국어점수입력: " );
		// korean = scan.nextInt();
		// System.out.print("영어점수입력: " );
		// english = scan.nextInt();
		// System.out.print("수학점수입력: " );
		// math = scan.nextInt();
		// int sum = korean + english + math;
		
		// System.out.println("점수의 합은: " + sum);
	// }
// }




// 쌤예시

public class TestMethod4 {
	public static boolean between (int number) {
		if (number >= 1 && number <= 100) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int kor;
		int eng;
		int math;
		
		do {
		System.out.println("국어점수?");
		kor = scan.nextInt();
		} while ( !(between(kor)) );
		
		do {
		System.out.println("영어점수?");
		eng = scan.nextInt();
		} while ( !(between(eng)) );
		
		do {
		System.out.println("수학점수?");
		math = scan.nextInt();
		}while ( !(between(math)) );
		
		int sum = kor + eng + math;
		
		System.out.println("국어점수: " + kor);
		System.out.println("영어점수: " + eng);
		System.out.println("수학점수: " + math);
		
		System.out.println("총합: " + sum);
	}
}