public class Human {
    private String name; // ���������� ���� ���� �θ�� �ڽĿ��� ���������� ���� �ټ�����.
    private int age;
    // protected �� ���� private �� ��� �ڽĿ��� ����Ҽ��ִ� ���� �Է����ִ°͵� ����.
    // ������ ����ϰ� �ϰ�ʹٸ� public ���� �൵�ȴ�.
    private String profession;
    
    
    public Human(){
    }

   
	public Human(String name, int age, String profession) {
		
		this.name = name;
		this.age = age;
		this.profession = profession;
	}


	public String getProfession() {
		return profession;
	}


	public void setProfession(String profession) {
		this.profession = profession;
	}


	public String toString(){
        return "�̸� : " + name + "," + "����: " + age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return 0;
    }

    public void setName(){
    	System.out.println("����" + "," + "18��");
    }
    public void setName1(){
    	System.out.println("����" + "," + "21��");
    }
    public void setName2(){
    	System.out.println("���" + "," + "50��");
    }

    public void getAge(int age){
    }

}
