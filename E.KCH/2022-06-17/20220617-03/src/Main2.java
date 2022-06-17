import java.util.StringJoiner;

public class Main2 {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner("," , "[" , "]");
		sj.add("1"); // add 에 입력된 값들이 1~3 까지 출력될때 위에 입력한 쉼표값이 1~3부터 사이사이에 들어가게된다
		sj.add("2"); // 마지막 3에는 들어가지않는 이유가 스트링조이너는 사이사이에만 들어가는 성질을 가지고있다.
		sj.add("3");
		
		String result = sj.toString();
		
		System.out.println(result);
	}
}
