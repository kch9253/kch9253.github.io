import java.time.LocalDate;
import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		// java.util.Calendar = 날짜를 나타내는
//		Calendar now = Calendar.getInstance();
		// static 이 붙은 값은 객체가아니다. static 값은 클래스의 이름으로 호출이가능하다
		// ex) main.staticOO
		// Calendar 같은경우 new Calendar 를 사용하는것이아닌 겟인스턴스값을 불러와야한다
		// 1.8 ~~ java.time.LocalDate = 
		// 동적인값은 문장의 흐름에서 같은 값들이 만나져야만 사용가능하다
		// 정적인값은 
		
		
//		System.out.println("상수값 확인 : " + Calendar.YEAR);
//		
//		System.out.println(now.get(Calendar.YEAR)); // 켈린더 클래스의 값은 상수값이며 공유도 가능하고 스태틱한 성질을 가지고있다 
//		System.out.println(now.get(Calendar.MONTH) +1); 
//		System.out.println(now.get(Calendar.DAY_OF_MONTH));
//		System.out.println(now.get(Calendar.DAY_OF_WEEK));
//		// 요일은 일요일기준 1번 월요일 2번 순번대로
		
		LocalDate now = LocalDate.now();
		System.out.println(now.getYear()); // 모든 get 값들을 하나의 객체로 보고있다
		
		System.out.println(now.getMonth());
		System.out.println(now.getMonthValue());
		
		System.out.println(now.getDayOfMonth());
		
		System.out.println(now.getDayOfWeek());
		System.out.println(now.getDayOfWeek().getValue());
		
	}

}
