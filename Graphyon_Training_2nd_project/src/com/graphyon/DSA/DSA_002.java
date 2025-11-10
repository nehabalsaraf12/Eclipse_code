package com.graphyon.DSA;
import java.util.*;

public class DSA_002 
{
	public static void main(String[] args) 
	{
		Stack<Integer> s=new Stack();
		System.out.println("Is stack empty: "+s.isEmpty());
		
		s.push(10);
		s.push(20);
		s.push(50);
		s.push(80);
		s.push(60);
		System.out.println("Stack: "+s);
		System.out.println("First number: "+s.peek());
		System.out.println("Deleted number: "+s.pop());
		System.out.println("Stack: "+s);
		System.out.println("Is stack empty: "+s.isEmpty());

	}

}
