package penta.oops.abstraction;

abstract class Operation 
{
	abstract int calculate(int a , int b);
	
	void msg()
	{
		System.out.println("Welcome to Arithmetic operations");
	}
}
class Addition extends Operation
{

	@Override
	int calculate(int a, int b) {
		
		return a+b;
	}
	
}
class Substraction extends Operation
{

	@Override
	int calculate(int a, int b) {
		
		return a-b;
	}
	
}
class Multiplication extends Operation
{

	@Override
	int calculate(int a, int b) {
		
		return a*b;
	}
	
}
public class AbstractionTest {

	public static void main(String[] args) {
		
		Addition add = new Addition();
		add.msg();
		System.out.println(add.calculate(12, 45));
		Substraction sub = new Substraction();
		System.out.println(sub.calculate(4, 3));
		Multiplication mul = new Multiplication();
		System.out.println(mul.calculate(7,8));
		
	}
}
