//this is the static synchronization
package com.graphyon.Threading;

class Bank extends Thread
{
	static int balance=2000;
	static int withdraw;
	
	Bank(int a)
	{
		withdraw=a;
	}
	public void run()
	{
		neha();
	}
	static synchronized void neha()//is syn is not given then all the threads can withdraw it.
	{
		String name=Thread.currentThread().getName();
		if(balance>=withdraw)
		{
			System.out.println(name+" Amount is withdrawn.");
			balance=balance-withdraw;
		}
		else
		{
			System.out.println(name+" Sorry");
		}
	}
}
public class BankPayment_206 {

	public static void main(String[] args) {
		//if giving diff object name it gives wrong data hence java should not be 100% object oriented
		//in this case use static block
		Bank nb1= new Bank(1000);
		Thread t1=new Thread(nb1);
		Thread t2=new Thread(nb1);
		
		Bank nb2= new Bank(1000);
		Thread t3=new Thread(nb2);
		Thread t4=new Thread(nb2);
		
		t1.setName("Neha");
		t2.setName("Sanjana");
		t3.setName("Aayushi");
		t4.setName("Gayatri");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}

