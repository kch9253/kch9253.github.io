public class books2 {
	public static void main(String[] args) {
		
		if (book instanceof Magzine) {
			Magzine otherRef = (Magzine) book;
			otherRef.getPublishDate();
		} 
		// if (book instanceof Magzine) �� ���� �θ��ǰ��� Magzine �� ���ڴ� �����ϰ�
		// Magzine otherRef = (Magzine) book; = �ڽ��� �θ��ǰ��� Ȱ���Ͽ� �ڽ��� �������� �߰��Ͽ� �θ��ǰ��� ����Ȱ�밡��
		// otherRef.getPublishDate(); = �ڽ��� ������ getPublishDate() �� ������ͼ� 
		// ���� �θ��� �ʵ尪�� name , score, data �̷������� 3���� �ʵ尡������ �װ��� �ڽ��ǰ� getPublishDate() �� Ȱ���Ҽ��ִ�
		// ����ҽÿ� (name, score, data, PublishDate) �� �� 4������ Ȱ���Ͽ� ����Ҽ��ִ�.
		
		// instanceof �� �� �ʿ��ϴ�.
		
		
		// ���� ��� �ڽ� 1,2,3 �� �������
		// �θ� a = new �ڽ�1(); �����ߴµ�
		// �ؿ� �ڽ�2�� ���� �������ص� �θ�a�� ���� �ҷ��ͼ� �����ϸ� ���������.
		// �θ� a �� �ڽ� 1�� �����߱⶧���� �ڽ�2 �� �θ� a �� ���� �ҷ��������Ѵ�
		// ����ȯ�� �ϰ�ʹٸ� ����ȯ�� ��Ų ���� �ҷ��ͼ� ����Ѵ�
		
		
		// Object �� �ֻ���� Ŭ������ �����̶� �����ϸ��
		
		
		else if (book instanceof Novel) {
			Novel nnn = (Novel) book;
			nnn.getRating();
		}
		
	}
}
