package penta.oops.polymorphism;

class Addition
{
	void add(int a, int b)
	{
		int c= a+b;
		System.out.println("Addition of Two numbers :"+c);
	}
	
	void add(int a ,float b)
	{
		int  c= (int) (a+b);
		System.out.println("Addition of Two numbers with Same parameter and different datatype : "+c);
	}
	void add(int a ,int b,int c)
	{
		int res = a+b+c;
		System.out.println("Addition of 3 Numbers with different parameters:POV :"+res);
	}
}

public class CompileTIme {

	public static void main(String[] args) {
		
		Addition ad = new Addition();
		ad.add(12,13);
		ad.add(23,45,56);
		ad.add(13, 34.45f);
		
	}
}
