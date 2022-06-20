import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // ArrayList : 배열처럼 여러개의 자료를 가질수있는 하나의 객체이다.
		list.add("문자열 객체"); // add 추가하고싶은 객체를 넣어주면됨.
		list.add(new Object());
		list.add(Integer.valueOf(100));
		list.add(Double.valueOf(55.55));
		
		list.add(500); // 오토박싱이 일어나기 때문에 정수형 , 실수형값을 인스턴스에만 입력해도 오류가 발생하지않는다.
		list.add(125.125);
		
		int size = list.size(); // size = 몇개의 객체가 담아져있는지 확인가능함 = 출력값은 6개
		System.out.println(size); // size 는 위에있는 add 값들을 박스안에 넣어라고 선언을하고 일반 배열처럼 똑같이 박스 순서대로 인덱스값 0~ 이 생긴다.
		
		System.out.println(list.get(0)); // list.get() 을통해 위에 선언된 add 값들의 인덱스값을 넣어 호출할수있다
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		
		for(int i = 0; i < list.size(); i++) { // =모든 add 리스트를 보고싶을때
			System.out.println(list.get(i));
		}
		
		for(int i = list.size() - 1; i >= 0; i--) { // =모든 add 리스트를 거꾸로 보고싶을때
			System.out.println(list.get(i));
		}
		
		for (Object o : list) {
			System.out.println(o);
		}
	}
}
