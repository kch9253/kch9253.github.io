
public class Student extends Person{ // extend = ����� �ޱ����� 
	private int score;
	
	
	public Student(String name, int age, int score) { // �ڽ��� �θ��� ���������� ���� �ҷ��ü�����.
						// ()�ȿ� �θ�������� ȣ�Ⱚ�� ����Ǿ��־���Ѵ�.
		super(name, age); // super(�θ�) �θ��� �����ڸ� ȣ���ϴ� // �������� ù�����̿����� �ƴҽ� ����
		this.score = score; // super. �� �θ��� ���� �ҷ��� �ڱ������ Ȱ���Ҽ������� 
	}						// this. ���� �̿��ؼ� ���� �ڱⰪ�� �����Ͽ� Ȱ���Ҽ��ִ�.
	
	public int getScore() {
		return score;
	}
	
	
		
		
	
}
