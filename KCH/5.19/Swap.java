public class Swap {
	public static void main(String[] args) {
		int a = 10;
		int b = 55;
		int c = a; // a 값이 사라지지않게 c 라는 공간을형성
		
		a = b; // 둘의 값을 교환 b=55 a=55 둘이 55가나온경우  55가 10을 삼켜버림
		b = c; // 작은숫자 10을 살리고싶은경우 c라는 공간을 하나 더 형성하여 변수를 막아준다
		
		System.out.println(a);
		System.out.println(b);
	}
}