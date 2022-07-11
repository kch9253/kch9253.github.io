import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		File diaryFile = new File("d:\\filetest\\���뿬��.txt");
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(diaryFile, "UTF-8"); // scanner �� ���� ������ ��θ� ���� ������ ��Ȱ�� ���ش�.
											// scanner �� �ܼ�â�� �Է°��� ������������ �����ǰ�ε� �������ִ�
											// UTF-8 = �� �Է��� ������ ���ڵ����������� �ѱ۹��ڿ��� �о�����߱⶧���̴�
			while (scanner.hasNext()) { // �ݺ��������� hasNext �Ͽ� ��ü������ ȣ���ϰ�
				System.out.println(scanner.nextLine()); // ��ü���忡 ���ԵǾ��ִ� ��� ���ڿ��� nextLine �� ���� ȣ���Ѵ�.
			}
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�����߽��ϴ�.");
		} finally { // scanner �� ���� ��������θ� ������ �����ϱ����� ���̳��� ȣ���Ѵ� 
			if (scanner != null) { // ��ĳ���� ���� �����Ѵ� ��� �������� ���Ͽ� notnull ������ �־��ְ�
				scanner.close(); // Ŭ��� ���� �ش������� ���������� ����ؼ� ������θ� �����س��⶧���� �ڿ����� �Ǳ⶧���� �۾��� ���� �����ǰ�� �ݾ��ִ°�������
			}
		}
	}
}
