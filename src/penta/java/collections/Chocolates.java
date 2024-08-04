package penta.java.collections;

import java.util.ArrayList;
import java.util.List;

class Chocolate
{
	String name;
	String flavor;
	String toWhom;
	double price;
	public Chocolate(String name, String flavor, String toWhom, double price) {
		super();
		this.name = name;
		this.flavor = flavor;
		this.toWhom = toWhom;
		this.price = price;
	}
	void display()
	{
		System.out.println("Name : "+this.name);
		System.out.println("flavor :"+this.flavor);
		System.out.println("toWhom :"+this.toWhom);
		System.out.println("price :"+this.price);
	}
	
}

public class Chocolates {
	
	public static void main(String[] args) {
		
		Chocolate c1 = new Chocolate("Kitkat","Choco","Myself",50);
		Chocolate c2 = new Chocolate("Snickers","Peanuts","Husband",100);
		Chocolate c3 = new Chocolate("DairyMilk","Silk","Girlfriend",195);
		Chocolate c4 = new Chocolate("Bounty","Cococnut","Disha",99);
		
		List<Chocolate> chocolist = new ArrayList<>();
		
		chocolist.add(c1); // add
		chocolist.add(c2);
		chocolist.add(c3);
		chocolist.add(c4);
		System.out.println("After adding");
		System.out.println("--------------------------------------");
		for(Chocolate c : chocolist)
		{
			c.display();
			System.out.println("========================");
			System.out.println(c);
		}
		
		
		chocolist.remove(c4); // remove 
		System.out.println("After removal");
		System.out.println("-------------------------------------");
		for(Chocolate c : chocolist)
		{
			c.display();
			System.out.println("===================================");
		}
		chocolist.set(2, c4);
		
		System.out.println("After update");
		System.out.println("---------------------------------");
		for(Chocolate c : chocolist)
		{
		 c.display();
		 System.out.println("==============================");
		}
		
		
		Chocolate c5 = new Chocolate("5 star","Choco","Friends",50);
		chocolist.set(0, c5); // replace
		System.out.println("After Replacing");
		System.out.println("-------------------------------------");
		for(Chocolate c :chocolist)
		{
			c.display();
			System.out.println("====================================");
		}
		
		chocolist.get(0).flavor ="Chocoflakes"; // update particular field
		System.out.println("After update of falvor");
		System.out.println("------------------------------------------");
		for(Chocolate c :chocolist) 
		{
			c.display();
			System.out.println("=======================================");
		}
	
		
		
	}

}
