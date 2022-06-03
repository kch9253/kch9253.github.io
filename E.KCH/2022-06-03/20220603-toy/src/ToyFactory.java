public class ToyFactory {
	private String location;
	
	public static Toy makeToy() {
		return new Toy("처기인형" , 10000);
	}
}
