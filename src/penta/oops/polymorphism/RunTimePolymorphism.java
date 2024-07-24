package penta.oops.polymorphism;

class House
{
	void build()
	{
		System.out.println("Building normal house with 2 BHK without stairs");
	}
}

class DuplexHouse extends House
{
	@Override // use to see the method is override method or not
	void build()
	{
		System.out.println("Implenenting old house with new house with extra 3 bedrooms with stairs");
	}
}
public class RunTimePolymorphism {
	
	public static void main(String[] args) {
		
		DuplexHouse dh = new DuplexHouse();
		dh.build();
		
		House h = new House();
		h.build();
		
		
	}

}
