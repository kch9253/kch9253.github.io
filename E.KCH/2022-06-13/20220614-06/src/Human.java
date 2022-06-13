public class Human {
    private String name; // 접근제한자 값을 가진 부모는 자식에게 접근제한자 값을 줄수없다.
    private int age;
    // protected 를 통해 private 값 대신 자식에게 상속할수있는 값을 입력해주는것도 좋다.
    // 누구든 사용하게 하고싶다면 public 값을 줘도된다.
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
        return "이름 : " + name + "," + "나이: " + age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return 0;
    }

    public void setName(){
    	System.out.println("춘향" + "," + "18세");
    }
    public void setName1(){
    	System.out.println("몽룡" + "," + "21세");
    }
    public void setName2(){
    	System.out.println("사또" + "," + "50세");
    }

    public void getAge(int age){
    }

}
