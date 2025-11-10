package com.graphyon.recursion;

import java.util.ArrayList;
import java.util.List;
public class InsertElement {
	private int bucketCount=4;
	private List<List<Integer>> table;
	private int size=0;
	
	public InsertElement(int buckets)
	{
		bucketCount=buckets;
		table= new ArrayList<>();
		for(int i=0;i<bucketCount;i++)
		{
			table.add(new ArrayList<>());
		}
	}
	
	private void rehash() {
	    int newBucketCount = bucketCount * 2;
	    List<List<Integer>> newTable = new ArrayList<>();

	    for (int i = 0; i < newBucketCount; i++) {
	        newTable.add(new ArrayList<>());
	    }

	    // Reinsert all keys into new table
	    for (List<Integer> bucket : table) {
	        for (int key : bucket) {
	            int newIndex = key % newBucketCount;
	            newTable.get(newIndex).add(key);
	        }
	    }

	    // Update references
	    bucketCount = newBucketCount;
	    table = newTable;

	    System.out.println("Rehashing done. New bucket count: " + bucketCount);
	}
	
	private void insert(int key)
	{
		int index= key % bucketCount;
		table.get(index).add(key);
		size++;
		float loadFactor = (float) size / bucketCount;
	    if (loadFactor > 0.75) {
	        rehash();
	    }

	}
	public void display() {
	    for (int i = 0; i < bucketCount; i++) {
	        System.out.print("Bucket " + i + ": ");
	        for (int val : table.get(i)) {
	            System.out.print(val + " ");
	        }
	        System.out.println();
	    }
	}	
	public static void main(String[] args) {
		
		int[] keys= {4,5,6,7};
		InsertElement hashTable=new InsertElement(4);
		for(int key:keys)
		{
			System.out.println(key);
			hashTable.insert(key);
		}
		hashTable.display();
	}

}
