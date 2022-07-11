import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main4 {
	public static void main(String[] args) {
		File file = new File("d:\\filetest\\lineio.txt");
		
		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter(new FileWriter(file));
			
			pw.println("문자열 할줄을 출력합니다.");
			pw.println(10);
			pw.println(15.15);
			pw.flush(); // 위에 프린트한 값들을 전부 출력하기위한조건
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}
}
