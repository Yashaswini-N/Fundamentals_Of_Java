package penta.java.objectcreation;

public class WrapperClasses {
	
	public static void main(String[] args) {
		
		int a = 40;
		Integer b = 60;
		Integer c = new Integer(50);
		
		int num1 = 100;
		// Autoboxing -> primitive to Wrapper
		Integer num2 = num1; // with auto boxing
		Integer num3 = Integer.valueOf(num1); // without boxing
		
		//Unboxing -> wrapper to primitive
		
		Integer num4 = 1000;
		//implicit way after java 5 version
		int num5 = num4;
		
		// expliciltly converting from wrapper to primitive before java 5 version
		int num6 = num4.intValue();
		
		int h = 45;
		Integer H = Integer.valueOf(h);// without auto boxing
		
	}

}
