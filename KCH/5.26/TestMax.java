public class TestMax {
	public static int max(int left, int right) {
		return left > right ? left : right; // 왼쪽이 크냐 오른족이크냐 물어보는 조건값
	} //
	
	public static void main(String[] args) {
		// 3개 정수중 가장 큰 값 구하기
		int a = 3;
		int b = 4;
		int c = 5;
		// 4개
		int d = 6;
		// 5개
		int e = 7;
		
		
		System.out.println(max(e, max(d, max(c, max(a,b))))); //제일안쪽에 있는 max 순서대로 누가 크냐 토너먼트
	}
}