// ����
// x ��ǥ
// y ��ǥ

// ���� ���Ҽ�����
public abstract class Shape { // �߻�޼ҵ� �θ�
	private int x;
	private int y;
	
	public abstract int getArea();  // abstract = �߻�޼ҵ� - ���ۿ����� ��ü��x , ��ü���ΰ��� �ٵ� ���µ� ��ģ���� ���� ���⶧���� �ν��Ͻ����� �ִ´� / �޼ҵ� head �� ����
	// �߻�޼ҵ�� �Ϲ�Ŭ������ �����Ҽ�����. �Ϲ�Ŭ������ �ν��Ͻ�ȭ �ʱ�ȭ ���� ����Ҽ��ִµ� �߻�޼ҵ�� �̹� �ν��Ͻ�ȭ �ʱ�ȭ�� �Ǿ��ֱ� ������ �Ϲ�Ŭ������ ����Ҽ�����
	// ���� Ŭ���� ��ü�� �߻����� Ŭ������ ������ ������Ѵ�
	
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
