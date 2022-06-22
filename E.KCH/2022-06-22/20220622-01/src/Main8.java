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
	public int hashCode() { // Objects.hash �� �����ϱ����� (book�� �ʵ尪���� �����ϰ� ����Ѵ�.) 
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
	public int compareTo(Book o) { // title(String) �� ���� ������� �����ϱ����� �޼ҵ�
		return title.compareTo(o.title);
	}
	
	
}

public class Main8 {
	public static void main(String[] args) {
		Book b1 = new Book("å1", 5000);
		Book b2 = new Book("å1", 5000);
		Book b3 = new Book("å2", 7000);
		Book b4 = new Book("å3", 4000);
		
//		Set<Book> tree = new TreeSet<>();
//		tree.add(b1);
//		tree.add(b2);
//		tree.add(b3);
//		tree.add(b4);
//		
//		System.out.println(tree);
		
		Comparator<Book> com = new Comparator<Book>() { // ���ݼ����� �����ϱ����� �����ڸ� �����
			public int compare(Book o1, Book o2) {
				return o1.getPrice() - o2.getPrice();
			}
		};
		
		Set<Book> treeByPrice = new TreeSet<>(com); // ���ݼ����� �����ϱ����� �޼ҵ�
		treeByPrice.add(b1);
		treeByPrice.add(b2);
		treeByPrice.add(b3);
		treeByPrice.add(b4);
		
		System.out.println(treeByPrice); 
		
		
		
//		int hash1 = Objects.hash(5000, "å1"); // Objects.hash = ��� ���� �־ ���ڷ�ǥ��ȴ�.
//		int hash2 = Objects.hash(5000, "å1"); // Objects.hash = ������ �����Ͱ��� ������ �ϳ��ϳ��� �񱳸� �ϸ鼭 ���� �������ʰ� �������� �����Ͱ��� ���ڷ� �����ϰ� �װ͵��� ��ġ�ϴ��� ���Ǹ� �������ִ� (���ε�� �α��� ��ɰ���)
//		int hash3 = Objects.hash(5000, "å2");
//		int hash4 = Objects.hash(5001, "å1");
//		
//		System.out.println(hash1);
//		System.out.println(hash2);
//		System.out.println(hash3);
//		System.out.println(hash4);
		
//		Book b1 = new Book("å1", 5000);
//		Book b2 = new Book("å1", 5000);
//		Book b3 = new Book("å2", 7000);
//		
//		System.out.println(b1.equals(b2));
//		System.out.println(b1.equals(b3));
//		
//		Set<Book> set = new HashSet<>(); // ����ü���� �������ִ� ������ ���� Hash ����Ѵ�
//		set.add(b1);
//		set.add(b2);
//		set.add(b3);
//		
//		System.out.println(set.size());
//		System.out.println(set);
		
	}
}
