import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		String friday = "\"월요일엔 아마 바쁘지 않을까\\r\\n\" + \r\n" + 
				"				\"화요일도 성급해 보이지 안 그래\\r\\n\" + \r\n" + 
				"				\"수요일은 뭔가 어정쩡한 느낌\\r\\n\" + \r\n" + 
				"				\"목요일은 그냥 내가 왠지 싫어\\r\\n\" + \r\n" + 
				"				\"우 이번 주 금요일\\r\\n\" + \r\n" + 
				"				\"우 금요일에 시간 어때요 oh\\r\\n\" + \r\n" + 
				"				\"주말까지 기다리긴 힘들어\\r\\n\" + \r\n" + 
				"				\"시간아 달려라 시계를 더 보채고 싶지만\\r\\n\" + \r\n" + 
				"				\"(Mind control)\\r\\n\" + \r\n" + 
				"				\"일분 일초가 달콤해\\r\\n\" + \r\n" + 
				"				\"이 남자 도대체 뭐야\\r\\n\" + \r\n" + 
				"				\"사랑에 빠지지 않곤 못 배기겠어 (못 배기겠어)\\r\\n\" + \r\n" + 
				"				\"온 종일 내 맘은 저기 시계바늘 위에 올라타\\r\\n\" + \r\n" + 
				"				\"한 칸씩 그대에게 더 가까이\\r\\n\" + \r\n" + 
				"				\"Na na na na na\\r\\n\" + \r\n" + 
				"				\"Na na na na na na\\r\\n\" + \r\n" + 
				"				\"Na na na na na\\r\\n\" + \r\n" + 
				"				\"La la la la la la la\\r\\n\" + \r\n" + 
				"				\"La la la la la la la la la\\r\\n\" + \r\n" + 
				"				\"우 이번 주 금요일\\r\\n\" + \r\n" + 
				"				\"우 금요일에 시간 어때요 oh\\r\\n\" + \r\n" + 
				"				\"딱히 보고 싶은 영화는 없지만\\r\\n\" + \r\n" + 
				"				\"딱히 먹고 싶은 메뉴는 없지만\\r\\n\" + \r\n" + 
				"				\"주말까지 기다리긴 힘들어\\r\\n\" + \r\n" + 
				"				\"시간아 달려라 시계를 더 보채고 싶지만\\r\\n\" + \r\n" + 
				"				\"(Mind control)\\r\\n\" + \r\n" + 
				"				\"일분 일초가 달콤해\\r\\n\" + \r\n" + 
				"				\"이 남자 도대체 뭐야\\r\\n\" + \r\n" + 
				"				\"사랑에 빠지지 않곤 못 배기겠어 (겠어)\\r\\n\" + \r\n" + 
				"				\"온 종일 내 맘은 저기 시계바늘 위에 올라타\\r\\n\" + \r\n" + 
				"				\"한 칸씩 그대에게 더 가까이\\r\\n\" + \r\n" + 
				"				\"나 뭔가에 홀린 것 같아\\r\\n\" + \r\n" + 
				"				\"이 여잔 도대체 뭐야\\r\\n\" + \r\n" + 
				"				\"사랑해주지 않고는 못 배기겠어\\r\\n\" + \r\n" + 
				"				\"돌아오는 이번 주 금요일에 만나요\\r\\n\" + \r\n" + 
				"				\"그 날 내 맘을 더 가져가줘요\\r\\n\" + \r\n" + 
				"				\"Na 더 가까이 (na na na na) 더 가까이\\r\\n\" + \r\n" + 
				"				\"Na na na na na na 더 가까이 더 가까이 와요\\r\\n\" + \r\n" + 
				"				\"Na na na na na 더 가까이\\r\\n\" + \r\n" + 
				"				\"La la la la la la la la la\\r\\n\" + \r\n" + 
				"				\"La la la la la la la la la\"\r\n" + 
				"		";
		
		String word = "";
		System.out.println("검색할단어: ");
		word = scan.next();
		
		System.out.println("검색할단어: " + word);
		
		String[] sarr = friday.split(" ");
		
		int len = sarr.length;
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (sarr[i].contains(word)) { // contains = 만약 금요일을 입력했을경우 금요일뒤에 포함된 모든 문자열을 찾는데 , 그안에 금요일이 포함되어있으면 금요일만 찾아도 위 문구에서 금요일이 몇개들어있는지 출력 가능하다.
				count++;
			}
		}
		System.out.println("값: "+ count);
		

	
	}
}

