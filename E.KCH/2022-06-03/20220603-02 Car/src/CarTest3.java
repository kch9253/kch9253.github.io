class Car {
	private String color;
	private int speed;
	private int gear;
	private int id;
	
	private static int numberOfCars = 0;
	// private 값이라면 getter 값이없다면 출력할수없다
	// static 은 필드값이 아니고 객체외부에서 따로노는 성질이다
	// static 값을 넣을경우 public 값을 이용해 공유하진않는다 private 를 통해 어느 지정영역에서만 사용하는것이 좋다
	// 임의의 지정값을 두고 공유하고싶다면 final 상수값을 통해 지정값을 정하고 공유하는것이좋다
	// ex) public static final int SHARE_NUMBER = 10; (상수값 이름 all 대문자필수)
	public Car(String c , int s , int g) {
		color = c;
		speed = s;
		gear = g;
		
		numberOfCars++;
		id = numberOfCars;
	}
	
	public static int getNumberOfCars() {
		return numberOfCars;
	}
	
//	public static void printStaticNumber() {
//		System.out.println(Car.color);
//	}
	
	
}

 
public class CarTest3 {
	public static void main(String[] args) {
		
		
		
		
		Car c1 = new Car("blue" , 100 , 1);
		Car c2 = new Car("while" , 0 , 1);
		int n = Car.getNumberOfCars();
		System.out.println("지금까지 생선된 자동차 수 = " + n);
	}
}

