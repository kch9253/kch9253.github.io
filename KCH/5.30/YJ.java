
// 의자 클래스 
// 제조사
// 생산일자
// 가격
// 모델명

// 초기화 할수있는 생성자
// main -> 작성한 생성자를 통해 원하는 필드값으로 초기화 해보세요.

public class YJ {
	String je; // 제조사
	String sang; // 생산일자
	String won; //가격
	String model; // 모델명
	
	public YJ (String je, String sang, String won, String model) {
		je = "korea";
		sang = "2022-05-30";
		won = "9999";
		model = "YJ_TE";
	}
	
	public static void main (String[] args) {
		YJ yj2 = new YJ();
		
		System.out.println(yj2.je);
		System.out.println(yj2.sang);
		System.out.println(yj2.won);
		System.out.println(yj2.model);
	}
}


	
		
	