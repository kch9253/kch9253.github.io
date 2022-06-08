// 6월8일 수업내용 (-1 정수를 입력하면 작동이 멈추고 그전에 정수무한입력가능)
// -1 로 작동을 멈출경우 아무렇게 입력한 정수 높은순대로 출력 (최대5개)
import java.util.Scanner;
public class Main2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int LENGTH = 5;
		int[] arr = new int[5]; 
		
		int i = 0;
		
		while(true) {
			int n = scan.nextInt();
			if(n <= 0) {
				break;
			}
			arr[i] = n;
			
			i++;
			
			if(i == LENGTH) {
				i = 0;
			}			
		}
		scan.close();
		for(i = 0;i < LENGTH;i++) {
			System.out.println(arr[i]);
		}
	}
}
