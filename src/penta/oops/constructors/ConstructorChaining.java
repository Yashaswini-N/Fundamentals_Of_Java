package penta.oops.constructors;

public class ConstructorChaining {
	
	ConstructorChaining()
	{
		this(10,20);
		System.out.println("Constructor 1");
	}
    ConstructorChaining(int a)//parameterized constructor
    {
    	this();
    	System.out.println("Constructor 2");
    	 
    }
   
    ConstructorChaining(int a,int b)
    {
    	
    	System.out.println("Constructor 3");
    }
    
    
  public static void main(String[] args) {
	  
	  ConstructorChaining c = new  ConstructorChaining(20);
	  
}
}