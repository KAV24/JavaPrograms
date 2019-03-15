package com.bridgelabz.algorithms;

import com.bridgelabz.util.Algorithms;

public class MergeSort {
	
	    public static void main(String[] args) {

	    	System.out.println("Enter the no. of Strings: ");
	    	int s=Algorithms.getInt();
	    	String[] arr=new String[s];
	    	
	    		for(int i=0;i<s;i++)
	    		{
	    			arr[i]=Algorithms.getString();
	    	   }
                 Algorithms.mergeSort(arr);

	   
        for (String n : arr) {
	            System.out.println(n);
	        }
	    }

	  
	}