


// public void sound() {} ���� ����Ҷ� ���ڿ�,���� ��°����ϴ�


public class Animal {
	public void sound() {
		System.out.println("���� �ٸ� �Ҹ���");
	}
}


class Dog extends Animal {
	public void sound() { // method override (�θ�Ŭ�������ִ� �޼ҵ带 ����κ��� �״�� ��� �ٵ�κ��� �ڽ�Ŭ������ �°Բ� �ּ�ȭ ���ѳ������)
		System.out.println("��");
	}	
}


class Cat extends Animal {
	public void sound() {
		System.out.println("�߿�");
	}
}