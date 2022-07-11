import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		String line = "hello"; // 해당문자열을 밑에 write 를 통해 호출하고싶지만 write는 문자하나하나씩 입력을 받기때문에 hello 를 출력할수없다
		try {
			fos = new FileOutputStream(new File("d:\\filetest\\practice.txt"));
			
			fos.write(line.getBytes()); // getBytes 를통해 문자열 하나하나씩 입력받을수있도록 메소드를 생성했다
										// write 는 문자열 하나씩만 받을수있기때문에 겟바이트스를 통해 전달받고자하는 문자열 전체를 전달받을수있다.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
