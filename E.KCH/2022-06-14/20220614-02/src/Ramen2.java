
public class Ramen2 extends Ramen{
	String jejo = "���";  // ������
	String name = "������"; // �̸�
	int won = 1200; // ���� 
	private int year = 2022;
	
	public Ramen2 () {
		
	}
	

	
//	public boolean equals(Object obj) {
//		if (obj instanceof Ramen2) {
//			Ramen2 cup = (Ramen2) obj;
//			return jejo.equals(cup.jejo);
//		} else {
//			return false;
//		}
//	}
	
	public Ramen2(String jejo, String name, int won, int year) {
		super(jejo, name, won);
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString () {
		return "�Ŷ��������: " + jejo + "," + "�Ŷ���̸�: " + name + "," + "�Ŷ�鰡��: " + won +  "," + "�����⵵��: " + year; 
	}
	

}
