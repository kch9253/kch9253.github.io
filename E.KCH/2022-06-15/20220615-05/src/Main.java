
public class Main {
	public static void main(String[] args) {
		//Flyable f = new Flyable(); 
		
//		pengguin pengguin = new pengguin();
//		Flyble test = pengguin;
		
		Eagle e = new Eagle();
		Bird b = e; // ��ĳ����
		Animal a = e; // ��ĳ����
		Flyable f = e; // ��ĳ����
		
		Eagle downCasting = (Eagle) f;
		downCasting.fly();
		
		f.fly(); // eagle ������ f = e 
		
		Flyable p = new Plane();
		Flyable fish = new FlyingFish();
		
		p.fly();
		fish.fly();
	}
}
