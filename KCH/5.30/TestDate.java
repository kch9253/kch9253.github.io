// class Weather {
	// String year; // 연도
	// String month; // 월
	// String jan; // 일

	// void print() {
		// System.out.println("(" + year + "-" + month + "-" + jan + ")");
		// System.out.println("(" + month + "/" + jan + "/" + year + ")");
	// }
// }

// public class Weather2 {
	// public static void main (String[] args) {
		// Weather name = new Weather();
		// name.year = "2022";
		// name.month = "05";
		// name.jan = "27";
		// name.print();
		
	// }
// }

// import java.util.Scanner;

// class Weather {
	// String year;
	// String month;
	// String jan;
	// void printf() {
		// System.out.printf(" %s년-%s월-%s일 " , year , month , jan);
	// }
	
// }

// public class Weather2 {
	// public static void main (String[] args) {
		// Scanner scan = new Scanner(System.in);
		// Weather name = new Weather();
		// name.year = scan.nextLine();
		// name.month = scan.nextLine();
		// name.jan = scan.nextLine();
		// name.printf();
	// }
// }





// 쌤예시

public class Date {
	int year;
	int month;
	int day;
	
	void printYMD() {
		System.out.printf("%d-%02d-%02d\n" , year , month , day);
	}
	void printMDY() {
		System.out.printf("%02d/%02d/%s\n" , month , day , getYearTwoDigit()); // 22라는 숫자를 문자열로 표기하기위해 
	}											// 밑에 스트링 리턴값을 불러왔다 문자열이기때문에 %s 로 바꾸고 출력했다
	
	String getYearTwoDigit() {
		return String.format("%02d" , year % 100);
	}
}

public class TestDate {
	public static void main (String[] args) {
		Date d = new Date();
		d.year = 2022;
		d.month = 5;
		d.day = 27;
		
		// d.printYMD();
		// d.printMDY();
		
		String year = d.getYearTwoDigit(); // 문자열을 출력하고 위 return 값만 동작하는형태로 출력하기위한 형태
		System.out.println(year);
	}  
}

