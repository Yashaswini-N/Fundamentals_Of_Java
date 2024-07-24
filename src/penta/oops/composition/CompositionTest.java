package penta.oops.composition;

class Heart
{
	void pump()
	{
		System.out.println("Heart is pumping! , Human is alive");
	}
}

class Human
{
	String gender = "male";
	Heart h= new Heart();
//	Human()
//	{
//	h = new Heart();//late intialization
//		
//	}
}

public class CompositionTest {
	
	public static void main(String[] args) {
		
		Human human = new Human();
		System.out.println("Gender is :"+ human.gender);
		human.h.pump();
		
		
	}

}
