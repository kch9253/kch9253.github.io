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

import java.util.Scanner;

class Weather {
	String year;
	String month;
	String jan;
	void printf() {
		System.out.printf(" %s년-%s월-%s일 " , year , month , jan);
	}
	
}

public class Weather2 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		Weather name = new Weather();
		name.year = scan.nextLine();
		name.month = scan.nextLine();
		name.jan = scan.nextLine();
		name.printf();
	}
}