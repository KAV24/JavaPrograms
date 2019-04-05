package com.bridgelabz.datastructures;


import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.DataStructuresProgram;

public class PrimeNum2D {
	/*
	* The main function is to print the 2 dimension representation
	* of the prime numbers from 0-1000
	*/
	public static void main(String[] args) {
		List<List<Integer>> outterlist = new ArrayList<List<Integer>>();
		List<Integer> innerlist= new ArrayList<Integer>();
		System.out.println("prime number of the range 0 to 1000");
		int m=2;
		int n=100;
		
		for(int i=1;i<=10;i++)
		{
		innerlist= DataStructuresProgram.primeNum2D(m,n);
		outterlist.add(innerlist);
		System.out.print("prime no between "+ m +" and "+  n);
		System.out.println(innerlist);
		m+=100;
		n+=100;
		}
}
}