package MAP;

public class Map  {
	private String latclick;
	private String lngclick;
	private String paddress;
	private String pname;
	private String number;
	private String opentime;
	private String category;
	private String img;
	private String route;
	private String homepage;
	private String road;
	private String menu;
	
	public Map(String latclick, String lngclick, String paddress, String pname, String number, String opentime,
			String category, String img, String route, String homepage, String road, String menu) {
		super();
		this.latclick = latclick;
		this.lngclick = lngclick;
		this.paddress = paddress;
		this.pname = pname;
		this.number = number;
		this.opentime = opentime;
		this.category = category;
		this.img = img;
		this.route = route;
		this.homepage = homepage;
		this.road = road;
		this.menu = menu;
	}

	public Map() {
		
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
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getOpentime() {
		return opentime;
	}
	public void setOpentime(String opentime) {
		this.opentime = opentime;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	public String getRoad() {
		return road;
	}
	public void setRoad(String road) {
		this.road = road;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "Map [latclick=" + latclick + ", lngclick=" + lngclick + ", paddress=" + paddress + ", pname=" + pname
				+ ", number=" + number + ", opentime=" + opentime + ", category=" + category + ", img=" + img
				+ ", route=" + route + ", homepage=" + homepage + ", road=" + road + ", menu=" + menu + "]";
	}
	
	
}
