import java.util.LinkedList;
import java.util.Queue;

public class Main3 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		queue.add("����1");
		queue.offer("����2");
		
		System.out.println(queue);
		
		String elem1 = queue.poll(); // �ȿ��ִ� ���ҵ��� ������ ������ // poll �ȿ� ���Ұ����� ��� false
		String elem2 = queue.remove(); // remove ������� ���Ұ������� ����ó����
		
		System.out.println(elem1);
		System.out.println(elem2);
		
		System.out.println(queue.size());
	}
}
