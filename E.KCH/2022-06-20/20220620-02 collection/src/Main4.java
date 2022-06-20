import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main4 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("사과");
		list.add("바나나");
		list.add("당근");
		list.add("도넛츠");
		
		Iterator<String> iterator = list.iterator(); // iterator = 리스트의 원소를 하나하나씩 볼수있게 도와주는
		while (iterator.hasNext()) { // 모든원소를 전부가져와라
			String str = iterator.next();
			if (str.length() ==  3) {
				iterator.remove();
			}
		}
		System.out.println(list);
		
		
//		System.out.println(iterator.next()); // 리스트의 원소값들을 가져오게 하는
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		
//		
//		System.out.println(list.contains(new String ("바나나")));
//		
//		list.remove("바나나"); // 위 원소중 바나나를 지우고 나머지를 출력함.
//		System.out.println(list);
		
		// 위의 리스트에서 5글자 문자열만 찾아서 지우기
		
	}

}
