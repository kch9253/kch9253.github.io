
public interface Flyable { // interface = Ŭ����ó�� �ϳ��� Ÿ������ ��밡�� / �߻����� ����ǥ�� , ��ü�鳢�� �����Ҽ��ִ� ��ο�Ȱ
// interface �� Ŭ���� �̸��� ���Ҷ� �߻����� ���۰��� ǥ���� �����ϱ⶧���� �̸��� �׿Ͱ��õǰ� �������ִ°�������
	// flying �� �̷��� ������ ���·� �̸��� ����Ǵµ�  �������̽� Ŭ������� ǥ���ϰ������� iFlyable �̷������� i �� ����ȴ�.
	// �������̽��� �߻�޼ҵ常 �������ִ�
	
//	public abstract void fly(); // �߻�ǥ��
//	// �������̽��� Ŭ������� �ۺ��� ���� (pubilc abstract)�� �����ϰ� void fly(); �� �Է��Ͽ��� �ۺ������� �ȴ� 
	
	void fly();
}

class Animal {} // �����̴�
class Bird extends Animal {} // ���µ����̴�
class Eagle extends Bird implements Flyable{ //  Flyable �ȿ� �߻�ȭ �����ֱ⶧���� ��Ŭ�������� �߻��� �Է��ؾ��Ѵ�
	@Override 
	public void fly() {
		System.out.println("�������� Ǫ��� Ǫ��� ���ϴ�.");
	}} 
// �������̽� = �����Ѵ� // implements = �����ϰ����ϴ� ��Ӱ� 
// �������� �����ִ»���
class pengguin extends Bird {} // ����� ����

class FlyingFish extends Animal implements Flyable { // �̰͵� ���������� Flyable �����ֱ⶧���� �߻��� �Է��ؾ���
	@Override
	public void fly() {
		System.out.println("��ġ�� ������ ��");
	}
}

class Plane implements Flyable {
	@Override
	public void fly() {
		System.out.println("����Ⱑ��");
	}
	
}