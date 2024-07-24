package penta.java.assignments;

import java.util.Scanner;

public class Bankingop {

	public static void main(String[] args) {
		
		int balance = 1000;
		Scanner sc = new Scanner(System.in);
				int depamount,withdrawalamount;
	   while(true)
	   {
		System.out.println("Choose Options");
		System.out.println("1.Deposit\n" + "2.Withdraw\n "+ "3.Balance Checking");
		
		int option = sc.nextInt();
		
		switch(option)
		{
		case 1: System.out.println("Enter the amount to deposit");
		        depamount = sc.nextInt();
		        balance = balance + depamount;
		        System.out.println("Balance after deposit:" +balance);
		        break;
		        
		case 2: System.out.println("Enter the amount to withdrawal");
		        withdrawalamount = sc.nextInt();
		        balance = balance - withdrawalamount;
		        System.out.println("Balance after withdrawal:"+balance);
		        break;
		        
		case 3 : System.out.println("Balance is :" +balance);
		         break;
		         
		case 4: System.out.println("Thank you for banking");
		        return;
		         
		}      
		         
		         
		}
	}
		      }
