package com.bridgelabz.algorithms;

public class DayofWeek {
	public static void main(String[] args)
	{
		System.out.println("enter date in day month year" );
				int d=Integer.parseInt(args[0]);
				int m=Integer.parseInt(args[1]);
				int y=Integer.parseInt(args[2]);
				System.out.println("dat is" + dayOfWeek(d, m, y));
	}
	static int dayOfWeek(int d, int m, int y)
	{
		int y0 = y - (14-m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14-m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		return d0;
}   

}