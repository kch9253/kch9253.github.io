
public class Main3 {
	public static void main(String[] args) {
		String longLine = "apple banana carrot dount";
		
//		int first = longLine.length()-12; //
//		System.out.println(first);
//		System.out.println(longLine.charAt(first));
//		int last = longLine.length()-5;
//		System.out.println(last);
//		System.out.println(longLine.charAt(last));
		
		String result = longLine.substring(longLine.length()-12 , longLine.length()-5);
		// ���ڿ��� �ڸ��� �ȿ� �Էµ� - ���� �����ʿ������� length ���� �ϳ��ϳ��� �߶󳪰���
		// -12 �ϰ�� longLine �� ������ ������ dount �� t ���� �����ؼ� -1 �� �ڸ����� ã�ư���
		// -1 �� t , -2�� n -3�� u �̷����̴� == ���� �ڸ��������� �׵ڿ������� ��µȴ�.
		// ���ε�� ���࿡ -5�� �ϸ� dount �� �� ��µȴ�. 
		// �ε����� ���� ã�� ����ϸ� �� �ڸ��� ���� �ϳ��ϳ��� ���ڰ� ��µ�����
		// ���������� �ڸ����� ã����� -12���ϸ� carrot dount �� ��µ����� -5�� �߰��ؼ� dount �� �߶����.
		// carrot �� �Ǿ� c ���� -12 �̰� dount �� d�� -5�̴�
	
		System.out.println(result);
	}
}
