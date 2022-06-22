import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Morse {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		map.put("A", "����");
		map.put("B", "��������");
		map.put("C", "��������");
		map.put("D", "������");
		map.put("E", "��");
		map.put("F", "��������");
		map.put("G", "������");
		map.put("H", "��������");
		map.put("I", "����");
		map.put("J", "��������");
		map.put("K", "������");
		map.put("L", "��������");
		map.put("M", "����");
		map.put("N", "����");
		map.put("O", "������");
		map.put("P", "��������");
		map.put("Q", "�������� ");
		map.put("R", "������ ");
		map.put("S", "������");
		map.put("T", "�� ");
		map.put("U", "������");
		map.put("V", "��������");
		map.put("W", "������ ");
		map.put("X", "�������� ");
		map.put("Y", "�������� ");
		map.put("Z", "��������");
		
		// �� ��ȣ ��ȯ ���α׷�
		
		// SOS -> . . . - - - . . .
		 System.out.println("enter the code : ");
         String moss = (new Scanner(System.in)).nextLine();

         if("".equals(moss)) return;

         String[] space = moss.split("  ");
         String[] tran;
         StringBuffer sb = new StringBuffer();

         for(String spaceTxt:space){
                 tran = spaceTxt.split(" ");
                 for(String key:tran){
                         if(map.containsKey(key)) {
                                 sb.append(map.get(key));
                         } else {
                                 sb.append("?");
                         }
                 }
                 sb.append(" ");

         }
         System.out.println("result : ");
         System.out.println(sb.toString());
	}
}
