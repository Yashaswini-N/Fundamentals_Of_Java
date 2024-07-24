package penta.oops.inheritance;

class GrandFather
{
	void land()
	{
		System.out.println("Having 10 acres of land");
	}
}
//From Father to Son single level.
class Father extends GrandFather
{
	String name = "John";
	void house()
	{
		System.out.println("Having 3BHK Flat");
	}
}

class Son extends Father
{
	String name = "Ravi";
	void car()
	{
  System.out.println("Having Car");
  System.out.println("Name is :"+super.name);//super keyword used to differentiate the base class from derived class if they have same name.
}
}
public class SingleLevel {
	
	public static void main(String[] args) {
		Son s = new Son();
		Father f = new Father();
		GrandFather gf = new GrandFather();
		s.land();
		s.house();
		s.car();
		f.house();
		f.land();
		gf.land();
		
		
		
}
}
