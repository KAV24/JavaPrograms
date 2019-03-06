package com.function;

import com.bridgelabz.util.functionalprogramming;

public class Coupon {

	public static void main(String[] args) 

	/*
	 * The main function is written to take input from the user and calls
	 * couponNumber function that generates distinct coupon numbers
	 */
{
		System.out.println("enter the n distinct coupen");
		int n = functionalprogramming.intk();

		// Method 1- using non-static function of FunctionalUtilty class
		// of com.bridgelabz.util package
		int count = functionalprogramming.coupon(n);
		System.out.println(count);
	}

		// TODO Auto-generated method stub

	}


