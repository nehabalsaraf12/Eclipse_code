//que no.33
package com.graphyon.DSA;

import java.util.Scanner;
public class DSA_004 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. days:");
		int n=sc.nextInt();
		System.out.println("Enter day no. from 1 to 7(1==Monday,...)");
		int day_no=sc.nextInt();
		int count=0;
		
		int weekday = day_no;

	        for (int i = 1; i <= n; i++) {
	            if (weekday == 7) {
	                count++;
	            }

	            // Move to next weekday
	            weekday++;
	            if (weekday > 7) {
	                weekday = 1;
	            }
	        }
	     System.out.println("No. of Sundays: "+count);
	}

}
