package com.bridgelabz.algorithms;

import com.bridgelabz.util.Algorithms;
import com.bridgelabz.util.FunctionalProgramming;


public class SortBubble <T> {
	

	public static<T>  void main(String[] args) {
		System.out.println("enter the number of elements");
		int N= Algorithms.getInt();
		String[] array=new String[N];
		System.out.println("enter next element");
		for(int i=0; i<N; i++) {
			array[i]= Algorithms.getString();
		}

		long startTime = System.nanoTime();
		
		Algorithms.bubble(array);
		
		long endTime = System.nanoTime();
		double result= FunctionalProgramming.stopWatch(startTime, endTime);
		System.out.println("elapsed time :"+result);

		}
	}


