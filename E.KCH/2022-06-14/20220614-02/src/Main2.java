// 컵라면
// 제조사
// 이름
// 가격

// 생성자, 게터세터

// 다음 Object 클래스 메소드 Override(재정의) 해보기~~
// toString
// equals - 제조사와 이름이 같으면
public class Main2 {
	public static void main(String[] args) {
		CupNoodle c1 = new CupNoodle("농심", "육개장", 1000);
		CupNoodle c2 = new CupNoodle("삼양", "육개장", 1200);
		CupNoodle c3 = new CupNoodle("농심", "육개장", 800);
		
		System.out.println(c1.toString());
//		System.out.println(c1.hashCode());
		System.out.println(c2);
		System.out.println(c3);
		
//		System.out.println(c1 == c2);
//		System.out.println(c1 == c3);
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
	}
}
