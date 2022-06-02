
// 학급 (반)
// 학생 3명있음
// 3명의 학생의 이름을 콘솔에 출력가능
// 3명의 총 평균을 알려줄수있음
// 평균점수가 가장높은 학생을 알려줄수있음 = > 동일 점수일경우 1 < 2 < 3 순으로 알려줌
// 리턴 타입이 학생이여야함

public class T {
	private String name1;
	private int kor;
	private int eng;
	private int math;

	public T(String name1, int kor, int eng, int math) {
		
		this.name1 = name1;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}
	
	public  int getAverage() {
		return getSum() / 3;
	}
	
	public  int getSum() {
		return ( kor + eng +  math );
	}
	
	public void printAll() {
		System.out.println(name1);
		System.out.println((kor + eng + math) / 3);
	}
	


}
