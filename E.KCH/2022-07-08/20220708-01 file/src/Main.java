import java.io.File;

public class Main {
	public static void main(String[] args) {
//		File file = new File("d:\\E.KCH\\test.txt"); //����̺�>oo����>�����̸�
//		System.out.println(file.getName()); // �����̸�
//		System.out.println(file.getPath()); // ���ϰ�� 
//		System.out.println(file.exists()); // ������ �����ϴ°�? (��,�������� ��Ÿ��)
//		
//		File f2 = new File("d:\\E.KCH\\asdf.txt");
//		// ������ ��ü�� ���������� �ƴϰ� �ܺ������� �ִ��������� �����ϱ����� �����̴� (���������� ȣ���ϴ��� ���ο� ���ϰ�ü�� ���������ϴ�)
//		// �߻����� ��ü��� �����ϸ�ȴ�.
//		System.out.println(f2.getName());
//		System.out.println(f2.getPath());
//		System.out.println(f2.exists());
		
		// d: �̷������� �ϳ��� ã�ư��°� �������ΰ�δ�
		File dir = new File("d:\\E.KCH"); // ���ϻ� �ƴ϶� ������ ���丮 �Ҽ����ִ�
		System.out.println(dir.getName());
		System.out.println(dir.getPath());
		System.out.println(dir.exists());
		
		System.out.println("�����ΰ���? " + dir.isFile()); // �ش��������� �����ϴ¸޼ҵ�
		System.out.println("���丮�ΰ���? " + dir.isDirectory()); // ���丮 ��ü���� �����ϴ� �޼ҵ�
	}
}
