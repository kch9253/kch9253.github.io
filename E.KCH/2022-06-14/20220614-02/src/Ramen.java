// 컵라면
// 제조사
// 이름
// 가격

// 생성자 , 게터세터


public class Ramen {
	protected String jejo = "삼양";  // 제조사
	protected String name = "신라면"; // 이름
	protected int won = 1500; // 가격
	
	public Ramen () {
		
	}
	
	public String toString() {
		return "컵라면제조사: " + jejo + "," + "컵라면이름: " + name + "," + "컵라면가격: " + won;
	}
	
	public Ramen(String jejo, String name, int won) {
		super();
		
		this.jejo = jejo;
		this.name = name;
		this.won = won;
	}

	public String getJejo() {
		return jejo;
	}

	public void setJejo(String jejo) {
		this.jejo = jejo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWon() {
		return won;
	}

	public void setWon(int won) {
		this.won = won;
	}
	
	
//	public boolean equals(Object obj) {
//		if (obj instanceof Ramen2) {
//			Ramen2 cup = (Ramen2) obj;
//			return jejo.equals(cup.jejo);
//		} else {
//			return false;
//		}
//	}
	
}
