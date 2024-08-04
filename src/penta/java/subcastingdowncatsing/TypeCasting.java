package penta.java.subcastingdowncatsing;

class Parent{
	void printData()
	{
		System.out.println("Calling Parent class method");
	}
}
class Child extends Parent
{
	void printdata() // only if we write printData() we get methods of parent
	{
		System.out.println("Calling Child class method");
	}
	void disp()
	{
		System.out.println("Child Property");
	}
}

public class TypeCasting {
	
	public static void main(String[] args) {
		
		Parent p = new Child(); // parent is having the control over the child class
		p.printData(); // by up casting the child by parent , only if we override the method we get child class
		
//		child c = (child)new Parent();
//		c.printData(); // this is not possible as it will through explicit typecasting is not possible so we have do up casting and then down casting
		
		Child c = (Child)p;
		c.printdata();
		c.disp(); // direct down casting is not possible after doing up casting only its possible.
		
		
	}

}
