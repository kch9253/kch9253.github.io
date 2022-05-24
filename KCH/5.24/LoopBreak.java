public class LoopBreak {
	public static void main (String[] args){
		for (int i = 0; i < 10; i++){
			if (i == 5) {
				break; // if() 괄호안의 값만큼 수행하다 멈추는기능 0~순서대로 / for의 i값과 if 의 i값과 충돌하는
			} 			// 반복문을 종료하고싶을때 break를 통해 종료시키기
			System.out.println(i);
		}
		
		for (int i = 0; i < 20; i++){
			if (i % 10 == 5) {
				continue; // break 비슷하게 사용된다 이또한 멈추는기능
			} 			  // continue 는 반복문을 종료시키지않지만 현재관계를 건너뛴다 / 증강식으로 건너뜀
			System.out.println(i);
		}
		
		int i = 20;
		while (i < 30) {
			if (i == 25) {
				continue;
			}
			System.out.println(i);
			i++;
		}
		System.out.println("프로그램 종료");
	}
}