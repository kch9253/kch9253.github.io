public class books {
	public static void main(String[] args) {
		
		Book b = new Book("å" , 50 , "å");
		if (b instanceof Magazine) { // instanceof �� 
			Magazine m = (Magazine) b;
		}
		
		// book �� �θ��ǰ��̴� Magazine �� �ڽ��� ���̴�
		// book b = new Magazine ������ �θ�� �ڽ��� ���� ��� ����Ҽ��ְ�
		// Magazine m = (Magazine) book; ������ �ڽ��� �θ��� ���� �ҷ��� �ڽ��ǰ�+�θ��ǰ��� Ȱ���Ҽ��ִ�
		
		// �� ���������� �θ��� ���� new �� ���� �θ��ǰ��� �״�� Ȱ���Ұ�� ex) Book b = new Book();
		// �̷������� �θ� �θ��ǰ��� �ʱ�ȭ�Ұ�� �ڽ��� �θ��ǰ��� �ҷ��� ����Ҽ�����.
		
		// �̷���� ���ǹ��� �ְ� if (b instanceof Magazine) �̷������� Ȱ���ؼ� 
		// �θ��� b ���� Magazine �� ���� �³Ĵ� ���ǹ��� �ɾ� Ȱ���Ҽ��ִ�
		// instanceof �� �� Ŭ������ ���� ����Ҽ��ֳ� ���ĸ� ����� Ÿ���̴�.
		
		
		// �θ�� �ڽ����� ����ȯ�� �Ұ�� �׳� �θ��� �����θ� ���������.
		// �ڽ��� �θ��� ������ ����ȯ�� �Ұ�� �ڽ��ǰ�+�θ��ǰ��� �Ѵ� Ȱ���Ҽ��ִ�.
		
		
		// �� ���� �ս��� �����ǰ��� Ȱ���ϰ��� �Ҷ��� �θ� �ڽ����� ����ȯ ��Ű�� �ڽ��� �θ�� ����ȯ���Ѽ�
		// �θ�� �θ��ǰ��� ����ϰ� , �ڽ��� �θ��ǰ��� ��� Ȱ�밡���ϰ� �����ϸ�ȴ�.
		// ����ȯ�� �̷������ʴ´ٸ� ������ ���������.
		
		
	}
}