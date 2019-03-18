package com.bridgelabz.algorithms;

import com.bridgelabz.util.Algorithms;
import com.bridgelabz.util.FunctionalProgramming;

public class InsertionString {

	public static void main(String[] args) {
			//Input for string sorting
			long startTime = System.nanoTime();
			System.out.println("Enter the size");
			int n=Algorithms.getInt();
			String[] array=new String[n];
			System.out.println("Enter the string :");
			for(int i=0;i<n;i++)
			{
			 array[i]=Algorithms.getString();
			}
			System.out.println("Sorted array:");
			Algorithms.insertString(array);
		
			long endTime = System.nanoTime();
			long time=FunctionalProgramming.stopWatch(startTime, endTime);
			System.out.println("Execution time in nanoeconds:" + time +" ns");

		}



	}


