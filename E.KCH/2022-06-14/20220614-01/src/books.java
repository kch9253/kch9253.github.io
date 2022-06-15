public class books {
	public static void main(String[] args) {
		
		Book b = new Book("책" , 50 , "책");
		if (b instanceof Magazine) { // instanceof 는 
			Magazine m = (Magazine) b;
		}
		
		// book 은 부모의값이다 Magazine 은 자식의 값이다
		// book b = new Magazine 을통해 부모는 자식의 값을 덮어서 사용할수있고
		// Magazine m = (Magazine) book; 을통해 자식은 부모의 값을 불러와 자식의값+부모의값을 활용할수있다
		
		// 단 주의할점은 부모의 값을 new 를 통해 부모의값을 그대로 활용할경우 ex) Book b = new Book();
		// 이런식으로 부모가 부모의값을 초기화할경우 자식은 부모의값을 불러서 사용할수없다.
		
		// 이럴경우 조건문을 주고 if (b instanceof Magazine) 이런식으로 활용해서 
		// 부모의 b 값과 Magazine 의 값이 맞냐는 조건문을 걸어 활용할수있다
		// instanceof 는 두 클래스를 같이 사용할수있냐 없냐를 물어보는 타입이다.
		
		
		// 부모는 자식으로 형변환을 할경우 그냥 부모의 값으로만 덮어버린다.
		// 자식은 부모의 값으로 형변환을 할경우 자식의값+부모의값을 둘다 활용할수있다.
		
		
		// ★ 만약 손쉽게 서로의값을 활용하고자 할때는 부모를 자식으로 형변환 시키고 자식을 부모로 형변환시켜서
		// 부모는 부모의값만 사용하고 , 자식은 부모의값도 모두 활용가능하게 진행하면된다.
		// 형변환이 이뤄지지않는다면 컴파일 에러가뜬다.
		
		
	}
}
