import java.util.Scanner;

public class Main2 {
	static int seat[] = new int[10];
	static int reserved;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("좌석을 예약하시겠습니까? (1 또는 0)");
			int q = scan.nextInt();
			
			if (q == 0) break;
			System.out.println("현재의 예약상태는 다음과 같습니다.");
			System.out.println("--------------------------");
			for (int i = 0; i <= 10; i++) {
				System.out.println(i + " ");
			}
		}
		System.out.println("--------------------------");
		
		for (int i : seat)
            System.out.println(i + " ");

        System.out.println();
        System.out.print("몇 번째 좌석을 예약하시겠습니까?");
        reserved = scan.nextInt();

       seat[reserved - 1] = 1;
        System.out.println("예약되었습니다.");
    }    	   	
}

		
		
		
		
		
	


