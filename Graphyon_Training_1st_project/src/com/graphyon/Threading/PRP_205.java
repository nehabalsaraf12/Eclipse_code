package com.graphyon.Threading;

class PrintBook
{
	int available=10;
	void block(int seat)
	{
		System.out.println("Hello : "+Thread.currentThread().getName());
		System.out.println("Hello : "+Thread.currentThread().getName());
		System.out.println("Hello : "+Thread.currentThread().getName());
		
		synchronized(this)
		{
			String name=Thread.currentThread().getName();
			if(available>=seat)
			{
				System.out.println("---------"+name+" seats are booked");
				available=available-seat;
				System.out.println("-----balance seats : "+available);
			}
			else
			{
				System.out.println("-----"+name+" sry");
				System.out.println("-----balance seats : "+available);
			}
		}
		
		System.out.println("Bye : "+Thread.currentThread().getName());
		System.out.println("Bye : "+Thread.currentThread().getName());
		System.out.println("Bye : "+Thread.currentThread().getName());
	}
}
public class PRP_205 extends Thread{

	static PrintBook op;
	static int seat;
	
	public void run()
	{
		op.block(seat);
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		op=new PrintBook();
		PRP_205 t1=new PRP_205();
		PRP_205 t2=new PRP_205();
		
		t1.setName("Neha");
		t2.setName("Aayushi");
		
		t1.seat=7;
		t2.seat=6;
		
		t1.start();
		t2.start();
	}

}
