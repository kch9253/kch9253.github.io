// �л� (�̸�, ������) �������α׷�
// �ܼ� �����
// �ݿ� �л��� ���. 3��
// �̸� ����� �����־���ϰ�
// ����� �����ְ�
// 1�� �л��� ������ �����ִ� ���α׷�
// �����Ӱ�

// ���� ������� Ŭ���� << ����. ������ �ؾ��ϴ� ������ �� �İ� ��� �ٲ������ '�ٱ��'



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
		yourname("�л��̸���:" );
		scoreKor("����������: ");
		scoreMath("����������: ");
		scoreEng("����������: ");
		
	}
	
	public void Studentset2() {
		yourname1("�л��̸���:" );
		scoreKor1("����������: ");
		scoreMath1("����������: ");
		scoreEng1("����������: ");
		
	}
	
	public void Studentset3() {
		yourname2("�л��̸���:" );
		scoreKor2("����������: ");
		scoreMath2("����������: ");
		scoreEng2("����������: ");
		
	}
	
	public void Studentset4() {
		avgAll("��ü�����: ");
		ranker("1����? ");
		
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