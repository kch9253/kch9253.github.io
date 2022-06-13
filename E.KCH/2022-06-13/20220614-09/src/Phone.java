
public class Phone {
	protected String jejo;
	protected int won;
	protected String type;
	
	public Phone() {
		
	}
	
	public String toString() {
		return "제조사: " + jejo + "," + "가격: " + won + "," + "타입: " + type;
	}
	
	public Phone(String jejo, int won, String type) {
		super();
		this.jejo = jejo;
		this.won = won;
		this.type = type;
	}
	public String getJejo() {
		return jejo;
	}
	public void setJejo(String jejo) {
		this.jejo = jejo;
	}
	public int getWon() {
		return won;
	}
	public void setWon(int won) {
		this.won = won;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
