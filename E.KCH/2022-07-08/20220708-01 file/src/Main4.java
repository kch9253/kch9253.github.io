import java.io.File;
import java.io.IOException;

public class Main4 {
	public static void main(String[] args) {
		
		File filekor = new File("d:\\filetest\\�ѱ��̸�.txt");
//		try {
//			System.out.println("������? " + filekor.createNewFile());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
//		filekor.renameTo(new File("d:\\filetest\\newname.txt")); // ����������  �����̸��� �����ϱ����� �޼ҵ�
		
		File mytext = new File("d:\\filetest\\mytext.txt");
		mytext.delete(); // ������ ������ �����
	}
}
