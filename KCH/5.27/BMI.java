// 키(실수,미터단위) 와 몸무게 (실수,kg단위)를 전달받아
// bmi 지수 (실수) 구해 반환하는
// bmi = (몸무게) / (키)^2


public class BMI {
	public static double gerBMI (double height, double weight){ // ()안에 double를 선언했을때 height (키)부터 선언했기때문에 전달할시에도 height(키)부터 전달해야한다
		return weight / (height * height); // return 값은 항상 위 메소드 이름에서부터 출력된다.
		
	}
	
	public static void main (String[] args) {
		double height = 1.70; // 키
		double weight = 68.4; // 몸무게
		
		
		// weight / (height * height) = 를 생략하고 밑에 double bmi = gerBMI 선언후 () 안에 순서대로 키,몸무게 호출했다.
		double bmi = gerBMI(height, weight);
		
		System.out.println(bmi);
	}
}