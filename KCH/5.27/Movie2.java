// class Movie {
	// String title; // 제목
	// String jum; // 평점
	// String gam; // 감독
	// String year; // 연도
	
	// void print () {
		// System.out.println("(" + title + " \n " + jum + " \n " + gam + " \n " + year + ")");
	// }
// }

// public class Movie2 {
	// public static void main (String[] args){
		// Movie name = new Movie();
		// name.title = "제목 : 악마를보았다";
		// name.jum = "평점 : 100점";
		// name.gam = "감독 : 이병헌";
		// name.year = "개봉날짜 : 2000년개봉";
		// name.print();
	// }
// }

import java.util.Scanner;

class Movie {
	String title; // 제목
	String jum; // 평점
	String gam; // 감독
	String year; // 연도
	
	void printf() {
		System.out.printf("제목: %s \n 평점: %s \n 감독: %s \n 개봉날짜: %s " , title , jum , gam , year);
	}
}


public class Movie2 {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		Movie name = new Movie();
		System.out.println("제목을 입력하세요: ");
		name.title = scan.nextLine();
		System.out.println("평점을 입력하세요: ");
		name.jum = scan.nextLine();
		System.out.println("감독을 입력하세요: ");
		name.gam = scan.nextLine();
		System.out.println("개봉날짜를 입력하세요: ");
		name.year = scan.nextLine();
		name.printf();
	}
}