import java.util.Arrays;

public class Main6 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
//		int[] temp = {40, 50, 60};
		
		Arrays.fill(arr, 100);
		
		System.out.println(Arrays.toString(arr)); // arr 3�ڸ��� ����  ���� 100���� ����Ѵ�.
		
		
//		int[] another = Arrays.copyOfRange(temp, 0, 2);
//		System.out.println(Arrays.toString(another));
		
		
		
		
		
		
		int[] copy = Arrays.copyOf(arr, 6); // 6 = ���̰� (�ø��� ���̱Ⱑ��)
		// (arr, arr.length) ���� ����� arr ���� �״�� ������ ���
		
		System.out.println(Arrays.toString(copy));
		System.out.println(Arrays.equals(arr, copy)); // equlas �� ��,���� (arr �� copy ���̿� ���Ұ��� ���ƾ� ��)
	}
}
