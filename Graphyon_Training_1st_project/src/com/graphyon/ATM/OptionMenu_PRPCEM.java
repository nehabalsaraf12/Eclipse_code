//do while is used for entry controller
package com.graphyon.ATM;
import java.util.*;

public class OptionMenu_PRPCEM extends Account_PRPCEM{	
	
	Scanner sc= new Scanner(System.in);
	HashMap<Integer,Integer> data=new HashMap<>();
	int i=10;
	void getLogin()
	{
		do
		{
			try {
				data.put(11111, 111);
				data.put(11112, 222);
				data.put(11113, 333);
				data.put(11114, 444);
				data.put(11115, 111);
				
				System.out.println("Welcome to the PRPCEM ATM.");
				System.out.println("\nEnter the Customer Number :");
				//boolean - 1 bit
				setCustomerNumber(sc.nextInt());
				System.out.println("Enter the PIN Number : ");
				setPINNumber(sc.nextInt());
				
				int P=getCustomerNumber();
				int Q=getPINNumber();
				if(data.containsKey(P) && data.get(P)==Q)
				{
					//login successfull
					getAccountType();
				}
				else
				{
					System.out.println("\nWrong CN or PN.\n");
					System.out.println("Enter the valid CN or PN.\n");
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("\nEnter only Numbers.");
				System.out.println("Characters and Symbols are not allowed.");
				sc.next();
				getLogin();
			}
		}while(i==10);
	}
	
	void getAccountType() {
		System.out.println("\nEnter the Account Type you want to : ");
		System.out.println("Type 1 : Current Account");
		System.out.println("Type 2 : Saving Account");
		System.out.println("Type 3 : Exit");
		System.out.println("Choose : ");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1: getCurrent();
			break;
		case 2:getSaving();
			break;
		case 3:System.out.println("\nThank you for VISITING");
		System.out.println("VSIT AGAIN\n");
			break;
		default:System.out.println("\nInvalid Choice.");
		System.out.println("Enter the Valid Choice.\n");
		getAccountType();//recursion
			break;
		}
	}
	
	void getCurrent()
	{
		System.out.println("\nCURRENT ACCOUNT");
		System.out.println("\nType 1 : Balance Enquiry");
		System.out.println("Type 2 : Withdraw Money");
		System.out.println("Type 3 : Deposit Money");
		System.out.println("Exit");
		System.out.println("\nChoice");
		
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:getCurrentBalance();
		getAccountType();
			break;
		case 2:getCurrentWithdrawInput();
		getAccountType();
			break;
		case 3:getCurrentDepositeInput();
		getAccountType();
			break;
		case 4:System.out.println("\nThank you for VISITING");
		System.out.println("VISIT AGAIN\n");
			break;
		default:System.out.println("\nInvalid Choice.");
		System.out.println("Enter the Valid Choice.\n");
		getCurrent();//recursion
			break;
		}
	}
	
	void getSaving()
	{
		System.out.println("\nSaving ACCOUNT");
		System.out.println("\nType 1 : Balance Enquiry");
		System.out.println("Type 2 : Withdraw Money");
		System.out.println("Type 3 : Deposit Money");
		System.out.println("Exit");
		System.out.println("\nChoice");
		
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:getSavingBalance();
		getAccountType();
			break;
		case 2:getSavingWithdrawInput();
		getAccountType();
			break;
		case 3:getSavingDepositeInput();
		getAccountType();
			break;
		case 4:System.out.println("\nThank you for VISITING");
		System.out.println("VISIT AGAIN\n");
			break;
		default:System.out.println("\nInvalid Choice.");
		System.out.println("Enter the Valid Choice.\n");
		getSaving();//recursion
			break;
		}	
	}
	
}
