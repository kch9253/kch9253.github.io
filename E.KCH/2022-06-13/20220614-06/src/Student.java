public class Student extends Human{
    private String major;

    public Student(String name, int age , String profession) {
		super(name , age, profession);
		this.major = major;
	}
    
    
    public void setMajor(String major) {
		this.major = major;
	}

    public String gerProfession() {
    	return "�л�";
    }

	public Student(){
    }

    public String toString(){ // toString = ���ڿ��� ����Ҽ��ִ�
        return super.toString() + "����: " + major;
    } // �ۺ��� �ٳ���,�ٿ������� �ҷ��ͼ� ���������ݴ�
    // �θ�� �ڽ��� toSting ���� �ݺ������ִٸ� �θ��� toString ���� �����Ѱ��� super.toString() ������ �ҷ����� ������ �߰��Է��Ұ��� �ڽ��ʿ��� �Է��Ͽ� ������ָ�ȴ�.

    public String getMajor(){
        return null;
    }
    
    public void setMajor(){
    }


    public void setName(){
    	System.out.println("����" + "," + "21��" + "," + "��ǻ��");
    }
    public void setName1(){
    	System.out.println("����" + "," + "22��" + "," + "�濵");
    }
    public void setName2(){
    	System.out.println("����" + "," + "24��" + "," + "����");
    }
    

}




