public class TestToy {
	public static void main(String[] args) {
		Toy toy1 = new Toy("���峭��" , 5000);
		
//		ToyFactory fac = new ToyFactory();
		Toy chucky = ToyFactory.makeToy();
	}
}
