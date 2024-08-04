package penta.java.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

//If the superclass method does not declare an exception,
//subclass overridden method cannot declare the checked exception
//but it can declare unchecked exception.

/* 
 * If the superclass method declares an exception,
 * subclass overridden method can declare same,
 * subclass exception or no exception
 * but cannot declare parent exception
 */
class Parent
{
	void print() throws IOException 
	{
		System.out.println("Parent exception");
	}
}

class Child extends Parent
{
	@Override
	void print() throws FileNotFoundException
	{
		System.out.println("Child exception");
	}
}
public class ExceptionWithMethodOverriding {
	
	public static void main(String[] args) {
		
		
	}

}
