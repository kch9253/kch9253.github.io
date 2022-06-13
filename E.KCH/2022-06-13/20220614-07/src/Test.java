
public class Test {

	public static void main(String[] args) {
		Book b = new Book("자바" , 100 , "저자없음");
		System.out.println(b.toString());
		
		Magazine m = new Magazine("자바" , 100 , "저자없음", "발매일");
		System.out.println(m.toString());

	}

}
