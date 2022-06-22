import java.time.LocalDate;

public class TestManage {
	public static void main(String[] args) {
		DiaryManage m = new DiaryManageImpl();
		
		m.add(new Diary(LocalDate.now(), "6��21�� �ϱ�", "����", "���� ���� ����"));
		
		m.add(new Diary(LocalDate.of(2022, 6, 20), "6��20�� �ϱ�", "����", "���� ����2"));
		
		m.add(new Diary(LocalDate.of(2022, 6, 19), "6��19�� �ϱ�", "�帲", "���� ����3"));
		
		System.out.println(m.list());
		
		m.edit(LocalDate.now(), "������ ����");
		
		System.out.println(m.list().get(0).getContent());
		
		m.deleteFirst();
		
		System.out.println(m.list().size());
	}
}
