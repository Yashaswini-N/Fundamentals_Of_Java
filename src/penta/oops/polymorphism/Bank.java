package penta.oops.polymorphism;

class BankDetails{
	
	void rateofInterest()
	{
		System.out.println("Displaying the rate of interest of the Banks");
	}
}
class Sbi extends BankDetails {
	void rateofInterest()
	{
	
	System.out.println("The rate of interest of Sbi bank is 5% ");
}
}
class Axis extends BankDetails {
	void rateofInterest()
	{
		System.out.println("The rate of interest of Axis bank is 10%");
	}
}
class ICICI extends BankDetails {
	void rateofInterest()
	{
		System.out.println("The rate of interest of Icici bank is 12%");
	}
	
}

public class Bank {
	
	public static void main(String[] args) {
		
		BankDetails bd = new BankDetails();
	    bd.rateofInterest();
		Sbi s = new Sbi();
		s.rateofInterest();
		Axis a = new Axis();
		a.rateofInterest();
		ICICI i = new ICICI();
		i.rateofInterest();
		
		
	}

}
