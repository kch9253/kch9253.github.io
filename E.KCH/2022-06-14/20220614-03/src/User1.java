import java.util.Scanner;

public class User1 {
		Scanner scan = new Scanner(System.in);
		protected int member = 0; // ȸ��
		protected String name = ""; // �̸�
		protected int height = 0; // Ű
		protected int kg = 0; // ������
		
		
		public User1() {
			
		}
		
		public User1(String mString, String name, int height, int kg) {
			this.member = member;
			this.name = name;
			this.height = height;
			this.kg = kg;	
		}



		public String getMember() {
			return member;
		}

		public void setMember(String member) {
			this.member = member;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}

		public int getKg() {
			return kg;
		}

		public void setKg(int kg) {
			this.kg = kg;
		}
}
	
		


