// 6��8�� �������� (-1 ������ �Է��ϸ� �۵��� ���߰� ������ ���������Է°���)
// -1 �� �۵��� ������ �ƹ����� �Է��� ���� ��������� ��� (�ִ�5��)
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
