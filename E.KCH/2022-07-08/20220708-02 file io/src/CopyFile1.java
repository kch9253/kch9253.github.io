import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile1 {
	public static void main(String[] args) throws IOException{
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream(new File("input.txt"));
			out = new FileOutputStream("output.txt");
			int c;
			
			while ( (c = in.read()) != -1) { // 위에 int c 를 지정하고 반복문을 통해 인덱스값으로 문자열을 읽어내도록 in.read 메소드를 호출해줬다
				// in.read()는 파일안의 문자열을 끝까지 다읽어내면 마지막결과는 -1 값이 출력된다 따라서 != -1 를 통해 문자열을 끝까지 다읽어내고 마무리짓기위해 -1이 아니다 라고 부정문을 지정해줬다
				out.write(c); // out.wirte(c) 는 input 파일을의 문자열을 똑같이 읽어내고 만들어내라 메소드를 호출해줬다 따라서 in,out 의 파일안의 문자열이 동일하게 나타난다.
			}					// read 는 1 바이트씩 읽는조건이다 (한글자한글자씩)
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
