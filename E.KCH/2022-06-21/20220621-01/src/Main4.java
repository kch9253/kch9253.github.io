import java.util.Deque;
import java.util.LinkedList;

public class Main4 {
	public static void main(String[] args) {
		Deque<String> stack = new LinkedList<>();
		stack.push("10"); // push �־��
		stack.push("20");
		stack.push("30"); 
		
		System.out.println(stack.pop()); // ������ ����ض� �Ʒ��������� �������
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
	}
}
