
public class Student extends Human {
	private String major;

	public Student(String name
			, int age
			, String profession
			, String major) {
		super(name, age, profession);
		this.major = major;
	}
	
	@Override
	public String getProfession() {
		return "학생";
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", 전공: " + major;
	}
}
