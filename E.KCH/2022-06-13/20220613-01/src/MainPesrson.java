
public class MainPesrson {

	public static void main(String[] args) {
		Person p = new Person("����̸�" , 22);
		
		Student s = new Student("�л��̸�", 17, 90); // ���ο��� �����ڸ� ȣ���Ҷ� �Է��� ������� ��µȴ�.
		System.out.println(s.getName());
		System.out.println(s.getScore());
		System.out.println(s.getAge());
		
		
		Author a = new Author("�۰��̸�", 30, "�����Ǳ�");
		System.out.println(a.getName());
		System.out.println(a.getAge());
		System.out.println(a.getBookList());
	}

}
