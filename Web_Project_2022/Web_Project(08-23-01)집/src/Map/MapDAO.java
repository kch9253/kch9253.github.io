package Map;

public class MapDAO {
	private String latclick;
	private String lngclick;
	private String paddress;
	private String pname;
	public MapDAO(String latclick, String lngclick, String paddress, String pname) {
		super();
		this.latclick = latclick;
		this.lngclick = lngclick;
		this.paddress = paddress;
		this.pname = pname;
	}
	public String getLatclick() {
		return latclick;
	}
	public void setLatclick(String latclick) {
		this.latclick = latclick;
	}
	public String getLngclick() {
		return lngclick;
	}
	public void setLngclick(String lngclick) {
		this.lngclick = lngclick;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	
}
