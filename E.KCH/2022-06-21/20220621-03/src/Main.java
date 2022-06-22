import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class diary implements Comparable<diary>{
	private int date; // ��¥
	private String title; // ����
	private String weather; // ����
	private String Contents; // ����
	
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
		return "�ϱ��� [��¥: " + date + "����: " + title + "����: " + weather + "����: " + Contents + "]";
	}
	@Override
	public int compareTo(diary o) {
		return 0;
	}
}


public class Main {
	public static void main(String[] args) {
		diary d1 = new diary(20220605 , "���ù�����" , "�帲" , "���ù������� �����");
		diary d2 = new diary(202206010 , "���ù�����" , "����" , "�������");
		diary d3 = new diary(20220602 , "���ù�����" , "���" , "Į��������");
		
		List<diary> list = new ArrayList<>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		
		// �ϱ� ���
		Collections.sort(list);
		System.out.println(list);
		
		
		// ��¥��
		Comparator<diary> comparator = new Comparator<diary>() {
			@Override
			public int compare(diary o1, diary o2) {
				return o1.getDate() - o2.getDate();
			}
		};
		
		Collections.sort(list, comparator);
		System.out.println(list);
		
		
		// ������̼�
		
	

		
	}
}
