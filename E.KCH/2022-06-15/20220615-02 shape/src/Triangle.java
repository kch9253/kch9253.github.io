// �߻�Ŭ������ ����ϴ� 
public class Triangle extends Shape {
	private int base; // �غ�
	private int heigth; // ����
	
	
	public Triangle () {
		
	}
	
	public Triangle(int x, int y , int base, int heigth) {
		super(x, y);
		this.base = base;
		this.heigth = heigth;
	}
	@Override
	public int getArea() { // �θ� �������ִ� ������ �����Ѵ�.
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
