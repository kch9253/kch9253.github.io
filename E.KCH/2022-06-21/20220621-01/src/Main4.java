import java.util.Deque;
import java.util.LinkedList;

public class Main4 {
	public static void main(String[] args) {
		Deque<String> stack = new LinkedList<>();
		stack.push("10"); // push 넣어라
		stack.push("20");
		stack.push("30"); 
		
		System.out.println(stack.pop()); // 밖으로 출력해라 아래에서부터 순서대로
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
	}
}
