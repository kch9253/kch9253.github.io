// 쌤예시

public class Dog2 {
	private String name;
	private String breed;
	private int age;
	
	
	public Dog2(String n , String b , int a) {
		name = n;
		breed = b;
		age = a;		
	}
	
	public Dog2(String n, String b) {
		this(n , b , 1);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	
	public String getBreed() {
		return breed;
	}
	public void setBreed(String b) {
		breed = b;
	}
	
	public int getAge() {
		return name;
	}
	public void setAge(String a) {
		age = a;
	}
	
	public void printAll() {
		System.out.println(name);
		System.out.println(breed);
		System.out.println(age);
	}
}

public class TestDog2 {
	public static void main(String[] args) {
		Dog2 d1 = new Dog2("초코" , "푸들" , 7);
		Dog2 d2 = new Dog2("예삐" , "말티즈");
		
		d1.printAll();
		d2.printAll();
	}
}