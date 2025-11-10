//recursion is limited to smaller number if we give bigger no. of 7-8 digit it will give stack overflow exception
package com.graphyon.recursion;

import java.util.Scanner;

public class Factorial {

	public static long factorial(int n)
	{
		if(n==0)
			return 1;
		else
			return n*factorial(n-1);
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		long result=factorial(n);
		System.out.println("Factorial is: "+result);
		sc.close();
	}

}
