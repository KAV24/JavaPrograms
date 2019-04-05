package com.bridgelabz.algorithms;

import com.bridgelabz.util.Algorithms;

public class DayofWeek {
	public static void main(String[] args)
	{
		System.out.println("enter date in day month year" );
				int d=Integer.parseInt(args[0]);
				int m=Integer.parseInt(args[1]);
				int y=Integer.parseInt(args[2]);
				Algorithms.dayOfWeek(d, m, y);
				System.out.println("day is " + Algorithms.dayOfWeek(d, m, y));
	}
	

}