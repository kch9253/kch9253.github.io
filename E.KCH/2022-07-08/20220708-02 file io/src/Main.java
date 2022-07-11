import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		File diaryFile = new File("d:\\filetest\\내용연습.txt");
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(diaryFile, "UTF-8"); // scanner 를 통해 파일을 경로를 만들어서 스프링 역활을 해준다.
											// scanner 는 콘솔창의 입력값도 받을수있지만 파일의경로도 받을수있다
											// UTF-8 = 을 입력한 이유는 인코딩문제로인해 한글문자열을 읽어내지못했기때문이다
			while (scanner.hasNext()) { // 반복문을통해 hasNext 하여 전체문장을 호출하고
				System.out.println(scanner.nextLine()); // 전체문장에 포함되어있는 모든 문자열을 nextLine 을 통해 호출한다.
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지못했습니다.");
		} finally { // scanner 를 통한 스프링경로를 무조건 제거하기위해 파이널을 호출한다 
			if (scanner != null) { // 스캐너의 값은 존재한다 라고 부정문을 통하여 notnull 개념을 넣어주고
				scanner.close(); // 클로즈를 통해 해당파일을 닫지않으면 계속해서 연결통로를 연결해놓기때문에 자원낭비가 되기때문에 작업이 끝난 파일의경우 닫아주는것이좋다
			}
		}
	}
}
