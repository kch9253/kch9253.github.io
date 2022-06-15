public class books2 {
	public static void main(String[] args) {
		
		if (book instanceof Magzine) {
			Magzine otherRef = (Magzine) book;
			otherRef.getPublishDate();
		} 
		// if (book instanceof Magzine) 를 통해 부모의값을 Magzine 이 쓰겠다 선언하고
		// Magzine otherRef = (Magzine) book; = 자식이 부모의값을 활용하여 자식이 가진값을 추가하여 부모의값을 같이활용가능
		// otherRef.getPublishDate(); = 자식이 가진값 getPublishDate() 를 데리고와서 
		// 만약 부모의 필드값이 name , score, data 이런식으로 3개의 필드가있으면 그값과 자식의값 getPublishDate() 를 활용할수있다
		// 출력할시에 (name, score, data, PublishDate) 의 총 4개값을 활용하여 출력할수있다.
		
		// instanceof 가 꼭 필요하다.
		
		
		// 예를 들어 자식 1,2,3 이 있을경우
		// 부모 a = new 자식1(); 선언했는데
		// 밑에 자식2가 위에 값을정해둔 부모a의 값을 불러와서 쓰려하면 에러가뜬다.
		// 부모 a 는 자식 1을 선언했기때문에 자식2 는 부모 a 의 값을 불러쓰지못한다
		// 형변환을 하고싶다면 형변환을 시킨 값을 불러와서 써야한다
		
		
		// Object 는 최상단의 클래스다 조상이라 생각하면됨
		
		
		else if (book instanceof Novel) {
			Novel nnn = (Novel) book;
			nnn.getRating();
		}
		
	}
}
