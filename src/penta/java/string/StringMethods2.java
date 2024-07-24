package penta.java.string;

public class StringMethods2 {
	
	public static void main(String[] args) {
		String str1 = "Hello World, Welcome to java ";
		String str2 = "Harsha";
		String str3 = new String("Harshitha");
		
	    System.out.println(str1==str2);
		System.out.println(str3==str1);
		System.out.println(str1.equals(str3));
		System.out.println(str1.equalsIgnoreCase(str3));
		
		System.out.println(str1.contains("come to java"));
		System.out.println(str3.compareTo(str2));
		//System.out.println(str1);
		System.out.println(str1.trim());
		
		System.out.println("Substring=============================");
		System.out.println(str1.substring(6,20));
		String newstr = String.join(" ","Welcome","to","Pentagonspace");
		System.out.println(newstr);
		String upper = "YESHASWINI";
		System.out.println(upper.toLowerCase());
		String lower = "sanjay";
		System.out.println(lower.toUpperCase());
		String str4 = "Hello World";
		String low="";
		
		for (int i=0;i<str4.length();i++)
		{
			
			if(str4.charAt(i)>=65 && str4.charAt(i)<=90)
			{
				System.out.print((char)(str4.charAt(i)+32));
				
			}
			else if(str4.charAt(i)>=97 && str4.charAt(i)<=122)
			{
				System.out.print((char)(str4.charAt(i)-32));
			}
			else
			{
				System.out.print(str4.charAt(i));
			}
			
		}
		
	}

}
