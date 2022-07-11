import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main3 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		
		try {
			File file = new File("d:\\filetest\\practice.txt");
			int length = (int) file.length(); // ���� ���ڿ����� ��Ʈ������ �ٿ�ĳ�����ϰ�
			byte[] buf = new byte[length]; // ����Ʈ�迭�� �����ϰ� �׾ȿ� �ٿ�ĳ������ �������� �ٽ� �ʱ�ȭ�����
			 
			fis = new FileInputStream(file); // ���� ������ǲ��Ʈ�� ()�ȿ� ������ ȣ�����ְ�
			fis.read(buf); // ���������� ��Ʈ������ �ε��������� �ʱ�ȭ���� ����Ʈ �迭�ȿ� ����ִ� ���ڿ����� read �� ���� ���� �о����Ѵ�.
			
			String result = new String(buf); // �״��� ��Ʈ�������� buf�ȿ��ִ� ���� �о��� �ʱ�ȭ�������ְ�
			
			System.out.println(result); // ���������� ����� �غ��� �ش� practice �� ���ڿ��� ��µȴ�
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally { // ���̳θ��޼ҵ�� �ش� ������ ���������� ���������
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
