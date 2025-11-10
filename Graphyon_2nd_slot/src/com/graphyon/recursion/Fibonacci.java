package com.graphyon.recursion;

import java.util.Scanner;

public class Fibonacci {

	public static int fibonacci(int n)
	{
		if(n==0) return 0;
		else if(n==1) return 1;
		else return fibonacci(n-1)+fibonacci(n-2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int result=fibonacci(n);
		System.out.println("Result is: "+result);
		sc.close();
	}

}
