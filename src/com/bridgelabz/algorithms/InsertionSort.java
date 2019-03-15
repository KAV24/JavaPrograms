package com.bridgelabz.algorithms;
import com.bridgelabz.util.Algorithms;
import com.bridgelabz.util.FunctionalProgramming;

public class InsertionSort {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		System.out.println("Enter array size:");
		int n=Algorithms.getInt();
		int[] array=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			array[i]=Algorithms.getInt();
		}
		System.out.println("Sorted array:");
		Algorithms.insertionint(array);
		long endTime = System.nanoTime();
		long time=FunctionalProgramming.stopWatch(startTime, endTime); 
		System.out.println("Execution time in nanoseconds:" + time +" ns");	

	}

}

	
