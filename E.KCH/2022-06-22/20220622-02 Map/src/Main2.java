
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>(); //  Map<키값 , 벨류값>
		map.put("둘리", 100);
		map.put("홍길동", 90);
		map.put("도우너", 150);
		
		
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(1, "둘리");
		map2.put(4, "홍길동");
		map2.put(3, "도우너");
		
		System.out.println(map.toString()); // 모든원소를 다보고싶다 map,map2
		
		
		
		// 짝궁을 호출할수있는 
		Set<Entry<String, Integer>> entrySet = map.entrySet(); // Entry = 키값과 벨류값을 묶을수있는
		for (Entry<String, Integer> e : entrySet) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}
		
		
		
		
		
		
//		Set<String> keySet = map.keySet(); // 모든원소값을 보기위한
//		for (String key: keySet) {
//			System.out.println(key + "=" + map.get(key));
//		}
//		
		
//		//---------------------------------------------------- 모든원소값을 보기위한
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
