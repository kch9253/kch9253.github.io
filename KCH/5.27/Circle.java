// 원의 반지름 (실수형) 을 전달받아 원넓이를 반환하는 메소드 작성후 메인메소드에서 호출하여 출력을통해 값을 확인해보세요

public class Circle {
	public static double getCircleArea(double radius) {
		return radius * radius * 3.14; // 반지름 * 반지름 * 3.14 / radius = 반지름
	}									// 밑에 (5) 이값이 radius 반지름값으로 호출되어 5 * 5 * 3.14 값으로 계산된다
	
	
	public static void main (String[] args){
		double area = getCircleArea(5); // ()안의 값이 double 실수값이랑 일치해야한다 정수를 입력할경우 위 double 메소드가 자료형의 확장으로 int 로변환됨 / 그래서 double를 선언해주고 정수를 입력해도된다. / (5) 이게 반지름값
		System.out.println(area); // 위에 double 선언한거 생략하고 출력부분 ()안에 getCircleArea() 값을 바로 넣어도된다.
	}
}	