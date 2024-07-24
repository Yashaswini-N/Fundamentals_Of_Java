package penta.oops.constructors;

public class Employee {
	
	int empid = 12;
	String empname = "Anusha";
	double salary = 20000.00;
	
	Employee(int empid,String empname,double salary)
	{
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}
   public Employee() {
	
}
	Employee getObj() {
	
	return this;
}

	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
    System.out.println(emp.getObj());
	System.out.println(emp.empid);
	System.out.println(emp.empname);
    System.out.println(emp.salary);
		
		
	}
	

}
