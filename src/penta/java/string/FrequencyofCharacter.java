package penta.java.string;

import java.util.Scanner;

public class FrequencyofCharacter {
	
	public static void main(String[] args) {
		
		String str = "Yeshaswini";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter char to check frequency");
		char ch = sc.next().charAt(0);
		int count =0;
		for(int i=0;i<str.length();i++) {
			
			if(ch==str.charAt(i))
			{
			count++;
			
		}
		}
		System.out.println(ch+" occurs "+ count + " times");
	}
}

