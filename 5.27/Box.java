// 객체를 만들어보자

public class Box {
	// 값/상태 -> 맴버변수 (member variable) / 필드 (fields)
	int length; 
	int width; 
	int height; 
	int volume = length * width * height;

	// 메소드 = 기능 or 동작
	public void printAllState() { 
	// printAllState 라는 새로운 메소드를 만들고 여기서 출력을 통해 동작해! 라고 선언한다 그리고 Testbox 에 printAllState(); 선언을통해 밑에 출력한 가로 세로 높이 가 Testbox 클래스에 출력된다
		System.out.println(width); // 박스라는 객체를 형성한 기능을 동작시켜보기?
		System.out.println(length);
		System.out.println(height);
		
	}
	// 박스는 자기자신의 부피를 구해서 정수형 값으로 알려줄수있음
	public int getVolume () {
		return width * length * height;
	}
}