
public class Test {

	public static void main(String[] args) {
		SportsCar c = new SportsCar();
		c.color = "red";
		c.speedUp(100);
		c.speedDown(30);
		c.setTurbo(true);
		
		Car normalCar = new Car();
		normalCar.color = "그린";
		normalCar.speedUp(30);
		normalCar.speedDown(20);
		// normalCar.setTurbo(true); 터보값이 설정되어있지않음. 
		
	}
}
