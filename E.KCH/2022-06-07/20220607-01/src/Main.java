import first.InPackageClass;    // 패지키를 통해 다른 클래스를 불러올경우 임폴트값을 넣고 불러와야한다.
import first.second.AnotherClass;

public class Main {
	public static void main(String[] args) {
		InPackageClass test = new InPackageClass();
		
		AnotherClass test2 = new AnotherClass();
		test2.number = 10;
		
	}
}
