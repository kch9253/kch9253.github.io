// �Ŷ��
// ������
// �̸�
// ����

// ������ , ���ͼ���


public class Ramen {
	protected String jejo = "���";  // ������
	protected String name = "�Ŷ��"; // �̸�
	protected int won = 1500; // ����
	
	public Ramen () {
		
	}
	
	public String toString() {
		return "�Ŷ��������: " + jejo + "," + "�Ŷ���̸�: " + name + "," + "�Ŷ�鰡��: " + won;
	}
	
	public Ramen(String jejo, String name, int won) {
		super();
		
		this.jejo = jejo;
		this.name = name;
		this.won = won;
	}

	public String getJejo() {
		return jejo;
	}

	public void setJejo(String jejo) {
		this.jejo = jejo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWon() {
		return won;
	}

	public void setWon(int won) {
		this.won = won;
	}
	
	
//	public boolean equals(Object obj) {
//		if (obj instanceof Ramen2) {
//			Ramen2 cup = (Ramen2) obj;
//			return jejo.equals(cup.jejo);
//		} else {
//			return false;
//		}
//	}
	
}
