public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("��밡��"); // () �ν��Ͻ� �ȿ� ������ ������ ��������ְ� �ȿ� ���ڿ��� �־ ��뵵 �����ϴ�.
		sb.append(",One="); // append = ���ڿ��� ���ϼ��ִ� (�ڿ�����) 
		sb.append(1); // ������ �ڱ��ڽ��� �����Ѵ� 2�������� 1���� �����ϰ� 3�������� 2���� �����ϰ� �׷�������
		sb.append(",DoubleValue="); // ����尪 �׳� ���������� �Ʒ��� ���ʴ�� �������� ��µȴٰ� �����.
		sb.append(255.0);
		String result = sb.toString(); // ����Ʈ���� ���� �� �߰��� �Է��� ����Ʈ ���ڿ������� ���� �ջ�Ǿ� ��µȴ�.
		System.out.println(result);
		// sb. �� �����氡���ϴ� �����߰�, �߶󳻰ų� �� ��� 
		// sb.reverse(); == ���ʴ�� �Է��� ������� ������ �Ųٷ� ���浵�Ҽ��ִ� (�����ȿ��Է��� ������ ������ �ٲ� ��µǴ°Ծƴϰ� �ȿ��Է��� �Է°���ü�� �Ųٷ� ��µȴ�)
		// ���ε�� ������ 255.0 ���� ������ ������ ���������� �ָ� 0.552 �̷������� ���� �����Ѵ�
		
		
		
		StringBuffer sbuffer; // ��Ʈ�����۴� �����й��� �����ʹ� �ٸ��� �����ϰ� �����ϰ� ����ϱ����� �޼ҵ��
		
		
		sb.setCharAt(0 , 'Q');
		sb.insert(0, "����");
		
//		String str = "���� ���ڿ�";
//		String other = "�ٸ� ���ڿ�";
//		// String origin = "���� ���ڿ�";
//		
//		String concat = str + other;
//		System.out.println(concat);
		//System.out.println("���� ���ڿ� �ٸ� ���ڿ�" == concat);
		
		// System.out.println(str == origin);
	}
}
