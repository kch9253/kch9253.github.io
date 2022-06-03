// 학생 (이름, 국영수) 관리프로그램
// 콘솔 입출력
// 반에 학생을 등록. 3명
// 이름 목록을 볼수있어야하고
// 평균을 볼수있고
// 1등 학생의 정보도 볼수있는 프로그램
// 자유롭게

// 기존 만들었던 클래스 << 수정. 수정을 해야하는 이유와 전 후가 어떻게 바뀌었는지 '다기록'


// 기존에 학급 학생값이 없음. 그냥 어떻게 활용해서 출력하는지에 대한 코드만

import java.util.Scanner;
public class StudentManage1 {
	private ClassRoom room;

	public Student inputStudent() {
		Scanner scan = new Scanner(System.in);
		System.out.println("학생의 정보. 이름, 국영수 순으로 입력해주세요.");
		String name = scan.nextLine();
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		return new Student(name, kor, eng, math);
	}
	
	public void start() {
		Student stu1 = inputStudent();
		Student stu2 = inputStudent();
		Student stu3 = inputStudent();
		
		room = new ClassRoom(stu1, stu2, stu3);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴");
		System.out.println()"1.학생이름보기";
		int number = scan.nextInt();
		
		if (number == 1) {
			room.printNames();
		} else if (number ==2) {
			System.out.println("총평균: " + room.getTotalAvg);
		} else if (number == 3) {
			Student top = room.getTop();
			System.out.println(top.gatName());
			System.out.println(top.getAverage());
		}		
	}		
}


public class TestManage {
	public static void main(String[] args) {
		StudentManage m = new StudentManage;
		
		m.start();
	}
}
