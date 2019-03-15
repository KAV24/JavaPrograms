package com.bridgelabz.algorithms;

import com.bridgelabz.util.Algorithms;
import com.bridgelabz.util.FunctionalProgramming;

public class InsertionString {

	public static void main(String[] args) {
			//Input for string sorting
			long startTime = System.nanoTime();
			System.out.println("Enter the string :");
			String str=Algorithms.getString();
			System.out.println("Sorted array:");
			Algorithms.insertString(str);
		
			long endTime = System.nanoTime();
			long time=FunctionalProgramming.stopWatch(startTime, endTime);
			System.out.println("Execution time in nanoeconds:" + time +" ns");

		}



	}


