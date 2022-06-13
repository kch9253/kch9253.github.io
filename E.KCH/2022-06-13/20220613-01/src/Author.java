
public class Author extends Person{
	private String bookList;
	
	public Author(String name, int age, String bookList) {
		
		super(name, age); // 불러올값이 복수라면 () 안에 여러개값을 입력할수있지만 하나의 값만 불러올때는 super. 을 이용해야한다.
		this.bookList = bookList;
	}
	
	public String getBookList() {
		return bookList;
	}
	
}
