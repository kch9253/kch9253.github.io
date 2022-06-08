// 가변길이
public class Main7 {
	public static void someMethod(double d, int... arr) { // 안의 파라미터 값을 여러개 입력하고싶을땐 int... 값을 맨마지막에 넣어야함
										// double 값은 첫번째 값 40만 먹고 , int... 배열의값은 나머지 50,60,70,80 출력한다
		
		// 인덱스없이 순환하는방법
		for (int number : arr) { // : 기준으로 오른쪽은 배열처럼 여러개를 담을수있는 객체를 선언
			 // 흘러가는 방향은 무조건 오른쪽으로 방향을 바꿀수없다
			// 처음 부터 끝까지 값을 확인하려면 : 이 들어간 포이치문이 좋다
			// 값을 수정하는 조건으로 포이치문을 사용하는것은 좋지않다  , 값을 확인하는 용도로만 사용하는것이좋다.
			// arr[1] = 50; 이런식으로 값을 변경하는것은 좋지않다.
			System.out.println(number);
		}
	}
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		
		someMethod(40, 50, 60, 70, 80);
		
//		someMethod(arr);
//		someMethod(new int[] {20, 30, 40, 50, 60}); // someMethod 경우 기존의 arr 값과 배열이 맞아야한다
//		System.out.println("---");
//		someMethod(new int[] {4, 5, 6});
	}
}

	// 정수 2개를 전달받아 합을 구해서 반환하는 메소드
// 	public static int sum(int a, int b) {
// 		for (int i = 0; i < numbers.length; i++) {
// 			sum += numbers[i];
// 		}
// 		return sum;
// 	}
//
// 	public static void main(String[] args) {
// 		int result = sum(10, 20, 30, 40, 50,);
// 		System.out.println(result);
// 	}