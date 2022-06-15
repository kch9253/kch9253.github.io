
public class Main {
	public static void main(String[] args) {
		
		Hello h = new Amereca1(); // 인터페이스 추상화행동 = 미국인 클래스를 인스턴스화
		student k = new Korea(); // 인터페이스 추상화행동 = 한국학생 클래스를 인스턴스화
		student a = new Amereca(); // 인터페이스 추상화행동 = 영국학생 클래슬르 인스턴스화
		
//		Object[] arr = new Object[3]; // 배열선언후 관리
//		arr[0] = h;
//		arr[1] = k;
//		arr[2] = a;
		
		h.self();  // 각 오버라이드 값들을 불러옴 ★ 밑에값 까지 전부다
		h.helloo();
		System.out.println();
		k.self();  
		k.name();
		k.age();
		k.hello();
		System.out.println();
		a.self();
		a.name();
		a.age();
		a.hello();
		
		//Amereca1 // 미국인 인사만
		//Korea // 한국인
		//Amereca // 영국인
		
	}
}
