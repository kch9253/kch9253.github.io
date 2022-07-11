import java.io.File;
import java.io.IOException;

public class Main3 {
	public static void main(String[] args) {
//		File file = new File("d:\\filetest");
//		System.out.println("있음? " + file.exists());
//		System.out.println("폴더임? " + file.isDirectory());
//		System.out.println("파일명? " + file.isFile());
//		
//		boolean result = file.mkdir(); // mkdir = 메이크디렉토리의 약자 (디렉토리가 없더라도 만들어낼수있음)
//		System.out.println("디렉토리 생성여부: " + result);
		
		// d드라이브에 filetest 폴터 (디렉토리) 안에 abc 폴더를 생성해보세요
//		File abc = new File("d:\\filetest\\abc");
//		abc.mkdir(); // mkdir = 디렉토리생성 (폴더개념) 
		
//		File file2 = new File("d:\\filetest\\abc\\..\\def");
//		file2.mkdir();
//		File file3 = new File(file2.getCanonicalFile()); // getCanonicalFile = 파일객체를 반환해주는거다
														// getCanonicalPath = 파일문자열을 반환해주는거다
		
		File textFile = new File("d:\\filetest\\mytext.txt");
		try {
			boolean result = textFile.createNewFile();  // createNewFile 파일생성 (파일개념)
			System.out.println("생성됨? " + result);
		} catch (IOException e) { // IOException = 예외처리로 무조건 잡아줘야한다.
			e.printStackTrace();
		}
	}
}
