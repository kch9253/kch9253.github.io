public class IncDec {
	public static void main(String[] args) {
		int a = 55;
		
		a = 78; // int 의 a 값을 지정해도 밑에 a값을 변경가능 55<78 삼켜버림
		
		// a = a +5; // a의 값 78을 +5 하고싶은경우 a = a 이런식으로 추가값을 더해준다
		a += 5; // 위 대입연산을 줄이는 방법
		
		System.out.println(a);
		
		a -= 3; /// 전부다 가능 산술연산자들이 항상 앞에있어야한다 -+/*=   (=)부호는 항상뒤에
		a *= 3;
		a /= 3;
		a %= 2;
		
	}
}