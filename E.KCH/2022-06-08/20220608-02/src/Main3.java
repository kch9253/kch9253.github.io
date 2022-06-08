import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] arr = new String[10];
		int[] num = new int[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.println( (i + 1) + "번째 값 입력");
			num[i] = scan.nextInt();
		} // 배열 num에 1-100개 정수 10개를 입력받는다.
		for (int i = 0; i < 10; i++) {
			arr[i] = (( i * 10 ) + 1) + "-" + (( i + 1 ) * 10) + ":";
		} // arr의 0번째 인덱스에 값의 범위를 표시하는 String을 넣는다
		
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 10; j++)
				if( (i * 10) +1 <=num[j] && num[j] <= (i + 1) * 10)
					arr[i] += "*";
		// 배열 num의 인덱스의 값에 따라 배열 arr에 * 를 넣는다
		for (int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		} // 배열 arr을 출력한다.
	}
}
