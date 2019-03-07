package com.bridgelabz.util;

import java.util.Scanner;

public class FunctionalProgramming {
	private static Scanner scan = new Scanner(System.in);

	public static int intk() {
		return scan.nextInt();
	}

	public static String strk() {
		return scan.next();
	}
	public static long lonk(){
		return scan.nextLong();
	}

	// Power of 2
	/**
	 * 
	 * @param n
	 */
	public static void power(int n) {
		int i = 0;
		int power = 1;
		if (n > 31)
			System.out.println("Power of 2 that are less than 2^" + n);
		while (i <= n) {
			System.out.println("2^" + i + " = " + power);
			power = power * 2;
			i++;

		}
	}

	

	/**PrimeFactors
	 * @param n
	 */
	public static void primeFactor(int n) {
		for (int i = 2; i > 1; i++) {
			while (n % i == 0) {
				System.out.println(i + "");
				n = n / i;
			}
		}
	}

	

	/**Coin
	 * @param flips
	 */
	public static void coin(int flips) {
		int count = 1;
		double rs;
		int heads = 0;
		int tails = 0;
		while (count <= flips) {
			rs = Math.random();
			System.out.println(rs);
			if (rs <= 0.5) {
				heads++;

			} else {
				tails++;
			}
			count++;
		}
		System.out.println(tails);
		System.out.println(heads);
		System.out.println(flips);
		int headpercent = heads * 100 / flips;
		System.out.println("head percentage=" + headpercent);
		int tailpercent = tails * 100 / flips;
		System.out.println("tail percentage=" + tailpercent);
	}

	
	/**Harmonic
	 * @param n
	 */
	public static void harmonic(int n) {
		float h = 1;
		for (int i = 2; i <= n; i++) {
			h += (float) 1 / i;

		}
		System.out.println(h);

	}

	/* replace */
	public static void replace(String s, String pn) {
		String msg = "hello," + s + ",how are you";

		if (s.length() >= 3) {

			System.out.println(msg);
		} else {
			System.out.println("invalid");
		}
		String nm = msg.replace(s, pn);
		System.out.println(msg);
	}

	
	
	
	/**LeapYear;
	 * @param year
	 * @return
	 */
	public static int leap(int year) {
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println(" leap year");
		} else {

			System.out.println("not leap year");
		}

		return year;
	}

	/* coupon */
	
	public static int coupon(int n) {
		boolean[] isCollected = new boolean[n];

		int count = 0;
		int distinct = 0;
		while (distinct < n) {
			int value = (int) (Math.random() * n);
			count++;
			if (!isCollected[value]) {
				distinct++;
				System.out.println(distinct);
				isCollected[value] = true;
			}
		}
		return count;
	}

	/* gambler */
	public static void gambler(int stake, int goal, int t) {
		int wins = 0;
		int loss = 0;
		for (int j = 0; j < t; j++) {
			int cash = stake;
			while (cash > 0 && cash < goal) {
				double r=Math.random();
				if (r < 0.5)
					cash++;
		
				else
					cash--;
			}
			if (cash == goal)
				wins++;
			else
				loss++;
		}
		System.out.println(wins + " wins of " + t);
		System.out.println("Percent of games won= " + 100.0 * wins / t);
		System.out.println("Percent of loss = " + 100.0 * loss / t);
	}

	

	/** QuadraticEquation 
	 * @param x
	 * @param y
	 * @param z
	 */
	public static void findRoot(int x, int y, int z) {
		int delta = (y * y) - (4 * x * z);
		if (delta > 0) {
			double root1 = (-y + Math.sqrt(delta)) / (2 * x);
			double root2 = (-y - Math.sqrt(delta)) / (2 * x);
			System.out.println("Roots are distinct" + " " + "root=" + root1 + "root2 =" + root2);
		} else if (delta == 0) {
			double root3 = (-y) / (2 * x);
			double root4 = root3;
			System.out.println("Roots are equal" + "" + " root =" + root3);
		} else if (delta < 0) {
			double real = (-y) / (2 * x);
			double imaginary = Math.sqrt(-delta) / (2 * x);
			System.out.println("Roots are real and imaginary");
			System.out.println(real + "+i" + imaginary);
			System.out.println(real + "-i" + imaginary);
		}

	}


/**Array2D
 * @param row
 * @param coloumn
 * @param array
 */
public static void array2D(int row,int coloumn,int array[][])
{
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<coloumn;j++)
		{
			System.out.print(+array[i][j]+" ");
		}
		System.out.println();
	}
}


/**StopWatch
 * @param startTime
 * @param endTime
 */
public static void stopWatch(long startTime,long endTime)
{
	long timeElapsed=endTime-startTime;
	System.out.println("Execution time in milliseconds:" + timeElapsed);
}

}



