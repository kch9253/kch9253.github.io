import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("banana");
		set.add("carrot");
		set.add("apple");
		set.add("banana");
		
		System.out.println(set.size());
		
		Iterator<String> iter = set.iterator(); // set �� Ư¡�� ���Ե� ������ ���� �Ű澲���ʴ´�. 
		while (iter.hasNext()) { // set ���� �޶�� ȣ���� �ϸ� ���ڴ�� ���� ���׹����ؼ� ������
			System.out.println(iter.next()); // �����ϴ��������� ����ϱ⺸�� �ߺ��� �������� ����Ѵ�
		}
		
		set.contains("banana"); // ���� �Է��Ѱ��� �ֳľ��� ������ ���� (������ü�� �ִ� ���� ���ڸ� Ȯ��)
		set.contains("dount");
		
		
		
	}
}
