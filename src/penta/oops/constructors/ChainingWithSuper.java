package penta.oops.constructors;

class Parent
{
	String pname;
	int parent_age;
	Parent(String pname,int parent_age)
	{
		this.pname = pname;
		this.parent_age = parent_age;
		System.out.println("Parent Calling");
	}
}

class Child extends Parent
{

	 String cname;
	Child(String pname, int parent_age,String cname) {
		super(pname, parent_age);// intialize in different class
		this.cname = cname; //  intialize in same class
		
		System.out.println("Child Calling");
	}
	void disp()
	{
		System.out.println("Parent Name :"+pname);
		System.out.println("Parent Age :"+parent_age);
		System.out.println("Child Name :"+cname);
	}
	
}
public class ChainingWithSuper {
	
	public static void main(String[] args) {
		
		Child c = new Child("Poornima",18,"pumpkin");
		c.disp();
	    
		
	}
	

}
