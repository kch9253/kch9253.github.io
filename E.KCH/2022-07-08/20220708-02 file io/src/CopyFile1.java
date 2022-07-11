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
			
			while ( (c = in.read()) != -1) { // ���� int c �� �����ϰ� �ݺ����� ���� �ε��������� ���ڿ��� �о���� in.read �޼ҵ带 ȣ�������
				// in.read()�� ���Ͼ��� ���ڿ��� ������ ���о�� ����������� -1 ���� ��µȴ� ���� != -1 �� ���� ���ڿ��� ������ ���о�� �������������� -1�� �ƴϴ� ��� �������� ���������
				out.write(c); // out.wirte(c) �� input �������� ���ڿ��� �Ȱ��� �о�� ������ �޼ҵ带 ȣ������� ���� in,out �� ���Ͼ��� ���ڿ��� �����ϰ� ��Ÿ����.
			}					// read �� 1 ����Ʈ�� �д������̴� (�ѱ����ѱ��ھ�)
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
