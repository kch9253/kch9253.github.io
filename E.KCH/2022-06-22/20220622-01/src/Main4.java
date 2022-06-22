import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main4 {
	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));
		
		// 위 2개의 원소값을 모두 포함한 값을 출력하고싶을때
		Set<Integer> setUnion = new HashSet<>();
		setUnion.addAll(setA); // addAll 을 통해 A,B 원소를 전부 집어넣어서 setUnion 을 호출하여 중복된값을 없애고 두값을 합쳐서 정렬하여 호출한다
		setUnion.addAll(setB);
		
		System.out.println(setUnion);
		
		Set<Integer> setDuplicate = new HashSet<>();
		setDuplicate.addAll(setA);
		setDuplicate.retainAll(setB); // retainAll = A,B 의 중복된원소만 남겨지고 나머지는 전부 지운다.
									// retainAll = 교집합처럼 값의 중복된값만 놔두고 전부 지워버린다.
		System.out.println(setDuplicate);
		
		Set<Integer> setLeftOuter = new HashSet<>();
		setLeftOuter.addAll(setA);
		setLeftOuter.removeAll(setB); // removeAll (setA 원소 중 B와 중복된값 3,4,5를 빼고 남은 1,2 값을 출력하는)
		System.out.println(setLeftOuter);
		
		Set<Integer> setSame = new HashSet<>(Arrays.asList(7,6,5,4,3,2,1));
		System.out.println(setSame.equals(setUnion)); // 위 setUnion 의 원소값이랑 setSame의 원소값을 이퀄스를 통해 서로일치하는지 참,거짓값으로 물어본다.
		
		
	}
}
