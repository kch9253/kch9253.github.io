// 책  (class Book)
// 필드(상태) : 제목(title) , 저자(author)
//메소드 (기능) : 제목과 저자를 콘솔에 출력 가능 (printAll)



// 
// 위의 클래스를 테스트 할수있는 main 메소드를 포함하는 클래스를 작성하고
// 인스턴스화 하여, 필드값을 대입연산 후 출력메소드를 호출하여 콘솔에서 값 확인.


class Book {
	String title;
	String author;
	void print() {
		System.out.println("(" + title + " , " + author + ")");
	}

}

public class Book2 {
	public static void main (String[] args) {
		Book name = new Book();
		name.title = "제목 : 내다";
		name.author = "저자 : 내다";
		name.print();
	}
}