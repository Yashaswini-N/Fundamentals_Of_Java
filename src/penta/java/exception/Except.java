package penta.java.exception;

public class Except {
	
	public static void main(String[] args) {
		
		System.out.println("Starting ");
		try {
			
		int num = 4/0;
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		//int a[] = {35,56,12,45};
		try {
	    int a[] = {35,56,12,45};
		System.out.println(a[6]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		System.out.println("Ending ");
	}

}
