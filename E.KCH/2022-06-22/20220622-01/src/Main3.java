import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("��", "��", "��", "��", "��", "��", "��"));
		
		Set<String> set = new HashSet<>(list); // = �ߺ��Ȱ��� �����ʹ�.
		System.out.println(set); // () �ȿ� ��������ϴ� ��� �޼ҵ带 ȣ���ϸ� for ������ �ߺ��Ȱ��� �ٷ� ������ִ�.
		
//		for (int i = 0; i < list.size(); i++) { // �ߺ��Ȱ��� ��������� �ڵ�
//			set.add(list.get(i));
//		}
//		System.out.println(set);
	}
}
