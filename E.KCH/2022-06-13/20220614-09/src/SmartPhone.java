
public class SmartPhone extends Phone{
	String unyeung; //운영타입
	String unyeungC; //운영체제
	int memory; // 메모리크기
	String camera; // 카메라
	String blue; // 블루투스
	
	public SmartPhone() {
		
	}
	
	public String toString() {
		return super.toString() + "운영타입 : " + unyeung + "," + "운영체제: " + unyeungC + "," + "메모리크기: "  + memory + "," + "카메라탑재여부: " + camera + "," + "블루투스탑재여부: " + blue; 

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
