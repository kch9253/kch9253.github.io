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
    	return "학생";
    }

	public Student(){
    }

    public String toString(){ // toString = 문자열로 출력할수있는
        return super.toString() + "전공: " + major;
    } // 퍼블릭한 겟네임,겟에이지를 불러와서 오류를없앴다
    // 부모와 자식의 toSting 값의 반복값이있다면 부모쪽 toString 에서 설정한값을 super.toString() 을통해 불러오고 나머지 추가입력할값을 자식쪽에서 입력하여 출력해주면된다.

    public String getMajor(){
        return null;
    }
    
    public void setMajor(){
    }


    public void setName(){
    	System.out.println("명진" + "," + "21세" + "," + "컴퓨터");
    }
    public void setName1(){
    	System.out.println("미현" + "," + "22세" + "," + "경영");
    }
    public void setName2(){
    	System.out.println("용준" + "," + "24세" + "," + "경제");
    }
    

}




