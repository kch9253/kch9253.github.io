import java.util.List;
import java.util.ArrayList;

public class Main3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		// 위 리스트에서 10, 20, 30, 40 출력
		for (int i = 1; i <= 4; i++) {
			list.add(i * 10);
		}
		// 모든원소 출력
		System.out.println(list.toString());
		list.set(1, 15); // 1 = 인덱스번호 , 15 = 변경할값 
		// set = 값을 변경하기위한 조건값.
		System.out.println(list);
		
		System.out.println(list.contains(30)); // 위의 선언된 값중 ()안에 입력한 숫자가있는지없는지 알려달라 참,거짓으로 출력됨
		System.out.println(list.indexOf(30)); // 30이라는 숫자의 인덱스 번호를 알려줌.
		
		list.remove(2); // ()안에 인덱스값을 넣어 제거할수있다. 제거한 인덱스값 뒤에있던 값들은 하나씩 자리를 앞당겨 인덱스값이 달라진다. 3 -> 2 로변경 이런식으로
		System.out.println(list);
		
		list.add(0, 0); // = 0번째 인덱스에 0을 집어넣어라 얘는 반대로 인덱스자리수에 새로운값을 추가로 넣었기때문에 넣은값 기준으로 오른쪽으로 인덱스값이 1씩늘어난다.
		System.out.println(list);
		
		list.clear(); // 리스트안에있는 모든 값들을 다 날려버리고싶다.
//		for (int i = 0; i < list.size(); i++) {
//			list.remove(i);
//		}
		System.out.println("지운결과: " + list);
		System.out.println(list.size() == 0); // == 리스트 원소값들이 전부 다 지워졌는지 확인하는
		System.out.println(list.isEmpty()); // == 리스트 원소값들이 전부 다 지워졌는지 확인하는
	}
}
