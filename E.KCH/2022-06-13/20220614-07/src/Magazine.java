
public class Magazine extends Book{
	String balmail; // �߸��� ����
	
	public Magazine() {		
	}
	
	public String toString() {
		return super.toString() + "," + "�߸��� ����: " + balmail;
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
