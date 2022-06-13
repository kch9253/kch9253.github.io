
public class Student extends Person{ // extend = 상속을 받기위한 
	private int score;
	
	
	public Student(String name, int age, int score) { // 자식은 부모의 접근제한자 값을 불러올수없다.
						// ()안에 부모생성자의 호출값이 기재되어있어야한다.
		super(name, age); // super(부모) 부모의 생성자를 호출하는 // 생성자의 첫문장이여야함 아닐시 오류
		this.score = score; // super. 은 부모의 값을 불러와 자기것으로 활용할수있지만 
	}						// this. 값을 이용해서 원래 자기값을 설정하여 활용할수있다.
	
	public int getScore() {
		return score;
	}
	
	
		
		
	
}
