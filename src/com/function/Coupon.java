package com.function;

import com.bridgelabz.util.FunctionalProgramming;

public class Coupon {

	/*
	 * The main function is written to take input from the user and calls
	 * couponNumber function that generates distinct coupon numbers
	 */
	public static void main(String[] args)

	{
		System.out.println("enter the n distinct coupen");
		int n = FunctionalProgramming.intk();
		int count = FunctionalProgramming.coupon(n);
		System.out.println(count);
	}

}
