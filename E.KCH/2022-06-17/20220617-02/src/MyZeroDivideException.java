import java.time.LocalTime;

public class MyZeroDivideException extends RuntimeException { //== Exception �� �������� ������ ĳġ�ϱ⶧���� ���� �����ϰ� ĳġ�ϱ����� ���ο� Ŭ������ ����� Exception �� ��ӹް��Ͽ� ���� ó���Ѵ�. 
	public MyZeroDivideException(String message) {
		super(message + "," + LocalTime.now() + "�� �߻��Ͽ���"); // �޼����� �ð������ �߰��Ͽ� ���� �߻��Ͽ��ٶ�� ����ϴµ�
		// 
	}
	

}
