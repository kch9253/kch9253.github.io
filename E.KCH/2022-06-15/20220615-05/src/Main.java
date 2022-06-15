
public class Main {
	public static void main(String[] args) {
		//Flyable f = new Flyable(); 
		
//		pengguin pengguin = new pengguin();
//		Flyble test = pengguin;
		
		Eagle e = new Eagle();
		Bird b = e; // 업캐스팅
		Animal a = e; // 업캐스팅
		Flyable f = e; // 업캐스팅
		
		Eagle downCasting = (Eagle) f;
		downCasting.fly();
		
		f.fly(); // eagle 독수리 f = e 
		
		Flyable p = new Plane();
		Flyable fish = new FlyingFish();
		
		p.fly();
		fish.fly();
	}
}
