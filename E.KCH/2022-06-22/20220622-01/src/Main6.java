import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main6 {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>(); // LinkedHashSet = 중복된값을 지우고 랜덤으로 출력하는것이 아닌 순서그대로 지키고 출력한다.
		set.add("banana");
		set.add("carrot");
		set.add("apple");
		set.add("apple");
		
		for (String s : set) { // 포이치문을 통해 위 원소값들을 출력해봄
			System.out.println(s);
		}
		
		Set<String> set2 = new HashSet<>(Arrays.asList("apple" , "dount", "egg", "fanta"));
		
//		set.addAll(set2); // 둘을 합치려고 했으나 이 코드값은 둘을 합칠수없다.
//		System.out.println(set2);
		
		set2.addAll(set); // set , set2 두 원소값을 합친값
		System.out.println(set2);
	}
}
