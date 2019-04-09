package com.bridgelabz.algorithms;

import java.util.List;

import com.bridgelabz.util.Algorithms;


public class PrimeRange {

	public static void main(String[] args) {
		System.out.println("enter the starting range number:");
		int n= Algorithms.getInt();
		System.out.println("enter the ending range number:");
		int m= Algorithms.getInt();
		@SuppressWarnings("unused")
		List<Integer> list = new java.util.ArrayList<Integer>();
		list=Algorithms.isPrime(n, m);
		
	}

}
