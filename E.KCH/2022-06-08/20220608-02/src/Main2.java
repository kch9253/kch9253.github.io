import java.util.Scanner;

public class Main2 {
	static int seat[] = new int[10];
	static int reserved;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("�¼��� �����Ͻðڽ��ϱ�? (1 �Ǵ� 0)");
			int q = scan.nextInt();
			
			if (q == 0) break;
			System.out.println("������ ������´� ������ �����ϴ�.");
			System.out.println("--------------------------");
			for (int i = 0; i <= 10; i++) {
				System.out.println(i + " ");
			}
		}
		System.out.println("--------------------------");
		
		for (int i : seat)
            System.out.println(i + " ");

        System.out.println();
        System.out.print("�� ��° �¼��� �����Ͻðڽ��ϱ�?");
        reserved = scan.nextInt();

       seat[reserved - 1] = 1;
        System.out.println("����Ǿ����ϴ�.");
    }    	   	
}

		
		
		
		
		
	


