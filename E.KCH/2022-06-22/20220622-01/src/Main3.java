import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("가", "나", "다", "다", "다", "가", "라"));
		
		Set<String> set = new HashSet<>(list); // = 중복된값을 지우고싶다.
		System.out.println(set); // () 안에 지우고자하는 목록 메소드를 호출하면 for 문없이 중복된값을 바로 지울수있다.
		
//		for (int i = 0; i < list.size(); i++) { // 중복된값을 지우기위한 코드
//			set.add(list.get(i));
//		}
//		System.out.println(set);
	}
}
