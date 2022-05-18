// 사용자에게 초단위의 시간을 입력받아
// 시간 분 초로 변환을 하는 프로그램

// 입력예) 3666
// 출력예) 1시간 1분 6초

// 3666/3600
// (3666%3600)/60
// (3666%3600)%60
import java.util.Scanner;

public class DDD {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("초를입력하세요");
		int a = scan.nextInt();
		int x = a / 3600;
		int y = (a % 3600) / 60;
		int z = (a % 3600) % 60;
		
		System.out.print(x  + "시 ");
		System.out.print(y + "분 ");
		System.out.print(z + "초 " );
		
		

		
	}
}

