

import java.util.Scanner;

public class InputString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt(); // int의 정수값을 먼저 입력했을경우 밑에 스트링 라인의 문구열을 입력할수없다 / 순서바뀜 조심
								// int 의 정수값을 먼저넣고 String line 을 밑에 입력할경우 출력해야할 int 값 옆에 스페이스처럼 적용
		System.out.println("한줄을 입력하세요"); // 입력값을 한줄로 표출함
		scan.nextLine(); // 정수를 먼저입력하고 문구를 입력할때 에러가 뜰경우 scan.nextLine(); 를 통해 다음단계로 넘어갈수있게 만들어준다
		String line = scan.nextLine();
		
		System.out.println(line);
	}
}