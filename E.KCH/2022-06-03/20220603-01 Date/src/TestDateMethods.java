import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class TestDateMethods {
	public static void main(String[] args) {
		// 오늘 날짜구하기
		Calendar now = Calendar.getInstance();
//		now.set(2022, June, 4);
		now.add(Calendar.DAY_OF_MONTH, 1);
		
		Date date = now.getTime();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String result = dateFormat.format(date);
		System.out.println(result);
		
		
								
		//내일 날짜객체
		//현재 날짜 +1 값
		
//		LocalDate now = LocalDate.now();
//		LocalDate nowPlusOne = now.plusDays(1);	

//		LocalDate tomorrow = LocalDate.of(2022, 6 , 4);
//		
//		System.out.println(tomorrow.equals(nowPlusOne));
	}
}

