// �л� (�̸�, ������) �������α׷�
// �ܼ� �����
// �ݿ� �л��� ���. 3��
// �̸� ����� �����־���ϰ�
// ����� �����ְ�
// 1�� �л��� ������ �����ִ� ���α׷�
// �����Ӱ�

// ���� ������� Ŭ���� << ����. ������ �ؾ��ϴ� ������ �� �İ� ��� �ٲ������ '�ٱ��'


// ������ �б� �л����� ����. �׳� ��� Ȱ���ؼ� ����ϴ����� ���� �ڵ常

import java.util.Scanner;
public class StudentManage1 {
	private ClassRoom room;

	public Student inputStudent() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�л��� ����. �̸�, ������ ������ �Է����ּ���.");
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
		System.out.println("�޴�");
		System.out.println()"1.�л��̸�����";
		int number = scan.nextInt();
		
		if (number == 1) {
			room.printNames();
		} else if (number ==2) {
			System.out.println("�����: " + room.getTotalAvg);
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
