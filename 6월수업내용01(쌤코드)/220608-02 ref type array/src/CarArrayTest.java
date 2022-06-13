public class CarArrayTest {
	public static void main(String[] args) {
		final int NUM_CARS = 5;
		Car[] cars = new Car[NUM_CARS];

		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car();
		}
		for (Car car : cars) {
			car.speedUp();
		}
		for (Car car : cars) {
			System.out.println(car);
		}

//		for (int i = 0; i < cars.length; i++) {
//			System.out.println(cars[i]);
//		}
	}
}