import java.util.Scanner;

// 회원 관리프로그램

public class UserText extends User1{
	private int bmi = (kg / ((height)*2)); // bmi 지수
	
	public UserText() {
		
	}
	
	static Scanner scan = new Scanner(System.in);
	
	public UserText(String member, String name, int height, int kg, int bmi) {
		super(member, name, height , kg);	
		this.bmi = bmi;
	}	
	
	public void addMember() {
		member = scan.nextInt();
		 System.out.print("추가할 회원 번호: ");
	}	 
		  
	
	public void addName() {
		name = scan.next();
		System.out.println("이름을 입력하세요: ");
	}
	
	public void addheight() {
		height = scan.nextInt();
		System.out.println("키를 입력하세요: ");
	}
	
	public void addkg() {
		kg = scan.nextInt();
		System.out.println("몸무게를 입력하세요: ");
	}
	
	public String toString() {
		
		return addMember + addName + addheight ;
	}

	
	
	

	
	


	
}
