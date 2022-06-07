// 길이가 5인 정수 int 형 배열을 선언 초기화하고
// 모든 원소의 값을 100으로 설정해보세요.


public class Main2 {

	public static void main(String[] args) {
		int[] aBox; //처음에는 초기화만 시켜주고
		aBox = new int[5]; // 초기화한값을 불러와서 자리값을 설정해준다
		
		System.out.println("배열의 길이값: " + aBox.length); 
		
//		aBox[0] = 100; // 위에 선언한값이 5라도 항상 0부터 시작하기때문에 -1 값으로 적어야한다.
//		aBox[1] = 100;
//		aBox[2] = 100;
//		aBox[3] = 100;
//		aBox[4] = 100;
		
		for (int i = 0; i < aBox.length; i++) {
			aBox[i] = 100;
		}
		
		for (int i = 0; i < aBox.length; i++) {
			System.out.println(i + "번째 index의 원소값: " + aBox[i]);
		}
		
		
		
//		System.out.println(aBox[0]);
//		System.out.println(aBox[1]);
//		System.out.println(aBox[2]);
//		System.out.println(aBox[3]);
//		System.out.println(aBox[4]);

	}

}
