package penta.oops.constructors;

public class ConstructorTest {
	int num;
	ConstructorTest()
	{
		System.out.println("Inside No Arg Constructor");
	}
	ConstructorTest(int n)
	{
		num = n;
		System.out.println("Inside parameterized constructor");
	}
	public static void main(String[] args)
	{
		ConstructorTest c = new ConstructorTest(20);
		ConstructorTest c1 = new ConstructorTest();
	}
	

}
