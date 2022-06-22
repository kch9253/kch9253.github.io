import java.util.LinkedList;
import java.util.Queue;

public class Main3 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		queue.add("원소1");
		queue.offer("원소2");
		
		System.out.println(queue);
		
		String elem1 = queue.poll(); // 안에있는 원소들을 밖으로 빼내줌 // poll 안에 원소가없을 경우 false
		String elem2 = queue.remove(); // remove 같은경우 원소가없으면 예외처리함
		
		System.out.println(elem1);
		System.out.println(elem2);
		
		System.out.println(queue.size());
	}
}
