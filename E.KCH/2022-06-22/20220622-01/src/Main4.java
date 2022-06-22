import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main4 {
	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));
		
		// �� 2���� ���Ұ��� ��� ������ ���� ����ϰ������
		Set<Integer> setUnion = new HashSet<>();
		setUnion.addAll(setA); // addAll �� ���� A,B ���Ҹ� ���� ����־ setUnion �� ȣ���Ͽ� �ߺ��Ȱ��� ���ְ� �ΰ��� ���ļ� �����Ͽ� ȣ���Ѵ�
		setUnion.addAll(setB);
		
		System.out.println(setUnion);
		
		Set<Integer> setDuplicate = new HashSet<>();
		setDuplicate.addAll(setA);
		setDuplicate.retainAll(setB); // retainAll = A,B �� �ߺ��ȿ��Ҹ� �������� �������� ���� �����.
									// retainAll = ������ó�� ���� �ߺ��Ȱ��� ���ΰ� ���� ����������.
		System.out.println(setDuplicate);
		
		Set<Integer> setLeftOuter = new HashSet<>();
		setLeftOuter.addAll(setA);
		setLeftOuter.removeAll(setB); // removeAll (setA ���� �� B�� �ߺ��Ȱ� 3,4,5�� ���� ���� 1,2 ���� ����ϴ�)
		System.out.println(setLeftOuter);
		
		Set<Integer> setSame = new HashSet<>(Arrays.asList(7,6,5,4,3,2,1));
		System.out.println(setSame.equals(setUnion)); // �� setUnion �� ���Ұ��̶� setSame�� ���Ұ��� �������� ���� ������ġ�ϴ��� ��,���������� �����.
		
		
	}
}
