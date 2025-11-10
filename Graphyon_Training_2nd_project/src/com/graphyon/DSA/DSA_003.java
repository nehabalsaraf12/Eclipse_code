package com.graphyon.DSA;

import java.util.Stack;

public class DSA_003 
{
	static void sort(Stack<Integer> stack) 
	{
		//creating temporary stack
		Stack<Integer> tempstack=new Stack();
		
		//loop run until the original stack becomes empty.
		while(!stack.isEmpty()) 
		{
			//pop the top element from original stack and store the it in the variable temp.
			int temp=stack.pop();
			
			//while tempstack is not empty and the top element of the tempstack is greater than temp variable
			//then move the elements back to the original stack.
			
			while(!tempstack.isEmpty() && tempstack.peek()>temp) 
			{
				//this makes room for the temp to be inserted in its correct sorted position in the tempstack.
				stack.push(tempstack.pop());
			}
			//push temp variable into tempstack at the right sorted position.
			tempstack.push(temp);
		}
		//copyback after the sorting is done in tempstack,then transfer all the elements back to the 
		//original stack to maintain the correct stack structure with the smallest elements at the top.
		while(!tempstack.isEmpty())
		{
			stack.push(tempstack.pop());
		}
		
	}
	public static void main(String[] args)
	{
		Stack<Integer> stack=new Stack();
		stack.push(24);
		stack.push(3);
		stack.push(31);
		stack.push(100);
		stack.push(98);
		stack.push(92);
		stack.push(23);
		System.out.println("Before sorted: "+stack);
		sort(stack);
		System.out.println("After sorted: "+stack);		
	}
}

