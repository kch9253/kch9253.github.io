
public class Food {
	protected String name;
	protected int kall;
	protected int won;
	protected int kg;
	
	public Food() {
		
	}
	
	public String toString() {
		return "����: " + name + "," + "Į�θ�: " + kall + "," + "����: " + won + "," + "���Դ�: " + kg;
	}
	
	public Food(String name , int kall, int won, int kg) {
		this.name = name;
		this.kall = kall;
		this.won = won;
		this.kg = kg;
	}

	public int getKall() {
		return kall;
	}

	public void setKall(int kall) {
		this.kall = kall;
	}

	public int getWon() {
		return won;
	}

	public void setWon(int won) {
		this.won = won;
	}

	public int getKg() {
		return kg;
	}

	public void setKg(int kg) {
		this.kg = kg;
	}
	
}
