
public class Main {
	public static void main(String[] args) {
		
		Hello h = new Amereca1(); // �������̽� �߻�ȭ�ൿ = �̱��� Ŭ������ �ν��Ͻ�ȭ
		student k = new Korea(); // �������̽� �߻�ȭ�ൿ = �ѱ��л� Ŭ������ �ν��Ͻ�ȭ
		student a = new Amereca(); // �������̽� �߻�ȭ�ൿ = �����л� Ŭ������ �ν��Ͻ�ȭ
		
//		Object[] arr = new Object[3]; // �迭������ ����
//		arr[0] = h;
//		arr[1] = k;
//		arr[2] = a;
		
		h.self();  // �� �������̵� ������ �ҷ��� �� �ؿ��� ���� ���δ�
		h.helloo();
		System.out.println();
		k.self();  
		k.name();
		k.age();
		k.hello();
		System.out.println();
		a.self();
		a.name();
		a.age();
		a.hello();
		
		//Amereca1 // �̱��� �λ縸
		//Korea // �ѱ���
		//Amereca // ������
		
	}
}
