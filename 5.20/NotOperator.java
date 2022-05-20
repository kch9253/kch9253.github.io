
// import java.util.Scanner;


// 논리연산자

public class NotOperator {
	public static void main(String[] args) {
		boolean t = true;
		
		
		// 논리연산자의 값을 뒤집고자할때 쓰는표현 (!)=Not
		t = !t;
		// !t 의값이 앞에 t의 값을 먹어버린다 (!는 거짓으로 표현되기때문에 t의값이 거짓이되버림)
		System.out.println(t);
		
		// !((10 > 3) && (3 == 3)) == 결과값 : 원래값은 둘다 true 지만  ! 앞에붙었기때문에 둘다 거짓
		// !(!(10 > 3)) || (3 == 3)) == 결과값 : 둘다 거짓 (||를 통해 둘중하나만 맞아도 진실이라 뜨지만 ! 를 통해 값이변동)
		
		// Scanner scan = new Scanner(System.in);
	}
}