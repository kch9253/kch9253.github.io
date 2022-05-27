// 객체화 시켜보자

public class TestBox {
	public static void main (String[] args) {
		// Box none = null; // Box 라는 참조형 변수를 null 를 선언하여 사용할수있다 / null = 지금 참조하고있는게없다. 그냥 없다는뜻
		// none.width = 10;
		
		
		
		
		
		// 박스 클래스에 선언된 값만 데리고와서 사용할수있다 예를들어 box1.color 를 데리고오면 없는값이라 에러뜸
		
		
		
		
		 // 클래스 박스가 하나의 타입으로 사용된다. 박스의 객체값을 testbox 라는 클래스에 호출해서 사용한다
		Box box1 = new Box(); // ()=인스턴스 를 통해 기존의 박스클래스의 가로세로높이 값을 그대로 불러와 사용가능하다
							// 클래스 박스의 값이 정하지않았기때문에 값을 직접 정해줘야한다.
							
		box1.width = 3; // 이런식으로 박스1번의 가로세로높이의 값을 정해줬다.
		box1.length = 3;
		box1.height = 3;
		
		
		Box box2 = new Box(); // ()선언을 비우고 초기화를 선언했기때문에 박스2번의 값을 정해줄때는 밑에 적어준다.
		box2.width = 10; // 박스2번의 값을 정해줬다.
		box2.length = 10;
		box2.height = 10;
		
		System.out.println(box1.getVolume());
		System.out.println(box2.getVolume());
		
		box1.printAllState();
		box2.printAllState();
		
		// System.out.println(box1.width);
		// System.out.println(box2.width);
		
		// box1.width = 5;
		// System.out.println(box1.width);
	}
}
