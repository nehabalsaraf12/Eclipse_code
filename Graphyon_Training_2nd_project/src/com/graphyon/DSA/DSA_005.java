package com.graphyon.DSA;
import java.util.Scanner;

public class DSA_005 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
		int n=sc.nextInt();
		System.out.println("enter array elements:");
		int[] arr=new int[n];
		int count=1,j;
		
		for(int i=0;i<arr.length;i++)
		{
		    arr[i] = sc.nextInt();
		   
		}
	
	    int maxSoFar = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > maxSoFar) {
                count++;
                maxSoFar = arr[i]; // Update the max
            }
        }

	    System.out.println(count);

	}

}
