
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>(); //  Map<Ű�� , ������>
		map.put("�Ѹ�", 100);
		map.put("ȫ�浿", 90);
		map.put("�����", 150);
		
		
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(1, "�Ѹ�");
		map2.put(4, "ȫ�浿");
		map2.put(3, "�����");
		
		System.out.println(map.toString()); // �����Ҹ� �ٺ���ʹ� map,map2
		
		
		
		// ¦���� ȣ���Ҽ��ִ� 
		Set<Entry<String, Integer>> entrySet = map.entrySet(); // Entry = Ű���� �������� �������ִ�
		for (Entry<String, Integer> e : entrySet) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}
		
		
		
		
		
		
//		Set<String> keySet = map.keySet(); // �����Ұ��� ��������
//		for (String key: keySet) {
//			System.out.println(key + "=" + map.get(key));
//		}
//		
		
//		//---------------------------------------------------- �����Ұ��� ��������
//		Set<String> keySet = map.keySet(); 
//		Iterator<String> iter = keySet.iterator();
//		while (iter.hasNext()) {
//			String key = iter.next();
//			Integer value = map.get(key);
//			
//			System.out.println(key + "=" + value);
//		}
		
	}
}
