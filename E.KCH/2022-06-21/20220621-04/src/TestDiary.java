import java.time.LocalDate;

public class TestDiary {
	public static void main(String[] args) {
		Diary d1 = new Diary(LocalDate.of(2022, 6, 1), "�ҹٸ� �Ծ���", "�帲", "���� �ʰ� ������");
		d1.setWeather("����");
		System.out.println(d1.getWeather());
		
		System.out.println(d1);
		
		Diary d2 = new Diary(LocalDate.of(2022, 6, 1), "�ٸ� ����", "����", "�ٸ� ����");
		
//		System.out.println(d1.getDay().equals(d2.getDay()));
		System.out.println(d1.equals(d2));
		System.out.println(d1.compareTo(d2));
	}
}
