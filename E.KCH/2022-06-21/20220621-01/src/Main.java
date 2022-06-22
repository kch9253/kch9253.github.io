import java.util.Iterator;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("문자열1");
		list.add("문자열2");
		
		list.get(0);
		list.get(1);
		
		for (int i = 0; i < list.size(); i++) {
			list.get(i);
		}
		
		for (String s : list) {
			System.out.println(s);
		}
		
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			iter.next();
		}
 	}
}