package com.bridgelabz.algorithms;

import com.bridgelabz.util.Algorithms;

public class PrimeRange {

	public static void main(String[] args) {
		System.out.println("enter the starting range number:");
		int n= Algorithms.getInt();
		System.out.println("enter the ending range number:");
		int m= Algorithms.getInt();
		
		Algorithms.prime(n,m);
		
	}

}
