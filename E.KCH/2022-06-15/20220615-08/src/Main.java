import java.util.Arrays;
public class Main {
	public static void main(String[] args) {	
		User[] user1 = new User[3];
		user1[0] = new User("������" , 44, 158);
		user1[1] = new User("���ϸ�" , 62, 165);
		user1[2] = new User("��" , 60, 170);
		
		Arrays.sort(user1);
		for (User u : user1) {
			System.out.println("�̸�:" + u.getName() + "/" + "������:" + u.getKg() +  "/" + "Ű:" + u.getHeight());
		}
		
	}
}

class User implements Comparable {
// Comparable = �������� ���� (����,�Ǽ��� ��������) , (��Ʈ���� ������)
	private String name;
	private int kg;
	private int height;
	
	public User(String name, int kg, int height) {
		this.name = name;
		this.kg = kg;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKg() {
		return kg;
	}
	public void setKg(int kg) {
		this.kg = kg;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	public int compareTo(Object obj) { // ������ ��������
		User u = (User) obj;
		if (kg < u.kg) {
			return -1;
		} else if (kg > u.kg) {
			return 1;
		} else {
			return 0;
		}
	}		
	
}


