package penta.oops.abstraction;

abstract class Dishes
{
	abstract void cooking();
}
// Dishes$1
public class AnonymousInnerClass {
	
	public static void main(String[] args) {
		
		Dishes d = new Dishes() 
		{ // class without a name 
			
            @Override
			void cooking() {
				System.out.println("Preparing biryani");
				
			}
			
		};// we should enclose with semicolons
		d.cooking();
		}
}