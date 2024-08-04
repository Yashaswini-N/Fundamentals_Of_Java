package penta.java.collections;

class StoreData<T> // t to specify the data type
{
	T data;
	void add(T data)
	{
		this.data = data;
	}
}

public class Generics {
	
	public static void main(String[] args) {
		
		StoreData st = new StoreData();
		st.add("ABC");
		st.add(123);
		System.out.println(st.data);//  if not specified it will take any data type u give and print the latest data type entered.
		
		StoreData<String> st1 = new StoreData<String>();
		st1.add("ABC");
		System.out.println(st1.data);// we can specify the data type through which we want to get the output.
		
		StoreData<Integer> i = new StoreData<Integer>();
		i.add(123);
		System.out.println(i.data);
		
		
	}

}
