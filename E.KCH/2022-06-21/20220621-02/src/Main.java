import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// �л�
// �̸�
// ����

// (�л��� �̸��� ���̰� ������ ���� �л��Դϴ�)

// ȫ�浿 15
// �Ѹ� 22
// ����� 33

// ���� �л����� ���ҷ� ������ ����Ʈ�� �����ϰ�
// (����� 33) �л��� �ε����� ã�ƺ�����.

class Student implements Comparable<Student> {
	private String name;
	private int age;
	private int score;
	
	
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "," + "score=" + score + " ]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Student o) {
		return score - o.score;
	}
}

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student("ȫ�浿", 15, 90);
		Student s2 = new Student("�Ѹ�", 22, 80);
		Student s3 = new Student("�����", 33, 95);
		
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		int index = list.indexOf(new Student("�����", 33, 0));
		System.out.println(index);
		
		// ����
		Collections.sort(list);
		System.out.println(list);
		
		Comparator<Student> comparator = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getAge() - o2.getAge();
			}
		};
		
		Collections.sort(list, comparator);
		System.out.println(list);
		
		
		
		
	}
}