
public class Book {
	protected String name; // 力格
	protected int page; // 其捞瘤
	protected String jeuja; // 历磊
	
	public Book() {
		
	}
	
	public String toString() {
		return "力格: " + name + ", " + "其捞瘤: " + page + "," + "历磊: " + jeuja; 
	}
	
	public Book(String name, int page, String jeuja) {
		
		this.name = name;
		this.page = page;
		this.jeuja = jeuja;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getJeuja() {
		return jeuja;
	}

	public void setJeuja(String jeuja) {
		this.jeuja = jeuja;
	}
	
	
}
