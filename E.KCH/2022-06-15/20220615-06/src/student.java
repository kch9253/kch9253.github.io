
public interface student { // �������̽��� ����Ҽ��ִ� extend ������ // ����ϰ� �������̵� ���� ��������Ѵ�.
	void self(); // �Ұ�
	void name(); // �̸�
	void age(); // ����
	void hello(); // �λ��
	
}


class Person {} // ���
class studentPerson extends Person {} // �л��� ����̴�
class Amereca1 extends Person implements Hello{ // �̱����� ����̴�

	@Override
	public void helloo() {
		System.out.println("wassup");
	}

	@Override
	public void self() {
		System.out.println("�� �̱���");
	}
	
	} // �̱��λ��

class Korea extends studentPerson implements student{ // �ѱ��л��̴�
	@Override
	public void hello() {
		System.out.println("�ȳ�");
	}

	@Override
	public void name() {
		System.out.println("�̸��� ȫ�浿");
	}

	@Override
	public void age() {
		System.out.println("���̴� 22��");
	}

	@Override
	public void self() {
		System.out.println("�� �ѱ��л�");
	}} // �ѱ����л�

class Amereca extends studentPerson implements student { // �̱��л��̴�
	@Override
	public void hello() {
		System.out.println("hello");
	}

	@Override
	public void name() {
		System.out.println("�̸��� jon");
	}

	@Override
	public void age() {
		System.out.println("���̴� 23��");
	}

	@Override
	public void self() {
		System.out.println("�� �����л�");
	}} 