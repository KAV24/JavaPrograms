package com.bridgelabz.function;
import com.bridgelabz.util.FunctionalProgramming;

public class Sum {

	public static void main(String[] args) {
		System.out.println("enter the value");
		int n=FunctionalProgramming.intk();
		int array[] =new int[n];
		//creating array of size n
		for(int i=0; i<n; i++)
			//to enter the elements of array
		{
			System.out.println("values");
			array[i]=FunctionalProgramming.intk();
		}
		FunctionalProgramming.findTriples(n, array);
		}
		

	}


