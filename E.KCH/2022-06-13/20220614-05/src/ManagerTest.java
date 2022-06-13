class Employee {
	public String name;
	String address;
	protected int salary;
	private int RRN;
	
	public Employee() { // 자식한테 부모 클래스값들을 물려주기위해 들고갈수있는 초기화된 메소드를 생성했다
		
	}
	
	public Employee(String name, String address, int salary, int rRN) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		RRN = rRN;
	}
	
	public String toString() {
		return name + "," + address + "," + RRN + "," + salary;
	}
}



class Manager extends Employee {
	private int bonus;
	
	public Manager() { // 부모클래스를 데리고오기위해 super(); 를 통해 값을 불러온다.
		super();
	}
	
	public Manager (String name, String address, int salary, int rRN) {
		super (name, address , salary , rRN);
		this.bonus = bonus;
	}
	
	public void printSalary() {
		System.out.println(name + "(" + address + "):" + (salary + bonus));
	}
	
	public void printRRN() {
		//System.out.println(RRN);
	}
}






public class ManagerTest {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.printRRN();

	}

}
