//it is normal threading/single threading
package com.graphyon.Threading;

class BookTicket extends Thread
{
	int available=5;
	int passenger;
	
	BookTicket(int a)
	{
		passenger=a;
	}
	public synchronized void run()
	{
		String name=Thread.currentThread().getName();
		if(available>=passenger)
		{
			System.out.println(name+" Seats are booked");
			available-=passenger;
		}
		else
		{
			System.out.println(name+" Sorry");
		}
	}
}
public class BusTicketMultithreading_203 {

	public static void main(String[] args) {
		BookTicket nb= new BookTicket(2);
		
		Thread t1=new Thread(nb);
		Thread t2=new Thread(nb);
		Thread t3=new Thread(nb);
		
		t1.setName("neha");
		t2.setName("sanjana");
		t3.setName("aayushi");
		t1.start();
		t2.start();
		t3.start();
	}

}


//start					mid		end
//|--------------------------|-----|
//		15 sec				5 sec
//		
//single threading: 20*3=60		----> correct
//multi threading: 20		----> wrong
//multi threading with synchronized : 15+()5*3=30 sec ----> Correct : it is a combination on single and multi

