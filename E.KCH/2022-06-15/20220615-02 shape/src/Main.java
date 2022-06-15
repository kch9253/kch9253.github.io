// 삼각형 // 중심 xy // 밑변 // 높이 // 넓이 구할수있음
// 직사각형 // 중심 xy // 가로 // 세로 // 넓이 구할수있음
// 원 // 중심 xy // 반지름 // 넓이 구할수있음


public class Main {
	public static void main(String[] args) {
//		Shape s1 = new Shape(); // 추상화클래스를 메인에 인스턴스화 시켜 사용할수없다
//		Shape s2 = new Shape(10, 20);
		
		
		Shape r = new Rectangle (0,0,10,10); 
		System.out.println(r.getArea());
		
		Shape c = new Circle(0, 0, 5);
		System.out.println(c.getArea());
		
//		Triangle t = new Triangle(0, 0, 5, 5);
//		System.out.println(t.getArea());
	}
}
