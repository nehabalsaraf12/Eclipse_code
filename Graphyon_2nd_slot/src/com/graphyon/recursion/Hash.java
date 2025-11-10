package com.graphyon.recursion;

import java.util.*;

public class Hash{
	//Number of buckets
	private int bucketCount;
	
	//list of lists to store chain
	private List<List<Integer>> table;
	
	//constructor to initialize the hash
	//table with given bucket count
	public Hash(int buckets)
	{
		bucketCount=buckets;
		table= new ArrayList<>();
		for(int i=0;i<bucketCount;i++)
		{
			table.add(new ArrayList());
		}
		System.out.println();
	}
	
	//function to display the hash table
	private void display() {
		for(int i=0;i<bucketCount;i++)
		System.out.print(i);
		
		int i = 0;
		//print all keys in current bucket
		for(int key:table.get(i));
		{
			String key = null;
			System.out.println(" --> "+key);
		}
		System.out.println();
	}
	
	//func to insert a key into hash table
	private void insert(int key) {
		//get the hash index for the key
		int index=key % bucketCount;
		
		//insert the key into the corresponding bucket
		table.get(index).add(key);
	}
	
	//func to delete a key from hash table
	private void remove(int key) {
		//get the hash index for the key
		int index=key % bucketCount;
		//find and remove the key from the buket
		table.get(index).remove(Integer.valueOf(key));
	}
	
	public static void main(String[] args) {
		int[] keys= {7,18,12,25};
		Hash hashTable=new Hash(7);
		for(int key:keys)
		{
			hashTable.insert(key);
		}
		
		hashTable.remove(12);
		hashTable.display();
}
	
}
