package Map;

public class MapDAO {
	private String id;
	private String title;
	private String number;
	public MapDAO(String id, String title, String number) {
		super();
		this.id = id;
		this.title = title;
		this.number = number;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
 	
	
}
