import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main7 {
	public static void main(String[] args) {
		// 2의 배수를 5개 가지는 정수형 리스트 생성 및 초기화해보기
		
		// 7의 배수를 5개 가지는 정수형 리스트 생성 및 초기화해보기
		
		// 위의 리스트의 원소들을 모두 다가지는 리스트
		
		// 3번의 리스트를 오름차순으로 정렬된 원소를 가지는
		
		List<Integer> list = new ArrayList<>(Arrays.asList(2,4,6,8,10));
		System.out.println(list);
		
		list.addAll(Arrays.asList(7,14,21,28,35));
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		try { 
			Collections.shuffle(list);
		} catch (IndexOutOfBoundsException e) {	
			System.out.println();
		} finally {
			for (int i = 0; i <= 10; i++) {
			System.out.print(list.get(i));
		}
		}
		
	}
}
