package com.graphyon.Threading;
//step 1: import the lang package.
//step 2: A) extend the thread class
//  		B) implements the runnable interface(Best Approach).
//step 3:open the run() method.
//step 4: give the public access to the run() method
//step 5: implement the run() method
//step 6: create the no. of threads
//step 7: call the start() method(Start the threads)
class for_201 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=3;i++)
			{
				System.out.println("Bye");
				Thread.sleep(2000);
			}
		
		}
		catch(Exception ex)
		{
			
		}
	}
}
public class Mlthreading_201 {

	public static void main(String[] args) {
		for_201 nb= new for_201();
		nb.start();
		try
		{
			for(int i=1;i<=3;i++)
			{
				System.out.println("Hello");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			
		}
	}

}
