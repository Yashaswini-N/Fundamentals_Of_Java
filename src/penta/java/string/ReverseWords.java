package penta.java.string;

public class ReverseWords {

	public static void main(String[]args)
	{
	 String str = "Java Program";
	 String strarr[]= str.split(" ");
	 System.out.println("Splitted array");
	 for (int i=0;i<strarr.length;i++) {
		 System.out.println(strarr[i]);
	 }
	 System.out.println("=========================");
	 String rev = "";
	// System.out.println("=========================");
	 
	 for(int i =0;i<strarr.length;i++) {
		 
		 String word= strarr[i];
		 for(int j= word.length()-1;j>=0;j--) {
			 rev = rev+ word.charAt(j);
		 }
		 
		 rev = rev +" ";
	 }
	 System.out.println("Reversed String");
	 System.out.println(rev);
	}
}
