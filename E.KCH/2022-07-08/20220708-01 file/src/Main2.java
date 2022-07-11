import java.io.File;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) {
		
		File file = new File(".\\"); // (.) = 현재경로를 의미한다 / 상대적인경로를의미한다
									// . 을 기준으로 찾을경우 내기준으로 찾는다
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.exists());
		
		System.out.println(file.getAbsolutePath()); // getAbsolutePath 의 경우 현재 내가작업하는 파일의 현재 경로를 나타내준다 출력값을 보면 맨끝에 \. 이붙는데 이값은 현재경로를 나타내준다 
		try {
			System.out.println(file.getCanonicalPath()); // getCanonicalPath 일반적으로 호출할경우 에러가뜬다 이 메소드경우 예외에 대한 호출만가능하다.
		} catch (IOException e) { // getCanonicalPath 의 같은경우 현재경로를 해석된 값을 나타내준다.
			e.printStackTrace();
		}
		
		
		File fileparent = new File("..\\"); // ..은 상위경로를 나타내준다 파일을 감싸고 있는 한단계위의 폴더를 나타내준다 (부모개념)
		
		System.out.println(fileparent.getAbsolutePath()); // getAbsolutePath 현재 경로의 설명을 나타내준다 
		try {
			System.out.println(fileparent.getCanonicalPath()); // getCanonicalPath 현재 경로의 대표위치만 딱알려준다
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		try {
			File file3 = file.getCanonicalFile().getParentFile();
			// getCanonicalFile = 절대적인경로를 나타낼수있게 파일경로를 나타내준다
			// getParentFile = 파일상위 객체를 나타내준다.
			System.out.println(file3.getAbsolutePath());
			System.out.println(file3.getCanonicalPath());
			System.out.println(fileparent.equals(file3));
			
			System.out.println(fileparent.getCanonicalFile().equals(file3));
			System.out.println(fileparent.getCanonicalFile().compareTo(file3));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	
	
		
	}
}













