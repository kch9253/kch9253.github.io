import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Main5 {
	public static void main(String[] args) {
		// �ߺ������ʴ� 1~45 ������ ���� 6���� ������ ����
		Set<Integer> lotto = new HashSet<>();
		Random random = new Random();
		
		while (lotto.size() < 6) { // �� ���� 6���� ����ϴ� �����̹Ƿ� size ���� 6���� �����ϰ� 
			lotto.add(random.nextInt(45) + 1); // 0~45 ����ϰԲ� �����־��ش�.
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
