

public class Count {
	public static void main (String[] args){
		// 300~ 400 사이의 정수 중 13의 배수를 찾아 몇개가있는지 출력
		int count = 0;
		for (int i = 300; i <= 400; i++) {
			if (i % 13 == 0) { // 몇개인지 개수를 세야함 
			// 개수를 세기위해 int 의 박스를 하나더만들고 0 이라는 미지수값을 지정한후 출력한다 
			System.out.println("확인: " + i);
				count++;
			}
		}
			System.out.println(count);
	}
}