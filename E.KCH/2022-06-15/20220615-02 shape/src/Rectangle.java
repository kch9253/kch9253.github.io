
public class Rectangle extends Shape{
	private int length; // 가로
	private int height; // 세로
	
	@Override
	public int getArea() {
		return length * height;
	}
	
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Rectangle(int x, int y, int length, int height) {
		super(x, y);
		this.height = height;
		this.length = length;
	}

	
	
	
}
