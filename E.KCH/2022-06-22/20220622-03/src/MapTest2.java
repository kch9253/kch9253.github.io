import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest2 {

	public static void main(String[] args) {
		Map<Character, String> map = new HashMap<>();
		map.put('A', "����");
		map.put('B', "��������");
		map.put('C', "��������");
		map.put('D', "������");
		map.put('E', "��");
		map.put('F', "��������");
		map.put('G', "������");
		map.put('H', "��������");
		map.put('I', "����");
		map.put('J', "��������");
		map.put('K', "������");
		map.put('L', "��������");
		map.put('M', "����");
		map.put('N', "����");
		map.put('O', "������");
		map.put('P', "��������");
		map.put('Q', "�������� ");
		map.put('R', "������ ");
		map.put('S', "������");
		map.put('T', "�� ");
		map.put('U', "������");
		map.put('V', "��������");
		map.put('W', "������ ");
		map.put('X', "�������� ");
		map.put('Y', "�������� ");
		map.put('Z', "��������");
		
		// �� ��ȣ ��ȯ ���α׷�.
		
		// SOS -> ������ ������ ������
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			System.out.println(map.get(c));
		}

	}

}