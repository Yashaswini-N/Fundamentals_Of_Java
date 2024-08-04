package penta.java.collections;

import java.util.ArrayList;
import java.util.Collections;

public class DrinksTest {

	public static void main(String[] args) {
		
		Drinks d1 = new Drinks("SoftDrinks","Cococola",2,90);
		Drinks d2 = new Drinks("HotDrinks","Black & White",0.75,2400);
		Drinks d3 = new Drinks("SoftDrinks","Slice",0.5,50);
		Drinks d4 = new Drinks("Beer","Tuborg",0.650,190);
		Drinks d5 = new Drinks("Vodka","Magic Moment- Green Apple",0.750,1600);
		
	//	System.out.println(d1);
		
		ArrayList<Drinks> drinkslist = new ArrayList<>();
		Collections.addAll(drinkslist, d1,d2,d3,d4,d5);
		
		for(Drinks d :drinkslist)
		{
			System.out.println(d);
			System.out.println("==================");
		}
		
		drinkslist.remove(3);
		System.out.println("After removal");
		System.out.println("--------------------------------");
		for(Drinks d :drinkslist)
		{
			
			System.out.println(d);
			System.out.println("==================");
		}
		drinkslist.set(0, d4);
		
		System.out.println();
		System.out.println("After Replacing");
		System.out.println("----------------------------------");
		
		for(Drinks d :drinkslist)
		{
			System.out.println(d);
			System.out.println("==================");
		}
		System.out.println("Getting single object from list using get method");
		System.out.println(drinkslist.get(1));
		System.out.println("-------------------------------------");
		System.out.println("Using normal for Loop");
		System.out.println("-------------------------------------");
		for(int i =0; i<drinkslist.size();i++)
		{
			System.out.println(drinkslist.get(i));
			System.out.println();
		}
		
//		for(Drinks d :drinkslist)
//		{
//			System.out.println(d);
//		}
	}
}
