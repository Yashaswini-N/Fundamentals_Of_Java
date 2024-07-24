package penta.oops.constructors;

class Address
{
	String city;
	String state;
	String country;
	
	Address(String city,String state,String country)
	{
		this.city = city;
		this.state = state;
		this.country = country;
	}
}
class Student1{
	
	String name;
	int marks;
	Address add;

	Student1(String name,int marks,Address add)
  {
	  this.name = name;
	  this.marks = marks;
	  this.add = add;
  }
}

public class Aggregation {
	
	public static void main(String[] args) {
		
		Address address = new Address("Kollegala","Karnataka","India");
		Student1 student1 = new Student1("Ranganna",50,address);
		System.out.println("Student name:"+student1.name);
		System.out.println("Student marks:"+student1.marks);
		System.out.println("Student Address:");
		System.out.println("===========================");
		System.out.println("Student City:"+student1.add.city);
		System.out.println("Student State:"+student1.add.state);
		System.out.println("Student Country:"+student1.add.country);
	}
	
	

}
