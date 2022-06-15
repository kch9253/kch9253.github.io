// ´ë°¡¸®

public class User1 {
	protected String name;
	protected int higth;
	protected int kg;
	
	public User1() {
		
	}
	
	public User1(String name, int higth, int kg) {
		super();
		this.name = name;
		this.higth = higth;
		this.kg = kg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHigth() {
		return higth;
	}

	public void setHigth(int higth) {
		this.higth = higth;
	}

	public int getKg() {
		return kg;
	}

	public void setKg(int kg) {
		this.kg = kg;
	}
}
