import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main5 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList(Arrays.asList(10,20,30,40,50));
		System.out.println(list); //Arrays.asList = 생성자안에 넣은값들이 리스트처럼 형성되게 할수있다.
		// Arrays.asList 는 원소추가 및 삭제불가다 그냥 이렇게 지정하고 쓰겠다 할때만 사용한다.
		
//		List <Integer> test = Arrays.asList(10,20,30,40,50);
//		test.add(60);
		
		list.addAll(Arrays.asList(60,70,80)); // addAll 위에 생성된 원소에서 추가원소를 넣어 출력함.
		System.out.println(list); // 60,70,80 은 억지로 추가된것이다. 여기서 50,60,70 을 넣으면 50이 하나더 생성된다. 위의값을 바꿀수는없다. 단지 추가만 더했을뿐
		
		list.removeAll(Arrays.asList(30,40,50)); // removeAll 내가원하는값을 지움
		System.out.println(list);
		
		System.out.println(list.containsAll(Arrays.asList(10,20))); // 리스트안에 있는값이 있느냐 없느냐 물어봄
		
		List<Integer> sub = list.subList(0, 3);
		System.out.println(sub);
		System.out.println(list);
		
	}
}
