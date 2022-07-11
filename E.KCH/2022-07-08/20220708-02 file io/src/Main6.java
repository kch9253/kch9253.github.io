import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main6 {
	public static void main(String[] args) {
		File file1 = new File("d:\\filetest\\persons.txt");
		
		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter(new FileWriter(file1));
			
			pw.println("홍길동,22");
			pw.println("둘리,33");
			pw.println("도우너,44");
			pw.flush(); 
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
		
		
		
		File file = new File("d:\\filetest\\persons.txt");
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			
			int sum = 0;
			int count = 0;
			String line;
			while ( (line = br.readLine()) != null) { 
				System.out.println(line);
				//--------------------------- 문자열안의 숫자를 인덱스값으로 변환한값
				int index = line.indexOf(','); // indexOf 를 통해 , 값을찾는다 (왜냐하면 , 를 없애고 숫자의값만 찾아서 합과 평균을 구할꺼라서
				String strAge = line.substring(index + 1); // 스트링값을 초기화해주고 indexOf 를통해 찾은값중 ,를 없애고 숫자만 출력하기위해서 substring +1을 해주고 숫자만 출력하게 만들었다  
				Integer age = Integer.valueOf(strAge); // 위에 서브스트링으로 잘라서 남은값을 인티저객체를 형성하여 그안에 값을 넣고 벨류오프를 통해 넣은값을 스트링으로 전환해주고
				
				System.out.println("숫자변환결과: " + age);
				sum += age;
				count++;
			}
			System.out.println("평균나이: " + sum / count);
				//---------------------------
			
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
