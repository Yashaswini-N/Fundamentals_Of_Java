package penta.oops.inheritance;

class Vehicle{
	void features()
	{
		System.out.println("Engine \n"+"Accelerator \n"+"Breakes\n"+"Wheels \n");
	}
	
}

class Car extends Vehicle{
	String enginetype ="Petrol";
	void carFeatures()
	{
		features();// we can call method within the method also hence example for showing it.
		System.out.println("Engine Type"+enginetype);
	}
	
}

class BMW extends Car{
	
	int modelyear = 2010;
	
	double price = 2500000;
	
	void bmwDetails()
	{
		carFeatures();
		System.out.println("Model Year:"+modelyear);
		System.out.println("price:"+price);
		
	}
	
	
	
	
}
public class Multilevel {
	public static void main(String[] args) {
		
	Car c = new Car();
    System.out.println("Car - Parent Details");
  //  c.features();
    c.carFeatures();
    BMW b = new BMW();
    System.out.println("BMW- Child Details");
   // b.features();
   // b.carFeatures();
    b.bmwDetails();
	

}
}
