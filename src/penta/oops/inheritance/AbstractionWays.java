package penta.oops.inheritance;

abstract class Vehicle1
{
	abstract void start();
	abstract void stop();
}

abstract class Car1 extends Vehicle1
{
	@Override
	void start() {
		System.out.println("Starting Car");
	}
}
 class Car2 extends Car1 
{
	@Override
	void stop() {
		System.out.println("Stoping Car");
		
	}
	
}

public class AbstractionWays {

	public static void main(String[] args) {
		//Car1 carr = new Car1();
		
		Car2 car = new Car2();
		car.stop();
		car.start();
	}
}
