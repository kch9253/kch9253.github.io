
public class Book {
	protected String name; // ����
	protected int page; // ������
	protected String jeuja; // ����
	
	public Book() {
		
	}
	
	public String toString() {
		return "����: " + name + ", " + "������: " + page + "," + "����: " + jeuja; 
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
