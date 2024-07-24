package penta.oops.polymorphism;

class StudentDetails
{
	
	int sid;
	String name;
	int age;
	int marks;
	char grade;
	
void setDetails(int sid)
{
	this.sid = sid;
	System.out.println("The student sid is :"+sid);
}

void setDetails(int age, String name)
{
	this.age = age;
	this.name = name;
	System.out.println("The student age and name is:"+age + " and " + name);
}
void setDetails(int marks, char grade)
{
	this.marks = marks;
	this.grade = grade;
	System.out.println("The  student "+ name +" marks and grade is:"+marks+ " and " + grade);
}

void disp()
{
	System.out.println("Student Id "+sid);
	System.out.println("Student name "+name);
	System.out.println("Student age "+age);
	System.out.println("Student marks "+marks);
	System.out.println("Student grade "+grade);
}
}

public class Student {
	
	public static void main(String[] args) {
		
		StudentDetails sd = new StudentDetails();
		
		sd.setDetails(12);
		sd.setDetails(20, "Yashu");
		sd.setDetails(90, 'A');
		
		sd.disp();
		
		
		
	}

}
// you cam use void disp to disp all print statements.
