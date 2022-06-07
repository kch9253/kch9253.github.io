import java.util.Arrays;

public class Main4 {
	static void printArray(char[] array) { // 알트+쉬프트+R = 해당하는 문자 값 전부 수정가능
		for (int i = 0; i < array.length; i++) { // length = 자리수
			System.out.print(array[i]);
			
		}
	}

	// 배열의 모든 원소를 문자열로 표현해서 반환하는 메소드
	static String arrayToString(char[] target) {
		String str = "";
		for (int i = 0; i < target.length; i++) {
			str += target[i];
		}
		return str;
	}
	
	// 케릭터 배열에서 하나의 특정 문자의 인덱스를 찾아 반환하는 메소드
	static int whereIs(char[] target, char c) {
		for (int i = 0; i < target.length; i++) {
			if (target[i] == c) {
				return i; // 이 리턴값은 char 의 값을 찾았을때만 반응하기때문에 밑에 리턴값 -1 을 추가로 입력한다.
			}
		}
		return -1;
	}
	


	public static void main(String[] args) {
		char[] hello = {'H' , 'e' , 'l' , 'l' , 'o' };
		String relust = Arrays.toString(hello); // Arrays.toString = 문자열 반환하는 함축된코드
		System.out.println(relust);
		
//		printArray(hello);
//		String result = arrayToString(hello);
//		System.out.println(result);
		
//		for (int i = 0; i < hello.length; i++) {
//			System.out.println(hello[i]);
//		}
		
		
		// 위 문자 배열에 o 문자에 해당하는 인덱스를 찾아보기
//		int[] Box = new int[4];
//		System.out.println("l의 자리수는: " + Box.length);
		
//		for (int i = 0; i < hello.length; i++) {
//			if (hello[i] == 'o') {
//				System.out.println("찾음: " + i);
//			}
//		}

		
	}
}
