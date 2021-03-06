
public class TypeConversion {
	public static void main(String[] args) {
		int i;
		double f;
		
		f = 5 / 4; // f 는 소수점 변수이기때문에 5 / 4 의 남은값 1이 아닌 1.0
		System.out.println(f);
		
		f = (double) 5 / 4; // 5.0 / 4.0 큰 박스값을 따라가기때문에 값 : 1.25의 값이나옴
		System.out.println(f);
		
		f = 5 / (double) 4; // 값 : 1.25
		System.out.println(f); 
		
		f = (double) 5 / (double) 4; // 값 : 1.25
		System.out.println(f);
		
		i = (int) 1.3 + (int) 1.8; // 값 : 2    앞에 int 정수값이 붙었기때문에 1+1 로 된다
		System.out.println(i);
		
		i = (int) (1.3 + 1.8); // 값 : 3  앞에 인트박스가 있지만 (1.3 + 1.8)의 값이 우선순위기때문에 3.1 의 소수점을 뺀 값 3이다
		System.out.println(i);
	}
}