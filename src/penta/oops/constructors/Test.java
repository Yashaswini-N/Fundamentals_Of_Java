package penta.oops.constructors;

public class Test {
	
	int count = 0;// instance will create the object every time but static increments the existing object.
	Test()
	{
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		Test t4 = new Test();

	}

}
