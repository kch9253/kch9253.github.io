import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] arr = new String[10];
		int[] num = new int[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.println( (i + 1) + "��° �� �Է�");
			num[i] = scan.nextInt();
		} // �迭 num�� 1-100�� ���� 10���� �Է¹޴´�.
		for (int i = 0; i < 10; i++) {
			arr[i] = (( i * 10 ) + 1) + "-" + (( i + 1 ) * 10) + ":";
		} // arr�� 0��° �ε����� ���� ������ ǥ���ϴ� String�� �ִ´�
		
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 10; j++)
				if( (i * 10) +1 <=num[j] && num[j] <= (i + 1) * 10)
					arr[i] += "*";
		// �迭 num�� �ε����� ���� ���� �迭 arr�� * �� �ִ´�
		for (int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		} // �迭 arr�� ����Ѵ�.
	}
}
