import java.util.Scanner;

public class UserManager extends User1{
	Scanner scan = new Scanner(System.in);
	private int bmi = (kg / (higth)*2);
	
	public UserManager() {
		
	}

	public UserManager(String name, int higth, int kg, int bmi) {
		super(name, higth, kg);
		this.bmi = bmi;
	}
	
	public void getManager() {
		
	}
	
	
}
