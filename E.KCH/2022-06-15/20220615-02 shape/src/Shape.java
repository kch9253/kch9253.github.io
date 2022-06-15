// 도형
// x 좌표
// y 좌표

// 넓이 구할수있음
public abstract class Shape { // 추상메소드 부모
	private int x;
	private int y;
	
	public abstract int getArea();  // abstract = 추상메소드 - 동작에대한 구체적x , 구체적인값은 바디에 적는데 이친구는 값이 없기때문에 인스턴스값만 넣는다 / 메소드 head 만 존재
	// 추상메소드는 일반클래스에 존재할수없다. 일반클래스는 인스턴스화 초기화 시켜 사용할수있는데 추상메소드는 이미 인스턴스화 초기화가 되어있기 때문에 일반클래스에 사용할수없다
	// 따라서 클래스 자체도 추상적인 클래스로 변경을 해줘야한다
	
	public Shape() {
	}
	
	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}
}
