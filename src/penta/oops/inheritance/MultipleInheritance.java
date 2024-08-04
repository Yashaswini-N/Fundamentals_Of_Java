package penta.oops.inheritance;

interface Parent1
{
	void property();
}
interface Parent2 extends Parent1 // for example interface to interface we use extends
{
//	void property();
}

class Child implements Parent1,Parent2 // class with interface we use implements
{

	@Override
	public void property() {
		
		System.out.println("Purchasing 4 acres of land");
		
	}

	
}

public class MultipleInheritance {
	public static void main(String[] args) {
		
		Child c = new Child();
		c.property();
	}

}
