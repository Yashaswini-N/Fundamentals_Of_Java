package penta.java.exception;

class DoNotDisturbException extends Exception
{
	DoNotDisturbException(String message)
	{
		super(message);// or you can put a message inside the super itself but no need to create the parameter
	}
}
class Study
{
	boolean phonering = true;
	void checkPhone() throws DoNotDisturbException
	{
		System.out.println("Started Studying");
		if(phonering == true)
		{
			throw new DoNotDisturbException("Phone is ringing,Unable to study");//constructor calling parameter type string through creating object
			
		}
		else
		{
			System.out.println("No Disturbance");
		}
	}
}
public class CustomExceptions {
	public static void main(String[] args) throws DoNotDisturbException {
		
		Study s = new Study();
		s.checkPhone();
		
	}

}
