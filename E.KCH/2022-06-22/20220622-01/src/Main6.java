import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main6 {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>(); // LinkedHashSet = �ߺ��Ȱ��� ����� �������� ����ϴ°��� �ƴ� �����״�� ��Ű�� ����Ѵ�.
		set.add("banana");
		set.add("carrot");
		set.add("apple");
		set.add("apple");
		
		for (String s : set) { // ����ġ���� ���� �� ���Ұ����� ����غ�
			System.out.println(s);
		}
		
		Set<String> set2 = new HashSet<>(Arrays.asList("apple" , "dount", "egg", "fanta"));
		
//		set.addAll(set2); // ���� ��ġ���� ������ �� �ڵ尪�� ���� ��ĥ������.
//		System.out.println(set2);
		
		set2.addAll(set); // set , set2 �� ���Ұ��� ��ģ��
		System.out.println(set2);
	}
}
