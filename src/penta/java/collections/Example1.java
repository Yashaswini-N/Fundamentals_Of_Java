package penta.java.collections;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
	
	public static void main(String[] args) {
		// Without using generics
		List list = new ArrayList();
		list.add("String"); // 0th index
		list.add(123); // 1th index
		list.add(new int[] {12,34,56});// 2nd index , direct array we have kept so it is printing array should retrieve with the help of for loop.
		
		list.add('c');//3rd index
	    System.out.println(list);// 4th index
	    
	    int arr[] = (int[]) list.get(2);
	    String str = (String) list.get(0);
	    
	    // when there is mixture of int and string we can use this.
	    for(Object obj : list)
	    {
	    	System.out.println(obj);
	    }
	    
	   // with using generics
	    List<Integer> lst = new ArrayList<Integer>();
	    
	    lst.add(12);
	    lst.add(23);
	    lst.add(45);
	    lst.add(67);
	    System.out.println(lst);
	    
	    List<String> st = new ArrayList<String>();
	    
	    st.add("Yashu");
	    st.add("sonu");
	    st.add("sanju");
	    st.add("riya");
	   
	    System.out.println(st);
	    
	    List<Character> c = new ArrayList<Character>();
	    
	    c.add('c');
	    c.add('a');
	    c.add('t');
	    System.out.println(c);
	    
	    
	    
	    
	}

}
