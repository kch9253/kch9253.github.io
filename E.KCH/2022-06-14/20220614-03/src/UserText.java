import java.util.Scanner;

// ȸ�� �������α׷�

public class UserText extends User1{
	private int bmi = (kg / ((height)*2)); // bmi ����
	
	public UserText() {
		
	}
	
	static Scanner scan = new Scanner(System.in);
	
	public UserText(String member, String name, int height, int kg, int bmi) {
		super(member, name, height , kg);	
		this.bmi = bmi;
	}	
	
	public void addMember() {
		member = scan.nextInt();
		 System.out.print("�߰��� ȸ�� ��ȣ: ");
	}	 
		  
	
	public void addName() {
		name = scan.next();
		System.out.println("�̸��� �Է��ϼ���: ");
	}
	
	public void addheight() {
		height = scan.nextInt();
		System.out.println("Ű�� �Է��ϼ���: ");
	}
	
	public void addkg() {
		kg = scan.nextInt();
		System.out.println("�����Ը� �Է��ϼ���: ");
	}
	
	public String toString() {
		
		return addMember + addName + addheight ;
	}

	
	
	

	
	


	
}
