// �ڽ�1
public abstract class MysubClass extends MyClass { // �θ� �߻�Ŭ�����ϰ�� �ڽĵ� �߻�Ŭ�������� �־���� ��ӹ������ִ�
	
	@Override // ����Ŭ���� ���̳��� �����Ұ�� ����Ŭ�������� �߻�ȭ���� ����Ҽ�����. ���������
	public final void myMethod() { // �θ��� �߻�ȭ �ν��Ͻ����� �ҷ��� �ڽ�1�� �����
		System.out.println("�ڽ�Ŭ�������� ����");
	}
	
	public abstract void myMethod2();
}