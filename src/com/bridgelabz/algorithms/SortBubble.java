package com.bridgelabz.algorithms;

import com.bridgelabz.util.Algorithms;
import com.bridgelabz.util.FunctionalProgramming;


public class SortBubble <T> {
	public static <T extends Comparable<T>> T[] bubble(T[] array){
		for (int j = 0; j < array.length; j++) {
	         for (int i = j + 1; i < array.length; i++) {
	            // comparing strings
	            if (array[i].compareTo(array[j]) < 0) {
	         
	               T temp = array[j];
	               array[j] = array[i];
	               array[i] = temp;
	            }
           
	}
		} for(int k=0;k<array.length;k++) {
        	System.out.println(array[k]);
        }
		return array;
		

	}
	public static  void main(String[] args) {
		System.out.println("enter the number of elements");
		int N= Algorithms.getInt();
		String[] array=new String[N];
		System.out.println("enter next element");
		for(int i=0; i<N; i++) {
			array[i]= Algorithms.getString();
		}

		long startTime = System.nanoTime();
		
		bubble(array); 
		
		long endTime = System.nanoTime();
		double result= FunctionalProgramming.stopWatch(startTime, endTime);
		System.out.println("elapsed time :"+result);

		}
	}


