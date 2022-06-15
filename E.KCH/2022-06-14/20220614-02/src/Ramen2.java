
public class Ramen2 extends Ramen{
	String jejo = "농심";  // 제조사
	String name = "육계장"; // 이름
	int won = 1200; // 가격 
	private int year = 2022;
	
	public Ramen2 () {
		
	}
	

	
//	public boolean equals(Object obj) {
//		if (obj instanceof Ramen2) {
//			Ramen2 cup = (Ramen2) obj;
//			return jejo.equals(cup.jejo);
//		} else {
//			return false;
//		}
//	}
	
	public Ramen2(String jejo, String name, int won, int year) {
		super(jejo, name, won);
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString () {
		return "컵라면제조사: " + jejo + "," + "컵라면이름: " + name + "," + "컵라면가격: " + won +  "," + "제조년도는: " + year; 
	}
	

}
