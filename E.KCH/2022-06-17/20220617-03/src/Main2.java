import java.util.StringJoiner;

public class Main2 {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner("," , "[" , "]");
		sj.add("1"); // add �� �Էµ� ������ 1~3 ���� ��µɶ� ���� �Է��� ��ǥ���� 1~3���� ���̻��̿� ���Եȴ�
		sj.add("2"); // ������ 3���� �����ʴ� ������ ��Ʈ�����̳ʴ� ���̻��̿��� ���� ������ �������ִ�.
		sj.add("3");
		
		String result = sj.toString();
		
		System.out.println(result);
	}
}
