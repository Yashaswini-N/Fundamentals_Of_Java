package penta.oops.constructors;

public class CopyConstructor {

	int empid;
	String empname;
	double salary;
	
	CopyConstructor(int empid,String empname,double salary)
	{
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}
	
	CopyConstructor(CopyConstructor emp)
{
	this.empid = emp.empid;
	this.empname = emp.empname;
	this.salary=emp.salary;
	}
	void Disp()
	{
		System.out.println("Emp Id: " +empid);
		System.out.println("Emp Name:"+empname);
		System.out.println("Emp Salary:"+salary);
	}
	public static void main(String[] args) {
		
		CopyConstructor emp1 = new CopyConstructor(12,"Drone Prathap",2000);
		emp1.Disp();
		CopyConstructor emp2 = new CopyConstructor(emp1);
		emp2.Disp();
		System.out.println(emp1);
		System.out.println(emp2);
		
}
}