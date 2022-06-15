// 추상클래스를 상속하는 
public class Triangle extends Shape {
	private int base; // 밑변
	private int heigth; // 높이
	
	
	public Triangle () {
		
	}
	
	public Triangle(int x, int y , int base, int heigth) {
		super(x, y);
		this.base = base;
		this.heigth = heigth;
	}
	@Override
	public int getArea() { // 부모가 가지고있는 성질을 구현한다.
		return base * heigth / 2;
	}
	
	public int getBase() {
		return base;
	}
	
	public void setBase(int base) {
		this.base = base;
	}
	
	public int getHeigth() {
		return heigth;
	}
	
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	

}
