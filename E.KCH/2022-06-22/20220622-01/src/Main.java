import java.util.HashSet;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		
		HashSet set = new HashSet(); // hashset = �ߺ��Ұ�
		boolean b1 = set.add("qwer");
		boolean b2 = set.add(Integer.valueOf(10));
		boolean b3 = set.add("qwer");
		
		
		System.out.println(set.size()); // hashset �� ũ�⸦ ��� : ����� 2�� �� ������ �ߺ����� �ֱ⶧���� �߰������ʰ� �߰����� ���ش�.
		System.out.println(b1); 
		System.out.println(b2);
		System.out.println(b3); // b3 �� false �� ������ �� b1,b3 ���� ���⶧����
		
		System.out.println(set.toString()); // �ߺ����� ���ְ� ���
		
		// set.get(0); // set �� list �� �ٸ��� �ε������� �����������ʴ� . �׷��� get�̶�� �޼ҵ�� ȣ���Ҽ��ִ°��̾���.
		
		
		for (Object o : set) { // set ���� �ϳ��� ����ϱ� ���ؼ� ����ġ���� ����ϸ� �����ϴ� (�Ϲ� for���� �Ұ���)
			System.out.println(o);
		}
		
		Iterator<Object> iter = set.iterator(); // �� for�� ó�� set ���� ���ͷ����͸� ���� �ҷ��ü��ִ�
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
