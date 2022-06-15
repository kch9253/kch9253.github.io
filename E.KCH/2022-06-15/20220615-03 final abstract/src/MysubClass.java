// 자식1
public abstract class MysubClass extends MyClass { // 부모가 추상클래스일경우 자식도 추상클래스값을 넣어줘야 상속받을수있다
	
	@Override // 종단클래스 파이널을 선언할경우 메인클래스에서 추상화값을 사용할수없다. 에러가뜬다
	public final void myMethod() { // 부모의 추상화 인스턴스값을 불러와 자식1이 사용함
		System.out.println("자식클래스에서 구현");
	}
	
	public abstract void myMethod2();
}
