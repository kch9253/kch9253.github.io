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
			
			pw.println("ȫ�浿,22");
			pw.println("�Ѹ�,33");
			pw.println("�����,44");
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
				//--------------------------- ���ڿ����� ���ڸ� �ε��������� ��ȯ�Ѱ�
				int index = line.indexOf(','); // indexOf �� ���� , ����ã�´� (�ֳ��ϸ� , �� ���ְ� �����ǰ��� ã�Ƽ� �հ� ����� ���Ҳ���
				String strAge = line.substring(index + 1); // ��Ʈ������ �ʱ�ȭ���ְ� indexOf ������ ã������ ,�� ���ְ� ���ڸ� ����ϱ����ؼ� substring +1�� ���ְ� ���ڸ� ����ϰ� �������  
				Integer age = Integer.valueOf(strAge); // ���� ���꽺Ʈ������ �߶� �������� ��Ƽ����ü�� �����Ͽ� �׾ȿ� ���� �ְ� ���������� ���� �������� ��Ʈ������ ��ȯ���ְ�
				
				System.out.println("���ں�ȯ���: " + age);
				sum += age;
				count++;
			}
			System.out.println("��ճ���: " + sum / count);
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
