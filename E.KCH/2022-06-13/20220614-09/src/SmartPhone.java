
public class SmartPhone extends Phone{
	String unyeung; //�Ÿ��
	String unyeungC; //�ü��
	int memory; // �޸�ũ��
	String camera; // ī�޶�
	String blue; // �������
	
	public SmartPhone() {
		
	}
	
	public String toString() {
		return super.toString() + "�Ÿ�� : " + unyeung + "," + "�ü��: " + unyeungC + "," + "�޸�ũ��: "  + memory + "," + "ī�޶�ž�翩��: " + camera + "," + "�������ž�翩��: " + blue; 

	}
	
	public SmartPhone(String jejo, int won, String type, String unyeung, String unyeungC, int memory, String camera, String blue) {
		super(jejo, won, type);
		this.unyeung = unyeung;
		this.unyeungC = unyeungC;
		this.memory = memory;
		this.camera = camera;
		this.blue = blue;
	}


}
