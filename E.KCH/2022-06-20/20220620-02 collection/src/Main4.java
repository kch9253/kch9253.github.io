import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main4 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("���");
		list.add("�ٳ���");
		list.add("���");
		list.add("������");
		
		Iterator<String> iterator = list.iterator(); // iterator = ����Ʈ�� ���Ҹ� �ϳ��ϳ��� �����ְ� �����ִ�
		while (iterator.hasNext()) { // �����Ҹ� ���ΰ����Ͷ�
			String str = iterator.next();
			if (str.length() ==  3) {
				iterator.remove();
			}
		}
		System.out.println(list);
		
		
//		System.out.println(iterator.next()); // ����Ʈ�� ���Ұ����� �������� �ϴ�
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		
//		
//		System.out.println(list.contains(new String ("�ٳ���")));
//		
//		list.remove("�ٳ���"); // �� ������ �ٳ����� ����� �������� �����.
//		System.out.println(list);
		
		// ���� ����Ʈ���� 5���� ���ڿ��� ã�Ƽ� �����
		
	}

}
