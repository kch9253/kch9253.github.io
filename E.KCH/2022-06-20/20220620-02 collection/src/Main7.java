import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main7 {
	public static void main(String[] args) {
		// 2�� ����� 5�� ������ ������ ����Ʈ ���� �� �ʱ�ȭ�غ���
		
		// 7�� ����� 5�� ������ ������ ����Ʈ ���� �� �ʱ�ȭ�غ���
		
		// ���� ����Ʈ�� ���ҵ��� ��� �ٰ����� ����Ʈ
		
		// 3���� ����Ʈ�� ������������ ���ĵ� ���Ҹ� ������
		
		List<Integer> list = new ArrayList<>(Arrays.asList(2,4,6,8,10));
		System.out.println(list);
		
		list.addAll(Arrays.asList(7,14,21,28,35));
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		try { 
			Collections.shuffle(list);
		} catch (IndexOutOfBoundsException e) {	
			System.out.println();
		} finally {
			for (int i = 0; i <= 10; i++) {
			System.out.print(list.get(i));
		}
		}
		
	}
}
