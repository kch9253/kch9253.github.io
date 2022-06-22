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
		
		Iterator<String> iter = set.iterator(); // set 의 특징은 삽입된 순서를 전혀 신경쓰지않는다. 
		while (iter.hasNext()) { // set 값을 달라고 호출을 하면 지멋대로 순서 뒤죽박죽해서 내보냄
			System.out.println(iter.next()); // 관리하는차원에서 사용하기보다 중복을 기준으로 사용한다
		}
		
		set.contains("banana"); // 내가 입력한값이 있냐없냐 이퀄스 같은 (문장전체에 있는 값중 문자를 확인)
		set.contains("dount");
		
		
		
	}
}
