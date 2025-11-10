//method level synchronization
package com.graphyon.Threading;
class TableOf5 extends Thread
{ 
	Calc S;
	TableOf5(Calc b)
	{
		S=b;
	}
	public void run()
	{
		S.print(5);
	}
}

class TableOf7 extends Thread
{ 
	Calc F;
	TableOf7(Calc a)
	{
		F=a;
	}
	public void run()
	{
		F.print(7);
	}
}

class Calc 
{
	public synchronized void print(int n) 	//if we remove synchronized then the output will get mixed
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*n);
		}
	}
}

public class Table_204{

	public static void main(String[] args) {
		
		Calc c=new Calc();
		TableOf5 t1=new TableOf5(c);
		TableOf7 t2=new TableOf7(c);
		
		t1.start();
		t2.start();
	}

}


//ST - 60 sec data correct
//M.T. - 30 sec data wrong
//M.T. with synchronized - 30 sec data correct