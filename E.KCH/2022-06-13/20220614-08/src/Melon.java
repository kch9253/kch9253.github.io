
public class Melon extends Food{
	String nolgwon; // ���۳��
	
	public Melon() {
		
	}
	
	public String toString() {
		return super.toString() + "����: " + "," + nolgwon;
	}
	
	public Melon(String name , int kall, int won, int kg, String nolgwon) {
		super(name, kall, won, kg);
		this.nolgwon = nolgwon;
	}
}
