import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main3 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		
		try {
			File file = new File("d:\\filetest\\practice.txt");
			int length = (int) file.length(); // 랭쓰 문자열값을 인트값으로 다운캐스팅하고
			byte[] buf = new byte[length]; // 바이트배열을 생성하고 그안에 다운캐스팅한 랭쓰값을 다시 초기화해줬다
			 
			fis = new FileInputStream(file); // 따라서 파일인풋스트림 ()안에 파일을 호출해주고
			fis.read(buf); // 최종적으로 스트링값을 인덱스값으로 초기화해준 바이트 배열안에 들어있는 문자열들을 read 를 통해 전부 읽어내라고한다.
			
			String result = new String(buf); // 그다음 스트링값으로 buf안에있는 값을 읽어라고 초기화생성해주고
			
			System.out.println(result); // 마지막으로 출력을 해보니 해당 practice 의 문자열이 출력된다
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally { // 파이널리메소드로 해당 파일을 닫지않으면 에러가뜬다
			if (fis != null) {
				try {
					fis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
