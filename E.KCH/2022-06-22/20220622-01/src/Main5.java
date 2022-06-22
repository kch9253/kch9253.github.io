import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Main5 {
	public static void main(String[] args) {
		// 중복되지않는 1~45 사이의 정수 6개를 가지는 집합
		Set<Integer> lotto = new HashSet<>();
		Random random = new Random();
		
		while (lotto.size() < 6) { // 위 정수 6개만 출력하는 조건이므로 size 값을 6개로 지정하고 
			lotto.add(random.nextInt(45) + 1); // 0~45 출력하게끔 값을넣어준다.
		}
		System.out.println(lotto);
		
		//-----------------------------------------------------
		
		List<Integer> list = new ArrayList<>(lotto);
		Collections.sort(list);
		System.out.println(list);
		
//		Set<Integer> setA = new HashSet<>(Arrays.asList(1, 3, 7, 9, 11, 42));
//		Set<Integer> setB = new HashSet<>(Arrays.asList(10, 12, 15, 18, 20, 25));
//		
//		Set<Integer> setUnion = new HashSet<>();
//		
//		setUnion.addAll(setA);
//		setUnion.addAll(setB);
//		System.out.println(setUnion);
	}
}
