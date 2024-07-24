package penta.java.string;

public class StringExample1 {

	public static void main(String[] args) {
		
		String str = "Hello";
		System.out.println(str);
		
		String str1 = str.concat(" World");
		System.out.println(str1);
		
		String str2 = "Hello";
		System.out.println(str1==str2);
		System.out.println(str==str2);
		
		String str3 = new String("Hello");
		System.out.println(str==str3);
		
		
	}
}
