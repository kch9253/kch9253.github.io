
public class Magazine extends Book{
	String balmail; // 발매일 정보
	
	public Magazine() {		
	}
	
	public String toString() {
		return super.toString() + "," + "발매일 정보: " + balmail;
	}
	
	public String getBalmail() {
		return balmail;
	}

	public void setBalmail(String balmail) {
		this.balmail = balmail;
	}

	public Magazine(String name, int page, String jeuja , String balmail) {
		super(name , page, jeuja);
		this.balmail = balmail;
	}
}
