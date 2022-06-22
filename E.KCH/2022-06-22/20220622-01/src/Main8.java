import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Book implements Comparable<Book> {
	private String title;
	private int price;
	
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
	@Override
	public int hashCode() { // Objects.hash 를 생성하기위해 (book의 필드값들을 선언하고 사용한다.) 
		return Objects.hash (title , price);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	@Override
	public int compareTo(Book o) { // title(String) 의 값을 순서대로 정렬하기위한 메소드
		return title.compareTo(o.title);
	}
	
	
}

public class Main8 {
	public static void main(String[] args) {
		Book b1 = new Book("책1", 5000);
		Book b2 = new Book("책1", 5000);
		Book b3 = new Book("책2", 7000);
		Book b4 = new Book("책3", 4000);
		
//		Set<Book> tree = new TreeSet<>();
//		tree.add(b1);
//		tree.add(b2);
//		tree.add(b3);
//		tree.add(b4);
//		
//		System.out.println(tree);
		
		Comparator<Book> com = new Comparator<Book>() { // 가격순으로 정렬하기위해 생성자를 만든다
			public int compare(Book o1, Book o2) {
				return o1.getPrice() - o2.getPrice();
			}
		};
		
		Set<Book> treeByPrice = new TreeSet<>(com); // 가격순으로 정렬하기위한 메소드
		treeByPrice.add(b1);
		treeByPrice.add(b2);
		treeByPrice.add(b3);
		treeByPrice.add(b4);
		
		System.out.println(treeByPrice); 
		
		
		
//		int hash1 = Objects.hash(5000, "책1"); // Objects.hash = 어떠한 값을 넣어도 숫자로표기된다.
//		int hash2 = Objects.hash(5000, "책1"); // Objects.hash = 수많은 데이터값이 있을때 하나하나씩 비교를 하면서 값을 정하지않고 여러개의 데이터값을 숫자로 지정하고 그것들이 일치하는지 정의를 내릴수있다 (예로들면 로그인 기능같은)
//		int hash3 = Objects.hash(5000, "책2");
//		int hash4 = Objects.hash(5001, "책1");
//		
//		System.out.println(hash1);
//		System.out.println(hash2);
//		System.out.println(hash3);
//		System.out.println(hash4);
		
//		Book b1 = new Book("책1", 5000);
//		Book b2 = new Book("책1", 5000);
//		Book b3 = new Book("책2", 7000);
//		
//		System.out.println(b1.equals(b2));
//		System.out.println(b1.equals(b3));
//		
//		Set<Book> set = new HashSet<>(); // 각객체마다 가지고있는 고유의 값을 Hash 라고한다
//		set.add(b1);
//		set.add(b2);
//		set.add(b3);
//		
//		System.out.println(set.size());
//		System.out.println(set);
		
	}
}
