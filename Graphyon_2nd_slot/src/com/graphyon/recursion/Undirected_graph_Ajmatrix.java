package com.graphyon.recursion;

public class Undirected_graph_Ajmatrix {

	public static void addEdge(int[][] mat,int i,int j)
	{
		mat[i][j]=1;
		mat[j][i]=1;
	}
	 	public static void displayMatrix(int[][] mat)
	{
		for(int[] row:mat)
		{
			for(int val:row)
				System.out.println(val + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int V=4;
		int[][] mat=new int[V][V];
		addEdge(mat,0,1);
		addEdge(mat,0,2);
		addEdge(mat,1,2);
		addEdge(mat,2,1);
		
		/*Alternatively we can also create using below code if we know all edges in advance
		 * int[][] mat={0,1,0,0};
		 * 				{1,0,1,0};
		 * 				{0,1,0,1};
		 * 				{0,0,1,0};
		 */
		System.out.println("Adjacency matrix representation");
		displayMatrix(mat);
	}

}
