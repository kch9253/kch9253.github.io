import java.util.ArrayList;

public class Main2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); // <Integer> 앞뒤로 선언을해줘야 연산이 가능하다.
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		// list.add("asdf"); = 문자열을 넣으면 안돼는 이유는 위에 정수형 객체인 <Integer> 를 선언했기때문에
		
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println(sum);
	} 
}
