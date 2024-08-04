package penta.java.objectcreation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Demo
{
	String name = "Sonu";
	
}
public class ObjectCreation implements Cloneable{
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, CloneNotSupportedException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
	//1. Using a new Keyword
		Demo d = new Demo();
		System.out.println(d.name);
		
   //2. Using class.newInstance()
		Demo d1 = Demo.class.newInstance();
		System.out.println(d1.name);
		
   //3. Using Clone();
		ObjectCreation obj = new ObjectCreation();
		System.out.println(obj);
		ObjectCreation obj1 = (ObjectCreation) obj.clone();
		
		System.out.println(obj1);
		
		
//	Demo  d2 = d1;
//	System.out.println(d2.name);
//	System.out.println(d1);
//	System.out.println(d2);
		
   //4. newInstance() method of constructor
		Constructor<ObjectCreation> ob = ObjectCreation.class.getConstructor();
		ObjectCreation ob1 = ob.newInstance();
		System.out.println(ob1);
		
		
	}

}
