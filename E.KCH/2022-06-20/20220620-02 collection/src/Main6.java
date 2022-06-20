import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main6 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,3,5,7,9,8));
		
		Collections.sort(list); // 값의 크기 오름차순 출력
		System.out.println(list);
		
		int index = Collections.binarySearch(list , 8);
		System.out.println("8의 인덱스: " + index);
		
		Collections.reverse(list); // 값의 크기 역순출력
		System.out.println(list);
		
		Collections.shuffle(list); // 값을 섞어서 출력
		System.out.println(list);
		
		System.out.println(Collections.max(list)); // 최대값출력
		System.out.println(Collections.min(list)); // 최소값출력
		
		Collections.fill(list, 33); // 원소값 전부변경
		System.out.println(list);
		
		Collections.replaceAll(list, 33, 77); // 특정한 원소값을 지정하여 그값을 전부 바꿀수있다 / 33은 바꾸기위한 원소 77은 바꿀값
		System.out.println(list);
		
		// list.clear();
		
		List<Integer> target = new ArrayList<>(Arrays.asList(90,80,70));
		Collections.copy(list, target); // 위에있는 90,80,70의 값을 복사하여 리스트안에있는 값을 변경해줌 / 변경된 값은 앞에서부터 출력됨
		System.out.println(list); // 위에 입력한 90,80,70은 3칸이다 복사할 3칸이 있어야 복사가가능하다. 복사할칸수가 부족하다면 할수없다.
	}
}
