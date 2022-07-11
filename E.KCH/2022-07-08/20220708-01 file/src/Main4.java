import java.io.File;
import java.io.IOException;

public class Main4 {
	public static void main(String[] args) {
		
		File filekor = new File("d:\\filetest\\한글이름.txt");
//		try {
//			System.out.println("생성됨? " + filekor.createNewFile());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
//		filekor.renameTo(new File("d:\\filetest\\newname.txt")); // 위에생성된  파일이름을 변경하기위한 메소드
		
		File mytext = new File("d:\\filetest\\mytext.txt");
		mytext.delete(); // 생성된 파일을 지우는
	}
}
