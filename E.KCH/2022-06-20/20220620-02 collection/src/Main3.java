import java.util.List;
import java.util.ArrayList;

public class Main3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		// �� ����Ʈ���� 10, 20, 30, 40 ���
		for (int i = 1; i <= 4; i++) {
			list.add(i * 10);
		}
		// ������ ���
		System.out.println(list.toString());
		list.set(1, 15); // 1 = �ε�����ȣ , 15 = �����Ұ� 
		// set = ���� �����ϱ����� ���ǰ�.
		System.out.println(list);
		
		System.out.println(list.contains(30)); // ���� ����� ���� ()�ȿ� �Է��� ���ڰ��ִ��������� �˷��޶� ��,�������� ��µ�
		System.out.println(list.indexOf(30)); // 30�̶�� ������ �ε��� ��ȣ�� �˷���.
		
		list.remove(2); // ()�ȿ� �ε������� �־� �����Ҽ��ִ�. ������ �ε����� �ڿ��ִ� ������ �ϳ��� �ڸ��� �մ�� �ε������� �޶�����. 3 -> 2 �κ��� �̷�������
		System.out.println(list);
		
		list.add(0, 0); // = 0��° �ε����� 0�� ����־�� ��� �ݴ�� �ε����ڸ����� ���ο�� �߰��� �־��⶧���� ������ �������� ���������� �ε������� 1���þ��.
		System.out.println(list);
		
		list.clear(); // ����Ʈ�ȿ��ִ� ��� ������ �� ����������ʹ�.
//		for (int i = 0; i < list.size(); i++) {
//			list.remove(i);
//		}
		System.out.println("������: " + list);
		System.out.println(list.size() == 0); // == ����Ʈ ���Ұ����� ���� �� ���������� Ȯ���ϴ�
		System.out.println(list.isEmpty()); // == ����Ʈ ���Ұ����� ���� �� ���������� Ȯ���ϴ�
	}
}
