// 학생 (이름, 국영수) 관리프로그램
// 콘솔 입출력
// 반에 학생을 등록. 3명
// 이름 목록을 볼수있어야하고
// 평균을 볼수있고
// 1등 학생의 정보도 볼수있는 프로그램
// 자유롭게

// 기존 만들었던 클래스 << 수정. 수정을 해야하는 이유와 전 후가 어떻게 바뀌었는지 '다기록'



import java.util.*;

class Student {
	String name;
	int kor;
	int math;
	int eng;

	int sum;
	
	public int sum1() {
		sum = (kor + math + eng) / 3;		
		return sum;
	}

	public String getName() {
		return name;
	}

	public String setName() {
		Scanner scan = new Scanner(System.in);
		name = scan.nextLine();
		this.name = name;
		return name;
	}


	public int setKor() {
		Scanner scan = new Scanner(System.in);
		kor = scan.nextInt();
		this.kor = kor;
		return kor;
	}

	public int setMath() {
		Scanner scan = new Scanner(System.in);
		math = scan.nextInt();
		this.math = math;
		return math;
	}

	public int setEng() {
		Scanner scan = new Scanner(System.in);
		eng = scan.nextInt();
		this.eng = eng;
		return eng;
	}

	
	public int getSum() {
		return sum;
	}

	
}

class StudentTest {
	Student name1 = new Student();
	Student name2 = new Student();
	Student name3 = new Student();
	int kor;
	int math;
	int eng;
	int sum;
	
	public  String yourname(String prompt) {
		System.out.println(prompt);
		return name1.setName(); 
	}	
	public  String yourname1(String prompt) {
		System.out.println(prompt);
		return name2.setName(); 
	}	
	public  String yourname2(String prompt) {
		System.out.println(prompt);
		return name3.setName(); 
	}	
	
	public int scoreKor(String prompt1) {
		System.out.println(prompt1);
		return name1.setKor();
	}
	public int scoreKor1(String prompt1) {
		System.out.println(prompt1);
		return name2.setKor();
	}
	public int scoreKor2(String prompt1) {
		System.out.println(prompt1);
		return name3.setKor();
	}
	
	public int scoreEng(String prompt1) {
		System.out.println(prompt1);
		return name1.setEng();
	}
	public int scoreEng1(String prompt1) {
		System.out.println(prompt1);
		return name2.setEng();
	}
	public int scoreEng2(String prompt1) {
		System.out.println(prompt1);
		return name3.setEng();
	}
	
	public int scoreMath(String prompt1) {
		System.out.println(prompt1);
		return name1.setMath();
	}
	public int scoreMath1(String prompt1) {
		System.out.println(prompt1);
		return name2.setMath();
	}
	public int scoreMath2(String prompt1) {
		System.out.println(prompt1);
		return name3.setMath();
	}
	
	private int avgAll(String summ) {
		System.out.println(summ);	
		sum = (name1.sum1() + name2.sum1() + name3.sum1()) / 3;		
		System.out.println(sum);
		return sum;
	}
	
	
	
	public Student ranking() {
		int rank = 0;
		rank = (name1.sum1() >= name2.sum1() ? name1.sum1() : name2.sum1());
		rank = (rank >= name3.sum1() ? rank : name3.sum1());
		
		if (rank == name1.sum1()) {
			return name1;
		}
		else if (rank == name2.sum1()) {
			return name2;
		} 
		else {
			return name3;
		}
	}
	
	public void ranker(String rank1) {
		System.out.println(rank1);
		System.out.println(ranking().getName());
		System.out.println(ranking().getSum());
	}
	
	
	
	public void StudentSet1() {
		yourname("학생이름은:" );
		scoreKor("국어점수는: ");
		scoreMath("수학점수는: ");
		scoreEng("영어점수는: ");
		
	}
	
	public void Studentset2() {
		yourname1("학생이름은:" );
		scoreKor1("국어점수는: ");
		scoreMath1("수학점수는: ");
		scoreEng1("영어점수는: ");
		
	}
	
	public void Studentset3() {
		yourname2("학생이름은:" );
		scoreKor2("국어점수는: ");
		scoreMath2("수학점수는: ");
		scoreEng2("영어점수는: ");
		
	}
	
	public void Studentset4() {
		avgAll("전체평균은: ");
		ranker("1위는? ");
		
	}
}

public class StudentWorld {
	public static void main (String[] args) {
		StudentTest s = new StudentTest();
		s.StudentSet1();
		s.Studentset2();
		s.Studentset3();
		s.Studentset4();
	}
}