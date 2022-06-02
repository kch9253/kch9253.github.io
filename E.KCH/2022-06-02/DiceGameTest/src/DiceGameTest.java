import java.util.*;
class DiceGame {
	
	int diceFace; // ��Ʈ+����Ʈ+R = �Էµ� ����̸��� �Ѳ����� ���氡��
	int userGuess; // ��Ʈ�� + ��Ŭ�� = ���ϴ� Ŭ������ �̵�
	
	private void rollDice() { // �������� �����ϱ����� �ڵ�
		Random random = new Random();
		diceFace = random.nextInt(6) + 1;
	} // private int ���� ���������� return ���� ����ϱ�����
	private int getUserInput(String prompt) { //����ڰ� �Է��ϱ����� �ڵ�
		System.out.println(prompt); // string ������������ �ؿ� "������ �Է�" ������ �ֱ�����
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	private void checkUserGuess() {	// �°� Ʋ���� �Ǻ��ϴ� �ڵ�
		if (diceFace == userGuess) { // ������� �Է°��� ���� ������ �������� �³� 
			System.out.println("����");
		} else {
			System.out.println("Ʋ��");
		}			
} // public void �� �������� ���������ڸ� Ǯ�� ����Ŭ������ ȣ���ϱ�����
	public void startPlaying() { // ����Ŭ������ ������� �Է°��� �³� Ʋ������ �Է°��� ���� ����ϱ����� �ڵ�
		userGuess = getUserInput("������ �Է�: ");
		rollDice();
		checkUserGuess();
	}	
}

public class DiceGameTest {
	public static void main(String[] args) {
		DiceGame game = new DiceGame(); 
		game.startPlaying();
	}
}
