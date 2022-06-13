
public class Person {
	private String name;
	protected int age; // protected = 자식들이 접근할수있게 만들어놓은 접근제한자
							// protected = 해당클래스의 자식들뿐 아니라 다른 패키지에 속하는 애들도 받을수있음
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() { // 퍼블릭한값을 들고있기때문에 부모의 getter 값은 자식들에게 전부 호출할수있다.
		return name;
	}

	public int getAge() {
		return age;
	}


		
}
