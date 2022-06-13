
public class Melon extends Food{
	String nolgwon; // 경작농원
	
	public Melon() {
		
	}
	
	public String toString() {
		return super.toString() + "정보: " + "," + nolgwon;
	}
	
	public Melon(String name , int kall, int won, int kg, String nolgwon) {
		super(name, kall, won, kg);
		this.nolgwon = nolgwon;
	}
}
