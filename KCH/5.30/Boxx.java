public class Boxx {
	int width;
	int length;
	int height;
	
	public Boxx(int w, int l, int h) {
		width = w;
		length = l;
		height = h;
	}
	
	public static void main (String[] args) {
		Boxx b3 = new Boxx();
		
		// Boxx b = new Boxx(50, 60, 70);
		
		// System.out.println(b.width);
		// System.out.println(b.length);
		// System.out.println(b.height);
		
		// // 박스 인스턴스화. 생성자를 호출해서 가로 90 세로 100 높이 110
		// Boxx b2 = new Boxx(90, 100, 110);
	}
}