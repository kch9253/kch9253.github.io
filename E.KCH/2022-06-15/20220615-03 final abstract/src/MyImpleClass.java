// �ڽ�2
public final class MyImpleClass extends MysubClass { // �ڽ� 1�� �ڽ�2���� ����ϴ� Ŭ����
// �ۺ� ���� ���̳��� ���� ������ ����Ŭ���� ������ �� // ����Ŭ������ �ٸ� Ŭ������ �����Ͽ� ����Ϸ��ϸ� ��������� ���̳��� ������ �׳� ��
	@Override
	public void myMethod() { // �θ��� �߻�ȭ�� �ڽ�1�� ����Ѱ�
		System.out.println("���Ӱ� ������ �Ͽ����ϴ�."); // �������ߴ������� �ڽ�1�� mymethod �� ����Ŭ������ �����߱⶧��
	}
	
	@Override // �ڽ�1�� �޼ҵ�1���� ����Ͽ��⶧���� �ߺ����Ұ� ���� �ڽ�1�ǰ��� ��ӹ��� �ڽ�2�� �޼ҵ� 2���� ����Ͽ� �߻�ȭ���
	public void myMethod2() { // �������̵� 2���� ȣ��������� �θ� �ڽ�1���� ����߰� �ڽ�1�� �ڽ�2���� ����߱⶧����
		System.out.println("���̸޼ҵ�2 �������̵� ����"); //
	}
	
	public static void main(String[] args) {
		MyClass m = new MyImpleClass();
		m.myMethod();
		
		MysubClass sub = (MysubClass) m;
		sub.myMethod2();
	}

}
