package com.bridgelabz.algorithms;

import java.security.AlgorithmConstraints;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.util.Algorithms;
import com.bridgelabz.util.FunctionalProgramming;

public class BinarySearch <T>{

	public static void main(String[] args)
	{
		String[] stry={"D","SS"};
		System.out.println("Give an input value");
		Scanner scanner= new Scanner(System.in);
		int input= FunctionalProgramming.getInt();
		int totalElement=0;
		String [] userString=new String[totalElement];
		Integer[] a=new Integer[10];
		if(input==1)
			System.out.println("Perform binary search operation for integers");
		if(input==2)
			System.out.println("Perform binary search operation for String");

		switch (input) {
		case 1:
			int i;
			
			System.out.println("Enter number of elements");
			totalElement =FunctionalProgramming.getInt();
			Integer[] array=new Integer[totalElement];
			System.out.println("Enter " + totalElement + " integers");
			for(i=0;i<totalElement;i++)
			{
				array[i]=FunctionalProgramming.getInt();
			}
			System.out.println("Enter the key");
			int key=FunctionalProgramming.getInt();
			Algorithms.maximum(array, key);
			break;
		case 2:

			for(int j=0;j<totalElement;j++) {
				System.out.println("Enter the String :");
				userString[j]=scanner.nextLine();
			}
			System.out.println("Enter the key");
			String key1=scanner.nextLine();
			Integer keyy=Integer.parseInt(key1);
			int m=0;
			for(String s:stry){
			 a[m++] =Integer.parseInt(s);
			}
					Algorithms.maximum(a, keyy);
			System.out.println(userString);
			break;
		default:
			break;
		}
		//        long endTime = System.nanoTime();
		//		long elapsed_time = Functional_util.stopWatch(startTime, endTime);
		//		System.out.println("The time taken to perform binary search operation is "+ elapsed_time+"ns");
	}
}
