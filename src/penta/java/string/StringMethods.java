package penta.java.string;

public class StringMethods {
public static void main(String[] args) {
		
		String str = "Java Program";
		int index = 0;
		str.charAt(index);
		System.out.println("for a specific index:"+str.charAt(3));
		System.out.println("Length of a string:" + str.length());
		str = str.concat(" Language");
		for(int i=0; i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
		System.out.println("Concatination:"+str);
		String words[] = str.split(" ");
		System.out.println("Splitting string of words");
		 
		 for(int i=0;i<words.length;i++)
		 {
			 System.out.println(words[i]);
		 }
         System.out.println("===========================");
         System.out.println("Formatting String");
         String temp = "Raj";
         String str6 = temp.format("%s" , temp);
         System.out.println("The value is "+str6);
         int num = 1;
         
         for (int i = 1 ; i<=100; i++) {
        	 
         
         String form = String.format("%010d", num);
         num++;
         System.out.println(form+ "txn");
         }
         
         		      		 
         		

}
}
