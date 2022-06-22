import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("일",1); // 왼쪽값은 키 , 오른쪽값은 벨류
		map.put("이",2);
		map.put("삼",3);
		map.put("사",4);
		
		System.out.println(map.size()); // size() = 원소개수확인
		
		// map.get("이"); // get 을 통해 키값을 넣어야하는데 키값을 넣고 출력을하면 벨류값이 출력된다 // 키 -> 벨류 
		
		System.out.println(map.get("이"));
		System.out.println(map.get("삼"));
		System.out.println(map.get("오")); // 없는 키값은 null 값이 뜬다
		
		
		if (!map.containsKey("이")) { // "이" 라는 값이 없을때만 map.put 을 통해 집어넣어라
			map.put("이", 2222);
		}
		map.put("이", 2222); // 벨류값을 변경하여 값을 넣으면 기존의 값은 없어지고 새값을 참조하여 // 중복을 막는것이아닌 그냥 값을 덮어씌운다
		System.out.println(map.get("이"));
		
	}
}
