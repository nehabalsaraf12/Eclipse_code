package com.graphyon.Threading;

import java.util.Scanner;

class BookTicket_201
{
	Scanner sc= new Scanner(System.in);
	int available_seat=10;
	
	void bookticket()
	{
		while(true) 
		{
		System.out.println("Please Enter your Name:");
		String name=sc.nextLine();
		System.out.println("Please enter how many tickets you want to book:");
		int seat=sc.nextInt();
		
		sc.nextLine();
		if(available_seat>=seat)
		{
			System.out.println(name+" your ticket has been booked successfully.");
			available_seat-=seat;
			System.out.println("Remaining tickets:"+available_seat);
			System.out.println("Thannk you for booking..\nVisit Again");
			if(available_seat==0)
			{
				break;
			}
		}
		else
		{
			System.out.println(seat+" Oops! Tickets are not balance");
		}
	}
	}
}
public class BusTicket_202 {

	public static void main(String[] args) {
		BookTicket_201 bt= new BookTicket_201();
		while(true) {
		bt.bookticket();
		}

	}

}
