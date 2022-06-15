// 자식2
public final class MyImpleClass extends MysubClass { // 자식 1이 자식2에게 상속하는 클래스
// 퍼블릭 옆에 파이널이 붙은 이유는 종단클래스 끝내는 뜻 // 종단클래스가 다른 클래스를 생성하여 상속하려하면 에러가뜬다 파이널은 붙으면 그냥 끝
	@Override
	public void myMethod() { // 부모의 추상화를 자식1이 사용한값
		System.out.println("새롭게 재정의 하였습니다."); // 에러가뜨는이유는 자식1이 mymethod 를 종단클래스로 지정했기때문
	}
	
	@Override // 자식1이 메소드1번을 사용하였기때문에 중복사용불가 따라서 자식1의값을 상속받은 자식2는 메소드 2번을 사용하여 추상화사용
	public void myMethod2() { // 오버라이드 2번이 호출된이유는 부모가 자식1에게 상속했고 자식1이 자식2에게 상속했기때문에
		System.out.println("마이메소드2 오버라이드 구현"); //
	}
	
	public static void main(String[] args) {
		MyClass m = new MyImpleClass();
		m.myMethod();
		
		MysubClass sub = (MysubClass) m;
		sub.myMethod2();
	}

}
