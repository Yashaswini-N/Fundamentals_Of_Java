package penta.oops.interfacetest;

interface FlightBooking
{
	// abstract void checkAvailability();
	void checkAvailability();
	static void disp()
	{
		System.out.println("checking flights availability");
	}
	default void print()
	{
		System.out.println("Hello from default");
	}
}

class Airasia implements FlightBooking
{

	@Override
	public void checkAvailability() {
		
		System.out.println("Airasia Flights are available on 18-07-2024");
		
	}
	
}

class Indigo implements FlightBooking
{

	@Override
	public void checkAvailability() {
		
		System.out.println("Indigo Flights are available on 18-07-2024");
		
	}
	
}

public class Interfacetest {

	public static void main(String[] args) {
		
		FlightBooking.disp();
		Airasia asia = new Airasia();
		asia.checkAvailability();
		Indigo indigo = new Indigo();
		indigo.checkAvailability();
		asia.print();
		indigo.print();
		
		
		
	}
}
