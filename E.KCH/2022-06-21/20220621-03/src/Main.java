import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class diary implements Comparable<diary>{
	private int date; // ³¯Â¥
	private String title; // Á¦¸ñ
	private String weather; // ³¯¾¾
	private String Contents; // ³»¿ë
	
	public diary(int date, String title, String weather, String contents) {
		this.date = date;
		this.title = title;
		this.weather = weather;
		this.Contents = contents;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getContents() {
		return Contents;
	}
	public void setContents(String contents) {
		Contents = contents;
	}

	public String toString() {
		return "ÀÏ±â¸ñ·Ï [³¯Â¥: " + date + "Á¦¸ñ: " + title + "³¯¾¾: " + weather + "³»¿ë: " + Contents + "]";
	}
	@Override
	public int compareTo(diary o) {
		return 0;
	}
}


public class Main {
	public static void main(String[] args) {
		diary d1 = new diary(20220605 , "¿À´Ã¹¹¸ÔÁö" , "Èå¸²" , "¿À´Ã¹¹¸ÔÀ»±î °í¹ÎÁß");
		diary d2 = new diary(202206010 , "¿À´Ã¹¹¸ÔÁö" , "¸¼À½" , "±¹¹ä¸ÔÀ½");
		diary d3 = new diary(20220602 , "¿À´Ã¹¹¸ÔÁö" , "ºñ¿È" , "Ä®±¹¼ö¸ÔÀ½");
		
		List<diary> list = new ArrayList<>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		
		// ÀÏ±â ¸ñ·Ï
		Collections.sort(list);
		System.out.println(list);
		
		
		// ³¯Â¥¼ø
		Comparator<diary> comparator = new Comparator<diary>() {
			@Override
			public int compare(diary o1, diary o2) {
				return o1.getDate() - o2.getDate();
			}
		};
		
		Collections.sort(list, comparator);
		System.out.println(list);
		
		
		// ³»¿ë±æÀÌ¼ø
		
	

		
	}
}
