import java.util.Arrays;
public class Main {
	public static void main(String[] args) {	
		User[] user1 = new User[3];
		user1[0] = new User("이정현" , 44, 158);
		user1[1] = new User("에일리" , 62, 165);
		user1[2] = new User("린" , 60, 170);
		
		Arrays.sort(user1);
		for (User u : user1) {
			System.out.println("이름:" + u.getName() + "/" + "몸무게:" + u.getKg() +  "/" + "키:" + u.getHeight());
		}
		
	}
}

class User implements Comparable {
// Comparable = 오름차순 정렬 (정수,실수는 오름차순) , (스트링은 사전순)
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

	public int compareTo(Object obj) { // 몸무게 오름차순
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


