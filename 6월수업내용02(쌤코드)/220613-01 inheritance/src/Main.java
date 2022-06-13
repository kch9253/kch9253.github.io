public class Main {
	public static void main(String[] args) {
		Person p = new Person("사람이름", 22);
		
		Student s = new Student("학생이름", 17, 90);
		System.out.println(s.getName());
		System.out.println(s.getScore());
		System.out.println(s.getAge());
		
		Author a = new Author("작가이름", 30, "반지의길");
		System.out.println(a.getName());
		System.out.println(a.getBookList());
		System.out.println(a.getAge());
	}
}
