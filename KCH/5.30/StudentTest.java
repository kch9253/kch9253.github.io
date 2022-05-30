// 학생의 이름 국 영 수 점수 
// 국 영 수 평균점수를 물어서 알려주는

class Student {
	private String name;
	private int korea;
	private int eng;
	private int math;
	

	
	public Student(String n , int k , int e , int m ) {
		name = n;
		korea = k;
		eng = e;
		math = m;
		
		
	}
	
	public Student(String n) {
		this(n, k, e, m);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	
	public Student(String n) { // 마저 작업해야함 this
		this(n, k, e, m);
	}
	
	public int getKorea() {
		return korea;
	}
	public void setKorea(int k) {
		korea = k;
	}
	
	public int getEng() {
		return eng;
	}
	public void setEng(int e) {
		eng = e;
	}
	
	public int getMath() {
		return math;
	}
	public void setMath(int m) {
		math = m;
	}
	

	

	
	public void printAll() {
		System.out.println(name);
		System.out.println(korea);
		System.out.println(eng);
		System.out.println(math);
		System.out.println(korea + eng + math / 3);
	}
}

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student("김창희");
		Student s2 = new Student("국어점수: " , 80);
		Student s3 = new Student("영어점수: " , 50);
		Student s4 = new Student("수학점수: " , 70);
		Student s5 = new Student("평균: ");
		
		s1.printAll();
		s2.printAll();
		s3.printAll();
		s4.printAll();
		s5.printAll();
	}
}