import java.io.File;
import java.io.IOException;

public class Main3 {
	public static void main(String[] args) {
//		File file = new File("d:\\filetest");
//		System.out.println("����? " + file.exists());
//		System.out.println("������? " + file.isDirectory());
//		System.out.println("���ϸ�? " + file.isFile());
//		
//		boolean result = file.mkdir(); // mkdir = ����ũ���丮�� ���� (���丮�� ������ ����������)
//		System.out.println("���丮 ��������: " + result);
		
		// d����̺꿡 filetest ���� (���丮) �ȿ� abc ������ �����غ�����
//		File abc = new File("d:\\filetest\\abc");
//		abc.mkdir(); // mkdir = ���丮���� (��������) 
		
//		File file2 = new File("d:\\filetest\\abc\\..\\def");
//		file2.mkdir();
//		File file3 = new File(file2.getCanonicalFile()); // getCanonicalFile = ���ϰ�ü�� ��ȯ���ִ°Ŵ�
														// getCanonicalPath = ���Ϲ��ڿ��� ��ȯ���ִ°Ŵ�
		
		File textFile = new File("d:\\filetest\\mytext.txt");
		try {
			boolean result = textFile.createNewFile();  // createNewFile ���ϻ��� (���ϰ���)
			System.out.println("������? " + result);
		} catch (IOException e) { // IOException = ����ó���� ������ �������Ѵ�.
			e.printStackTrace();
		}
	}
}
