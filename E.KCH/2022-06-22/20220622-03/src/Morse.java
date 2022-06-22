import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Morse {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		map.put("A", "ㆍ－");
		map.put("B", "－ㆍㆍㆍ");
		map.put("C", "－ㆍ－ㆍ");
		map.put("D", "－ㆍㆍ");
		map.put("E", "ㆍ");
		map.put("F", "ㆍㆍ－ㆍ");
		map.put("G", "－－ㆍ");
		map.put("H", "ㆍㆍㆍㆍ");
		map.put("I", "ㆍㆍ");
		map.put("J", "ㆍ－－－");
		map.put("K", "－ㆍ－");
		map.put("L", "ㆍ－ㆍㆍ");
		map.put("M", "－－");
		map.put("N", "－ㆍ");
		map.put("O", "－－－");
		map.put("P", "ㆍ－－ㆍ");
		map.put("Q", "－－ㆍ－ ");
		map.put("R", "ㆍ－ㆍ ");
		map.put("S", "ㆍㆍㆍ");
		map.put("T", "－ ");
		map.put("U", "ㆍㆍ－");
		map.put("V", "ㆍㆍㆍ－");
		map.put("W", "ㆍ－－ ");
		map.put("X", "－ㆍㆍ－ ");
		map.put("Y", "－ㆍ－－ ");
		map.put("Z", "－－ㆍㆍ");
		
		// 모스 부호 변환 프로그램
		
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
