package com.graphyon.Servlet;
import java.util.*;

class Channel_PRP
{
	List<CustomerSubscriber_PRP> subs=new ArrayList();
	String title;
	void subscribe(CustomerSubscriber_PRP sub)
	{
		subs.add(sub);
	}
	
	void unSubscribe(CustomerSubscriber_PRP sub)
	{
		subs.remove(sub);
	}
	void upload(String title)
	{
		this.title=title;
		notifySubscriber();
	}
	
	void notifySubscriber()
	{
		for(CustomerSubscriber_PRP sub : subs)
		{
			sub.update();
		}
	}
}

class CustomerSubscriber_PRP
{
	String name;
	Channel_PRP WorldAffairs=new Channel_PRP();
	CustomerSubscriber_PRP(String name)
	{
		this.name=name;
	}
	
	void subscribeChannel(Channel_PRP ch)
	{
		WorldAffairs=ch;
	}
	
	void update()
	{
		System.out.println("Hello "+name+" Video uploaded: "+WorldAffairs.title);
	}
}
public class Servlet_001 
{
	public static void main(String[] args) 
	{
		Channel_PRP op=new Channel_PRP();
		
		CustomerSubscriber_PRP s1=new CustomerSubscriber_PRP("Onkar");
		CustomerSubscriber_PRP s2=new CustomerSubscriber_PRP("Shubham");
		CustomerSubscriber_PRP s3=new CustomerSubscriber_PRP("Neha");
		CustomerSubscriber_PRP s4=new CustomerSubscriber_PRP("Ayushi");
		CustomerSubscriber_PRP s5=new CustomerSubscriber_PRP("Sanjana");
		
		op.subscribe(s1);
		op.subscribe(s2);
		op.subscribe(s3);
		op.subscribe(s4);
		op.subscribe(s5);
		
		op.unSubscribe(s4);
		s1.subscribeChannel(op);
		s2.subscribeChannel(op);
		s3.subscribeChannel(op);
		s4.subscribeChannel(op);
		s5.subscribeChannel(op);

		op.upload("India - USA Trade War");
	}

}
