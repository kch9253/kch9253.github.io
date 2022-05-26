
public class TestMethod3 {
	public static int getSum(int a, int b) { // prameters. 개수 , 타입 ,순서
	// getSum(int) = int 값을 2개로 지정했으면 메인메소드에 2개값을 호출하여야한다 3개값을 지정하고 2개를 호출하면 에러가뜬다 항상짝이있어야함
	// getSum() = 안에들어가는 타입이 일치해야한다 (String a , int b) 이런식으로 다른타입을 넣어 사용 불가능
		return a + b; // 위 getSum (int a,b) 값을 return 을통해 + 라는 수식을통해 메인메소드로 호출할경우 + 값으로 계산되어나온다
	}
	
	
	
	// 두개 int 정수를 전달받아 곱 연산결과를 반환하는 메소드를 작성하고 호출해 반환값을 출력해보세요
	public static int getMultiply(int x , int y)	{
		return x * y;
	}

		
	public static void main (String[] args) {

		int sum = getSum(30, 60); // 이같은경우도 return 값 그대로 호출되어 + 값으로 나온다
		System.out.println(sum);
		
		// System.out.println(a); = 이같은경우 메소드값을 호출할수없다
		
		System.out.println(getSum(100, 200)); // 이같은경우도 마찬가지
		
		System.out.println(getMultiply(7, 8)); // 두개 int 정수값을 받아 * 값을 출력한
	}
}