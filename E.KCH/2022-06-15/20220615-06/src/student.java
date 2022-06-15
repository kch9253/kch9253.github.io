
public interface student { // 인터페이스도 상속할수있다 extend 를통해 // 상속하고 오버라이드 값을 적어줘야한다.
	void self(); // 소개
	void name(); // 이름
	void age(); // 나이
	void hello(); // 인사법
	
}


class Person {} // 사람
class studentPerson extends Person {} // 학생은 사람이다
class Amereca1 extends Person implements Hello{ // 미국인은 사람이다

	@Override
	public void helloo() {
		System.out.println("wassup");
	}

	@Override
	public void self() {
		System.out.println("난 미국인");
	}
	
	} // 미국인사람

class Korea extends studentPerson implements student{ // 한국학생이다
	@Override
	public void hello() {
		System.out.println("안녕");
	}

	@Override
	public void name() {
		System.out.println("이름은 홍길동");
	}

	@Override
	public void age() {
		System.out.println("나이는 22살");
	}

	@Override
	public void self() {
		System.out.println("난 한국학생");
	}} // 한국인학생

class Amereca extends studentPerson implements student { // 미국학생이다
	@Override
	public void hello() {
		System.out.println("hello");
	}

	@Override
	public void name() {
		System.out.println("이름은 jon");
	}

	@Override
	public void age() {
		System.out.println("나이는 23살");
	}

	@Override
	public void self() {
		System.out.println("난 영국학생");
	}} 