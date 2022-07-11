import java.io.File;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) {
		
		File file = new File(".\\"); // (.) = �����θ� �ǹ��Ѵ� / ������ΰ�θ��ǹ��Ѵ�
									// . �� �������� ã����� ���������� ã�´�
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.exists());
		
		System.out.println(file.getAbsolutePath()); // getAbsolutePath �� ��� ���� �����۾��ϴ� ������ ���� ��θ� ��Ÿ���ش� ��°��� ���� �ǳ��� \. �̺ٴµ� �̰��� �����θ� ��Ÿ���ش� 
		try {
			System.out.println(file.getCanonicalPath()); // getCanonicalPath �Ϲ������� ȣ���Ұ�� ��������� �� �޼ҵ��� ���ܿ� ���� ȣ�⸸�����ϴ�.
		} catch (IOException e) { // getCanonicalPath �� ������� �����θ� �ؼ��� ���� ��Ÿ���ش�.
			e.printStackTrace();
		}
		
		
		File fileparent = new File("..\\"); // ..�� ������θ� ��Ÿ���ش� ������ ���ΰ� �ִ� �Ѵܰ����� ������ ��Ÿ���ش� (�θ𰳳�)
		
		System.out.println(fileparent.getAbsolutePath()); // getAbsolutePath ���� ����� ������ ��Ÿ���ش� 
		try {
			System.out.println(fileparent.getCanonicalPath()); // getCanonicalPath ���� ����� ��ǥ��ġ�� ���˷��ش�
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		try {
			File file3 = file.getCanonicalFile().getParentFile();
			// getCanonicalFile = �������ΰ�θ� ��Ÿ�����ְ� ���ϰ�θ� ��Ÿ���ش�
			// getParentFile = ���ϻ��� ��ü�� ��Ÿ���ش�.
			System.out.println(file3.getAbsolutePath());
			System.out.println(file3.getCanonicalPath());
			System.out.println(fileparent.equals(file3));
			
			System.out.println(fileparent.getCanonicalFile().equals(file3));
			System.out.println(fileparent.getCanonicalFile().compareTo(file3));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	
	
		
	}
}













