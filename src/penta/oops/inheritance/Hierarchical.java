package penta.oops.inheritance;

class Animal
{
	void eat()
	{
		System.out.println("Animal");
		System.out.println("Capable of eating");
	}
}

class Dog extends Animal
{
	void bark() {
		
		
		System.out.println("Dog");
		System.out.println("Bow Bow");
	}
}
class Cat extends Animal
{
	void meow()
	{
		
		System.out.println("Cat");
		System.out.println("Meow Meow");
	}
}
class Monkey extends Animal
{
	void chatter()
	{
		System.out.println("Monkey");
		System.out.println("Gur Gur");
	}
}

public class Hierarchical {
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.eat();
		d.bark();
		System.out.println("===============");
		
		Cat c = new Cat();
		c.eat();
		c.meow();
		System.out.println("===============");
		
		Monkey m = new Monkey();
		m.eat();
		m.chatter();
		System.out.println("===============");
		
	}

}
