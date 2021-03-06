class Point {
	private int x , y;
	
	public Point(int a , int b) {
		x = a;
		y = b;
	}
	
	
}

class Circle {
	public int radius = 0;
	private Point center; // has-a 관계
	
	public Circle(Point p, int r) {
		center = p;
		radius = r;
	}
	public Point getPoint() {
		return center;  // 중심점 getter
	} 
	public void setPoint(Point p) {
		this.center = p;
	}
}

public class CircleTest {
	public static void main(String[] args) {
		Point p = new Point(25, 78);
		Circle c = new Circle(p, 10);
		
		System.out.println(p);
		System.out.println(c.getPoint());
	}
}