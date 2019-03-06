package com.function;

import com.bridgelabz.util.functionalprogramming;

//import java.util.Scanner;

public class leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			//Scanner s = new Scanner (System.in);
			System.out.print("Enter any year:");
			int year =functionalprogramming.intk();
			if(year>999)
			{
		
			
			functionalprogramming.leap(year);
		}
			else
			{
				System.out.println("enter the four digit number");
			}
		}
	}
}