// class Car {
	
	// String color;
	// int speed;
	// int gear;
	// void print() {
		// System.out.println("(" + color + " , " + speed +" , " + gear + ")");
	// }
// }
// public class CarTest {
	// public static void main (String[] args) {
		// Car myCar = new Car();
		// myCar.color = "red";
		// myCar.speed = 0;
		// myCar.gear = 1;
		// myCar.print();
		
		// // 색상 : blue 속도 : 60 기어 : 3
	// }
// }


class Car {
	
	String color;
	int speed;
	int gear;
	void print() {
		System.out.println("(" + color + " , " + speed + " , " + gear + ")");
	}
}

public class CarTest {
	public static void main (String[] arg) {
		Car myCar = new Car();
		myCar.color = "blue";
		myCar.speed = 60;
		myCar.gear = 3;
		myCar.print();
	}
}