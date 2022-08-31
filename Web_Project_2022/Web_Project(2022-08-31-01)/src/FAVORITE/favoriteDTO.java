package FAVORITE;

public class favoriteDTO {
	private String userid;
	private String latclick;
	private String pname;
	private String paddress;
	public favoriteDTO(String userid, String latclick, String pname, String paddress) {
		super();
		this.userid = userid;
		this.latclick = latclick;
		this.pname = pname;
		this.paddress = paddress;
	}
	
	public favoriteDTO() {
		
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getLatclick() {
		return latclick;
	}
	public void setLatclick(String latclick) {
		this.latclick = latclick;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	@Override
	public String toString() {
		return "favoriteDTO [userid=" + userid + ", latclick=" + latclick + ", pname=" + pname + ", paddress="
				+ paddress + "]";
	}
	
	
}
