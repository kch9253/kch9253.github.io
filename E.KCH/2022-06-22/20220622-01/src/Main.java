import java.util.HashSet;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		
		HashSet set = new HashSet(); // hashset = 중복불가
		boolean b1 = set.add("qwer");
		boolean b2 = set.add(Integer.valueOf(10));
		boolean b3 = set.add("qwer");
		
		
		System.out.println(set.size()); // hashset 의 크기를 물어봄 : 결과값 2가 뜬 이유는 중복값이 있기때문에 추가하지않고 추가값을 없앤다.
		System.out.println(b1); 
		System.out.println(b2);
		System.out.println(b3); // b3 이 false 인 이유는 위 b1,b3 값이 같기때문에
		
		System.out.println(set.toString()); // 중복값을 없애고 출력
		
		// set.get(0); // set 은 list 와 다르게 인덱스값을 가지고있지않다 . 그래서 get이라는 메소드로 호출할수있는것이없다.
		
		
		for (Object o : set) { // set 값을 하나씩 출력하기 위해서 포이치문을 사용하면 가능하다 (일반 for문은 불가능)
			System.out.println(o);
		}
		
		Iterator<Object> iter = set.iterator(); // 위 for문 처럼 set 값을 이터레이터를 통해 불러올수있다
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
