import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // ArrayList : �迭ó�� �������� �ڷḦ �������ִ� �ϳ��� ��ü�̴�.
		list.add("���ڿ� ��ü"); // add �߰��ϰ���� ��ü�� �־��ָ��.
		list.add(new Object());
		list.add(Integer.valueOf(100));
		list.add(Double.valueOf(55.55));
		
		list.add(500); // ����ڽ��� �Ͼ�� ������ ������ , �Ǽ������� �ν��Ͻ����� �Է��ص� ������ �߻������ʴ´�.
		list.add(125.125);
		
		int size = list.size(); // size = ��� ��ü�� ������ִ��� Ȯ�ΰ����� = ��°��� 6��
		System.out.println(size); // size �� �����ִ� add ������ �ڽ��ȿ� �־��� �������ϰ� �Ϲ� �迭ó�� �Ȱ��� �ڽ� ������� �ε����� 0~ �� �����.
		
		System.out.println(list.get(0)); // list.get() ������ ���� ����� add ������ �ε������� �־� ȣ���Ҽ��ִ�
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		
		for(int i = 0; i < list.size(); i++) { // =��� add ����Ʈ�� ���������
			System.out.println(list.get(i));
		}
		
		for(int i = list.size() - 1; i >= 0; i--) { // =��� add ����Ʈ�� �Ųٷ� ���������
			System.out.println(list.get(i));
		}
		
		for (Object o : list) {
			System.out.println(o);
		}
	}
}
