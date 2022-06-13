
public class MainPesrson {

	public static void main(String[] args) {
		Person p = new Person("사람이름" , 22);
		
		Student s = new Student("학생이름", 17, 90); // 메인에서 생성자를 호출할때 입력한 순서대로 출력된다.
		System.out.println(s.getName());
		System.out.println(s.getScore());
		System.out.println(s.getAge());
		
		
		Author a = new Author("작가이름", 30, "반지의길");
		System.out.println(a.getName());
		System.out.println(a.getAge());
		System.out.println(a.getBookList());
	}

}
