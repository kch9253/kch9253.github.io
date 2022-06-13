class Employee {
	public String name;
	String address;
	protected int salary;
	private int RRN;
	
	public Employee() { // �ڽ����� �θ� Ŭ���������� �����ֱ����� ������ִ� �ʱ�ȭ�� �޼ҵ带 �����ߴ�
		
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
	
	public Manager() { // �θ�Ŭ������ ������������� super(); �� ���� ���� �ҷ��´�.
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
