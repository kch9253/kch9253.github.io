
// 의자 클래스 
// 제조사
// 생산일자
// 가격
// 모델명

// 초기화 할수있는 생성자
// main -> 작성한 생성자를 통해 원하는 필드값으로 초기화 해보세요.

// 쌤예시

public class Chair {
	String production;
	String date;
	int price;
	String model;
	
	public Chair (String p, String d, int pr, String m) {
		production = p;
		date = d;
		price = pr;
		model = m;
	}
	
	void printAll() {
		System.out.println(production);
		System.out.println(date);
		System.out.println(price);
		System.out.println(model);
		
	}
	
	public static void main(String[] args) {
		Chair c = new Chair("시디즈", "2016-09-05", 374000 , "T50");
		Chair c2 = new Chair("허먼밀러", "2019-10-21", 2100000 , "뉴 에어론");
		// c.production = "시디즈"; = 이모든값들을 초기화하여 간략하게 위와같이 표기할수있다
		// c.date = "2016-09-05";
		// c.price = 374000;
		// c.model = "T50";
		
		c.printAll();
		c2.printAll();
	}
}