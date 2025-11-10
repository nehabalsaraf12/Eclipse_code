package com.graphyon.DSA;
public class DSA_006 
{
	//code to print the arrya
	static void print(int[][] matrix) 
    {
        for(int[] row : matrix) 
        {
            for(int value : row) 
            {
                System.out.print(value +" ");
            }
            System.out.println();
        }
    }
	//step 1: rotate the array
    static void rotate(int[][] matrix) 
    {
        int n=matrix.length;
        // Step 1: Transpose the matrix i.e row becomes column
        for(int i=0; i<n; i++)
        {
            for(int j=i; j<n; j++) 
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    //step 2: swap the array
    static void swap(int[][] matrix) 
    {
        int n=matrix.length;
        // Step 1: Transpose the matrix i.e row becomes column
        for(int i=0; i<n; i++)
        {
        	int start=0;
        	int end=n-1;
            while(start<end)
            {
            	int temp=matrix[i][start];
            	matrix[i][start]=matrix[i][end];
            	matrix[i][end]=temp;
            	start++;
            	end--;
            }
        }
    }
    
    public static void main(String[]args) 
    {
        int [][] matrix= {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Before Rotation");
        print(matrix);
        System.out.println("\nAfter Rotation : Step 1");
        rotate(matrix);
        print(matrix);
        
        System.out.println("\nAfter Swap : Step 2");
        swap(matrix);
        print(matrix);
       
    }
}