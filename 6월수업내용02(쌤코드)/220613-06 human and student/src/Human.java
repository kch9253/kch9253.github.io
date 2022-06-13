public class Human {
	private String name;
	private int age;
	private String profession;

	public Human(String name, int age, String profession) {
		this.name = name;
		this.age = age;
		this.profession = profession;
	}

	public String getProfession() {
		return profession;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "이름: " + name + ", " + "나이: " + age;
	}
}
