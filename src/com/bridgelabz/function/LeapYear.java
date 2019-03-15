package com.bridgelabz.function;

import com.bridgelabz.util.FunctionalProgramming;

//import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			//Scanner s = new Scanner (System.in);
			System.out.print("Enter any year:");
			int year =FunctionalProgramming.getInt();
			if(year>999)
			{
		
			
			FunctionalProgramming.leap(year);
		}
			else
			{
				System.out.println("enter the four digit number");
			}
		}
	}
}