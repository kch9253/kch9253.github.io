public class DogTest {
	public static void main (String[] args) {
		Dog dog1 = new Dog("하루" , "코카스파니엘" , 12);
		Dog dog2 = new Dog("하루" , "코카스파니엘");
		Dog dog3 = new Dog("하루" , "코카스파니엘" , 12);
		
		System.out.println(dog1.getname());
		System.out.println(dog3.getbreed());
		System.out.println(dog2.getage());
		
		
	}
}