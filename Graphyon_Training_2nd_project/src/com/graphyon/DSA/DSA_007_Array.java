package com.graphyon.DSA;
import java.util.Scanner;

public class DSA_007_Array 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n=sc.nextInt();
		int[] A=new int[n];
		
		System.out.println("Enter elements of array: ");
		for(int i=0;i<A.length;i++)
		{
			System.out.print("Enter the "+ (i+1) +" element: ");
			A[i]=sc.nextInt();
		}
		System.out.println("Enter the total queries: ");
		int q=sc.nextInt();
		int totalSum=0;
		
		for(int k=1;k<=q;k++)
		{
			System.out.println("\nEnter the type of "+k+" query: ");
			int type=sc.nextInt();
			
			System.out.println("Enter the starting index of the SubArray: ");
			int L=sc.nextInt();
			
			System.out.println("Enter the ending index of the SubArray: ");
			int R=sc.nextInt();
			
			if(type==1)
			{
				//update the array from L to R
				//formula is [(i-L+1)*A([L])]
				int base=A[L];
				for(int i=L;i<=R;i++)
				{
				A[i]=(((i-L+1))*base);
				}
			}
			else if(type==2)
			{
				int sum=0;
				for(int i=L;i<=R;i++)
				{
					sum=sum+A[i];
				}
				totalSum=totalSum+sum;
			}
			
		}
		System.out.println("TotalSum of all type 2 queries: "+totalSum);
		sc.close();
	}
}
