public class Car {
	private int speed; // 접근제한자 = private , public int , int
	private int gear; // private = 외부에서는 필드를 변경할수도 확인할수도없다. 접근금지 / 자기자신의 범위안에서만 범용할수있다
	private String color; // 자기자신만 볼수있게만든다 외부에서는 못봄 , 중요한 문서같은역활
	
	
	public Car(String c , int s, int g) {
		color = c;
		speed = s;
		gear = g;
	}
	
	public Car(String c) { // ()안에 String c 를 넣은이유는 c값만 그대로쓰고 s,g 값만 사용자가 지정하여 쓰기땜에 
		this(c, 0, 1); // this() = 자기자신을 참조하는역활 , 자기자신의 생성자를 호출
		
		System.out.println("초기화중");
	}	
	
	// private 접근 / 메인에 출력할수있도록 설정하는방식
	public String getColor() {
		return color;
	}
	// private 설정
	public void setColor(String c) {
		color = c;
	}
}

//-----------------------------------------------------------다른영역

public class TestCar {
	public static void main(String[] args) {
		Car c = new Car("green", 10, 1); // 입력된값이 3개이기때문에 첫번째 초기화 값으로간다
		Car c2 = new Car("yellow"); // 2번째 초기화값인 (String c) 의 초기화값만 그대로 쓴다고 지정해뒀기때문에 new Car(문구)값은 그대로 출력되고 나머지 0,1 값은 저절로 따라온다
		Car c3 = new Car("red");
		
		// c.color = "빨강"; // 컴파일 에러가뜨는이유는 맨위에 class 에있는 private값 때문이다
		// System.out.println(c.color);
		
		c.setColor("빨강");
		System.out.println(c.getColor());
	}
}