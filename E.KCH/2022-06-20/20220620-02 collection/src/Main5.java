import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main5 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList(Arrays.asList(10,20,30,40,50));
		System.out.println(list); //Arrays.asList = �����ھȿ� ���������� ����Ʈó�� �����ǰ� �Ҽ��ִ�.
		// Arrays.asList �� �����߰� �� �����Ұ��� �׳� �̷��� �����ϰ� ���ڴ� �Ҷ��� ����Ѵ�.
		
//		List <Integer> test = Arrays.asList(10,20,30,40,50);
//		test.add(60);
		
		list.addAll(Arrays.asList(60,70,80)); // addAll ���� ������ ���ҿ��� �߰����Ҹ� �־� �����.
		System.out.println(list); // 60,70,80 �� ������ �߰��Ȱ��̴�. ���⼭ 50,60,70 �� ������ 50�� �ϳ��� �����ȴ�. ���ǰ��� �ٲܼ��¾���. ���� �߰��� ��������
		
		list.removeAll(Arrays.asList(30,40,50)); // removeAll �������ϴ°��� ����
		System.out.println(list);
		
		System.out.println(list.containsAll(Arrays.asList(10,20))); // ����Ʈ�ȿ� �ִ°��� �ִ��� ������ ���
		
		List<Integer> sub = list.subList(0, 3);
		System.out.println(sub);
		System.out.println(list);
		
	}
}
