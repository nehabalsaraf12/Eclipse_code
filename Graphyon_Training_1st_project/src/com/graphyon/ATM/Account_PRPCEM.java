package com.graphyon.ATM;
import java.text.*;
import java.util.*;
class Account_PRPCEM {
	DecimalFormat df1=new DecimalFormat("###,##0.00' Rupee'");//used for current account
	DecimalFormat df2=new DecimalFormat("###,##0.00' Dollar'");//used for saving account

	private int CN;
	private int pn;
	double CB=2000;
	double SB=1000;
	Scanner sc=new Scanner(System.in);
	void setCustomerNumber(int cn) //setter
	{
		CN=cn;
	}
	void setPINNumber(int pn) //setter
	{
		this.pn=pn;
	}
	
	int getCustomerNumber() //getter
	{
		return CN;
	}
	int getPINNumber() //getter
	{
		return pn;
	}
	void getCurrentBalance()
	{
		System.out.println("\nCurrent Account Balance : "+df1.format(CB));
	}
	
	void getSavingBalance()
	{
		System.out.println("\nSavings Account Balance : "+df2.format(SB));
	}
	
	//Current Account withdraw and deposit methods
	//withdraw mthd
	void getCurrentWithdrawInput()
	{
		System.out.println("Current Account Balance : "+df1.format(CB));
		System.out.println("\nEnter the Amount you want to withdraw : ");
		double amount=sc.nextDouble();
		if((CB-amount)>=0)//CB>=amount
		{
			calcCurrentWithdraw(amount);
			System.out.println("\nTransaction Successfull.");		
			System.out.println("Current Account Balance : "+df1.format(CB));

		}
		else {
			System.out.println("\nInsufficient balance.\n");
		}
	}
	double calcCurrentWithdraw(double amount)
	{
		CB=CB-amount;
		return CB;
	}
	
	//deposit mthd
	void getCurrentDepositeInput()
	{
		System.out.println("Current Account Balance : "+df1.format(CB));
		System.out.println("\nEnter the Amount you want to deposit : ");
		double amount=sc.nextDouble();
		if((CB+amount)>0)
		{
			calcCurrentDeposite(amount);
			System.out.println("\nTransaction Successfull.");		
			System.out.println("Current Account Balance : "+df1.format(CB));
		}
		else
		{
			System.out.println("\nInsufficient amount.\n");
		}
	}
	double calcCurrentDeposite(double amount)
	{
		CB=CB+amount;
		return CB;
	}
	
	
	//Saving Account withdraw and deposit methods
	//withdraw mthd
	void getSavingWithdrawInput()
	{
		System.out.println("Saving Account Balance : "+df2.format(SB));
		System.out.println("\nEnter the Amount you want to withdraw : ");
		double amount=sc.nextDouble();
		if((CB-amount)>=0)//CB>=amount
		{
			calcSavingWithdraw(amount);
			System.out.println("\nTransaction Successfull.");		
			System.out.println("Current Account Balance : "+df2.format(SB));

		}
		else {
			System.out.println("\nInsufficient balance.\n");
		}
	}
	
	double calcSavingWithdraw(double amount)
	{
		SB=SB-amount;
		return SB;
	}
	
	//deposit mthd
	void getSavingDepositeInput()
	{
		System.out.println("Saving Account Balance : "+df2.format(SB));
		System.out.println("\nEnter the Amount you want to deposit : ");
		double amount=sc.nextDouble();
		if((CB+amount)>0)//CB>=amount
		{
			calcSavingDeposite(amount);
			System.out.println("\nTransaction Successfull.");		
			System.out.println("Current Account Balance : "+df2.format(SB));

		}
		else {
			System.out.println("\nInsufficient balance.\n");
		}
	}
	
	double calcSavingDeposite(double amount)
	{
		SB=SB+amount;
		return SB;
	}
}
