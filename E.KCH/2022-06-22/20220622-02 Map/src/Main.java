import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("��",1); // ���ʰ��� Ű , �����ʰ��� ����
		map.put("��",2);
		map.put("��",3);
		map.put("��",4);
		
		System.out.println(map.size()); // size() = ���Ұ���Ȯ��
		
		// map.get("��"); // get �� ���� Ű���� �־���ϴµ� Ű���� �ְ� ������ϸ� �������� ��µȴ� // Ű -> ���� 
		
		System.out.println(map.get("��"));
		System.out.println(map.get("��"));
		System.out.println(map.get("��")); // ���� Ű���� null ���� ���
		
		
		if (!map.containsKey("��")) { // "��" ��� ���� �������� map.put �� ���� ����־��
			map.put("��", 2222);
		}
		map.put("��", 2222); // �������� �����Ͽ� ���� ������ ������ ���� �������� ������ �����Ͽ� // �ߺ��� ���°��̾ƴ� �׳� ���� ������
		System.out.println(map.get("��"));
		
	}
}
