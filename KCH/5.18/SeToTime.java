
import java.util.Scanner;

public class SeToTime {
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("초 단위의 정수를 입력하세요");
	
	int second = scanner.nextInt();
	
	int hour = second / 3600 ;
	int minute = (second % 3600) / 60;
	int second;
	
	System.out.println(hour + "시간");
	System.out.println(minute + "분");
	
	// System.out.println("입력한수: " + second);
	}
}