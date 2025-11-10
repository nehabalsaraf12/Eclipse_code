package com.graphyon.DSA;
//this is the approach for the prime numbers
//1st approach
//public class DSA_001 
//{
//	public static void main(String[] args) 
//	{
//		siv of era thothones
//		int n=40;
//		for(int i=2;i<=n;i++)
//		{
//			System.out.println(i+" "+isPrime(i));
//		}
//	}
//		static boolean isPrime(int num)
//		{
//			int c=2;
//			while(c<num)
//			{	
//				if(num%c==0)
//				{
//					return false;
//				}
//				c++;
//			}
//		return true;
//		
//		}	
//}

//2nd approach
/*
 * public class DSA_001 
{
	public static void main(String[] args) 
	{
		int n=40;
		for(int i=2;i<=n;i++)
		{
			System.out.println(i+" "+isPrime(i));
		}
	}
		static boolean isPrime(int num)
		{
			int c=2;
			while(c*c<=num)
			{	
				if(num%c==0)
				{
					return false;
				}
				c++;
			}
		return true;
		}	
}
 */



//3rd approach
public class DSA_001 
{
	public static void main(String[] args) 
	{
		int n=40;
		boolean[] arr=new boolean[n+1];
		sieve(arr,n);
	}
		static void sieve(boolean[] arr,int num)
		{
			for(int i=2;i*i<=num;i++)
			{
				if(!arr[i])
				{
					for(int j=i*2;j<=num;j=j+i)
					{
						arr[j]=true;
					}
				}
			}
			for(int i=2;i<=num;i++)
			{
				if(!arr[i])
				{
					System.out.println(i+" ");
				}
			}
				
		}
	
}