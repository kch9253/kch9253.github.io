
public class Author extends Person{
	private String bookList;
	
	public Author(String name, int age, String bookList) {
		
		super(name, age); // �ҷ��ð��� ������� () �ȿ� ���������� �Է��Ҽ������� �ϳ��� ���� �ҷ��ö��� super. �� �̿��ؾ��Ѵ�.
		this.bookList = bookList;
	}
	
	public String getBookList() {
		return bookList;
	}
	
}
