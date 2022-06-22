import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main7 {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>(); // TreeSet = 원소값 크기별로 출력한다 작은수부터 큰수까지 차례대로
		set.add(50);
		set.add(17);
		set.add(2);
		set.add(50);
		set.add(22);
		set.add(30);
		
		for (int i : set) {
			System.out.println(i);
		}
	}
}
