


// public void sound() {} 값을 출력할때 문자열,숫자 출력가능하다


public class Animal {
	public void sound() {
		System.out.println("각각 다른 소리냄");
	}
}


class Dog extends Animal {
	public void sound() { // method override (부모클래스에있는 메소드를 헤더부분을 그대로 적어서 바디부분을 자식클래스에 맞게끔 최소화 시켜놓은방식)
		System.out.println("멍");
	}	
}


class Cat extends Animal {
	public void sound() {
		System.out.println("야옹");
	}
}