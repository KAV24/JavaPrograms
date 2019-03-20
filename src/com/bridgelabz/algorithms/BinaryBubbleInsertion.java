package com.bridgelabz.algorithms;

import com.bridgelabz.util.Algorithms;

public class BinaryBubbleInsertion {

	public static void main(String[] args) {
		System.out.println("press 1 for Binary Search"+"\n Press 2 for Bubble sort"+"\n press 3 for Insertion Sort");
       int n=Algorithms.getInt();
       switch(n) 
       {
       case(1):BinarySearch.main(args);
               break;
       
       case(2):SortBubble.main(args);
               break;
       case(3):SortInsertion.main(args);
               break;
	    }
}
}
