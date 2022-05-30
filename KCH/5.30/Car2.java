
// Car 클래스의
// 외부에서 접근 가능한 필드를
// private 접근 제한자로 변경하고

// public한 getSpeed 메소드를 통해
// speed 값에 접근이 가능하고
// public한 setSpeed 메소드를 통해
// speed 값 변경이 가능하도록 코드작성 (gear도)

public class Car2 {
	private int speed;
	private int gear;
	
	public Car2(int s , int g) {
		speed = s;
		gear = g;
	}
	
	public int getspeed() {
		return speed;
	}
	
	public void setspeed (int s) {
		speed = s;
	}
	
	public int getgear() {
		return gear;
	}
	
	public boolean setgear (int g) {
		gear = g;
	}
}


