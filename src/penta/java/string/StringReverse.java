package penta.java.string;

public class StringReverse {
	
	public static void main(String args[])
	{
		String str = "Hello World";
		
		//String reverse ="";
		
		for(int i= str.length()-1;i>=0;i--) {
			//System.out.println(str.charAt(i));
			System.out.print(str.charAt(i));
			
			//reverse = reverse+str.charAt(i);
		}
		//System.out.println(reverse);
	}
}

