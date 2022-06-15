
public interface Flyable { // interface = 클래스처럼 하나의 타입으로 사용가능 / 추상적인 동작표현 , 객체들끼리 소통할수있는 통로역활
// interface 의 클래스 이름을 정할때 추상적인 동작같은 표현을 많이하기때문에 이름을 그와관련되게 잘지어주는것이좋다
	// flying 뭐 이런식 동작의 형태로 이름을 적어도되는데  인터페이스 클래스라고 표기하고싶을경우 iFlyable 이런식으로 i 를 적어도된다.
	// 인터페이스는 추상메소드만 가지고있다
	
//	public abstract void fly(); // 추상표현
//	// 인터페이스의 클래스경우 퍼블릭값 없이 (pubilc abstract)를 생략하고 void fly(); 만 입력하여도 퍼블릭값으로 된다 
	
	void fly();
}

class Animal {} // 동물이다
class Bird extends Animal {} // 새는동물이다
class Eagle extends Bird implements Flyable{ //  Flyable 안에 추상화 값이있기때문에 이클래스에도 추상값을 입력해야한다
	@Override 
	public void fly() {
		System.out.println("독수리가 푸드득 푸드득 납니다.");
	}} 
// 인터페이스 = 구현한다 // implements = 구현하고자하는 상속값 
// 독수리는 날수있는새다
class pengguin extends Bird {} // 펭귄은 새다

class FlyingFish extends Animal implements Flyable { // 이것도 마찬가지로 Flyable 값이있기때문에 추상값을 입력해야함
	@Override
	public void fly() {
		System.out.println("날치가 물위로 남");
	}
}

class Plane implements Flyable {
	@Override
	public void fly() {
		System.out.println("비행기가남");
	}
	
}