import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main6 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,3,5,7,9,8));
		
		Collections.sort(list); // ���� ũ�� �������� ���
		System.out.println(list);
		
		int index = Collections.binarySearch(list , 8);
		System.out.println("8�� �ε���: " + index);
		
		Collections.reverse(list); // ���� ũ�� �������
		System.out.println(list);
		
		Collections.shuffle(list); // ���� ��� ���
		System.out.println(list);
		
		System.out.println(Collections.max(list)); // �ִ밪���
		System.out.println(Collections.min(list)); // �ּҰ����
		
		Collections.fill(list, 33); // ���Ұ� ���κ���
		System.out.println(list);
		
		Collections.replaceAll(list, 33, 77); // Ư���� ���Ұ��� �����Ͽ� �װ��� ���� �ٲܼ��ִ� / 33�� �ٲٱ����� ���� 77�� �ٲܰ�
		System.out.println(list);
		
		// list.clear();
		
		List<Integer> target = new ArrayList<>(Arrays.asList(90,80,70));
		Collections.copy(list, target); // �����ִ� 90,80,70�� ���� �����Ͽ� ����Ʈ�ȿ��ִ� ���� �������� / ����� ���� �տ������� ��µ�
		System.out.println(list); // ���� �Է��� 90,80,70�� 3ĭ�̴� ������ 3ĭ�� �־�� ���簡�����ϴ�. ������ĭ���� �����ϴٸ� �Ҽ�����.
	}
}
