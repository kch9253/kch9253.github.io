
public class Person {
	private String name;
	protected int age; // protected = �ڽĵ��� �����Ҽ��ְ� �������� ����������
							// protected = �ش�Ŭ������ �ڽĵ�� �ƴ϶� �ٸ� ��Ű���� ���ϴ� �ֵ鵵 ����������
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() { // �ۺ��Ѱ��� ����ֱ⶧���� �θ��� getter ���� �ڽĵ鿡�� ���� ȣ���Ҽ��ִ�.
		return name;
	}

	public int getAge() {
		return age;
	}


		
}
