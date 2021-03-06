
// 강아지 Dog 클래스
// name : 이름
// breed : 종
// age : 나이

// 강아지의 3개의 모든 필드를 초기화 할수있는 생성자

// 강아지 이름, 종  초기화하고 전달받은 값으로 초기화하고
// 나이는 1살로 초기화 할수있는 생성자

public class Dog {
	private String name;
	private String breed;
	private int age;
	
	public Dog(String n , String b , int a) {
		name = n;
		breed = b;
		age = a;
	}		
	
	public Dog(String n, String b) {
		this(n, b, 1);
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String n) {
		name = n;
	}
	
	public String getbreed() {
		return breed;
	}
	
	public void setbreed(String b) {
		breed = b;
	}
	
	public int getage() {
		return age;
	}
	
	public int setage(int a) {
		age = a;
	} 
	
}