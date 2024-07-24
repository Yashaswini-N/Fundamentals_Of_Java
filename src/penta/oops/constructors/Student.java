package penta.oops.constructors;

public class Student {
	
	String name;
	int age;
	String college;
	
	Student()
	{
		name = "Sandesh";
		age = 18;
		college = "JSSATE";
	}
	Student(String n)
	{
		name = n;
	
	}
	Student(String n,String col)
	{
		name = n;
		college = col;
		
	}
	Student(int a)
	{
		
		//int num = 10;
		age = a;
	}
	 public static void main(String[] args)
	 {
		 Student s1 = new Student();
		 s1.disp();
		 Student s2 = new Student();
		 s2.disp();
		 Student s3 = new Student();
		 s3.disp();
		 Student s4 = new Student();
		 s4.disp();
		 
	 }
	 
	void disp() {
		{
			System.out.println("student name:"+name);
			System.out.println("college name:"+college);
			System.out.println("Age:"+age);
		}
		
	}

}
