public class Main2 {
	public static void main(String[] args) {
		// Wrapper class
		// Byte
		// Short
		// Integer
		// Long
		// Float
		// Double
		// Character
		// Boolean
		Integer i = new Integer(10); // deprecated
		Integer i2 = Integer.valueOf(500); // boxing
		int primitiveInt = i2.intValue(); // unboxing
		
		// System.out.println(primitiveInt);
		Integer auto = 100; // auto-boxing
		int un = auto;
		
		Integer value = Integer.valueOf("5959");
		int result = Integer.valueOf("1234");
		
		Integer.parseInt("90");
	}
}
