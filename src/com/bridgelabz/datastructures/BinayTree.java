package com.bridgelabz.datastructures;

import com.bridgelabz.util.Algorithms;

import com.bridgelabz.util.DataStructuresProgram;


public class BinayTree {
	/*
	* The main function is written to take input from the user
	* and to find how many binary search trees can be formed
	* from the entered number of nodes
	*/
	  public static void main(String[] args) { 
	        System.out.println("Enter the number of nodes");
	        int nodes=Algorithms.getInt();
	        int[] intArr=new int[nodes];
	        for(int i=0;i<intArr.length;i++)
	        {
	        	System.out.println("Enter the "+i+" th number:");
	        	intArr[i]=Algorithms.getInt();	        }
	        double [] numbertimes=new double[intArr.length];
	        for(int i=0;i<intArr.length;i++)
	        {
	        	
  	        numbertimes[i] = DataStructuresProgram.binaryCount(intArr[i]);
	        }
	         for(int i=0;i<numbertimes.length;i++)
	         {
	        	System.out.println("Count of BST possibilities for "+  intArr[i] +" nodes is "+numbertimes[i]);
	         }
	}
}