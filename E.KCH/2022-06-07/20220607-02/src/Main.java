public class Main {
	public static void main(String[] args) {
		int[] aBox; // 정수형 배열 변수선언. // []를 쓸경우 해당타입을 여러개담을수있다 한가지의값만 입력불가능
		aBox = new int[4]; // 길이가 4인 배열 초기화 // 처음에 배열값을 정해두면 값을 변경할수없다. [] 안에 입력한값 그대로사용
		// 길이값은 정하는 즉시 상수형 타입이 선언되어 변경 불가능
		System.out.println("배열의 길이값: " + aBox.length); 
		
		aBox[0] = 56;
		aBox[1] = 57;
		aBox[2] = 58;
		aBox[3] = 59;
		
		System.out.println(aBox[0]);
		System.out.println(aBox[1]);
		System.out.println(aBox[2]);
		System.out.println(aBox[3]);
	}
}
