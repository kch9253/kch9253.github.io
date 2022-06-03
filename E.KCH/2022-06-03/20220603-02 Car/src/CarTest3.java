class Car {
	private String color;
	private int speed;
	private int gear;
	private int id;
	
	private static int numberOfCars = 0;
	// private ���̶�� getter ���̾��ٸ� ����Ҽ�����
	// static �� �ʵ尪�� �ƴϰ� ��ü�ܺο��� ���γ�� �����̴�
	// static ���� ������� public ���� �̿��� ���������ʴ´� private �� ���� ��� �������������� ����ϴ°��� ����
	// ������ �������� �ΰ� �����ϰ�ʹٸ� final ������� ���� �������� ���ϰ� �����ϴ°�������
	// ex) public static final int SHARE_NUMBER = 10; (����� �̸� all �빮���ʼ�)
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
		System.out.println("���ݱ��� ������ �ڵ��� �� = " + n);
	}
}

