import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main5 {

	public static void main(String[] args) {
		File file = new File("d:\\filetest\\lineio.txt");
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			
			String line;
			while ( (line = br.readLine()) != null) { // readLine의 값에 대한 문자열을 시스템이 읽을때 -1 값이아닌 null 값으로 읽는다(마지막값을) 그래서 null 아니다라고 정의한다
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}