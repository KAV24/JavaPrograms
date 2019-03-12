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
	public static double doubk(){
		return scan.nextDouble();
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
		for (int i = 2; i <=n; i++) {
			while (n % i == 0) {
				System.out.println(i + "");
				n = n / i;
			}
		}
	}

	

	/**Coin
	 * @param flips
	 * rs-result
	 */
	public static void coin(int flips) {
		int count = 1;
		double rs;
		int heads = 0;
		int tails = 0;
		while (count <= flips)
		//used to count the num of flips or toss
		{
			rs = Math.random();
			System.out.println(rs);
			if (rs <= 0.5) {
				tails++;

			} else {
				heads++;
			}
			count++;
		}
		System.out.println("number of tails"+tails);
		System.out.println("number of heads"+heads);
		System.out.println("number of flips"+flips);
		int headpercent = heads * 100 / flips;
		System.out.println("head percentage=" + headpercent);
		int tailpercent = tails * 100 / flips;
		System.out.println("tail percentage=" + tailpercent);
	}

	
	/**harmonic
	 * @param n
	 */
	public static void harmonic(int n) {
		float h = 1;
		for (int i = 2; i <= n; i++) {
			h += (float) 1 / i;

		}
		System.out.println(h);

	}

	
	/**replace
	 * @param s
	 * @param pn
	 */
	public static void replace(String s) {
		String msg = "hello," + s + ",how are you";

		if (s.length() >= 3) {

			System.out.println(msg);
		} else {
			System.out.println("invalid");
		       }
		System.out.println("enter the alternative name");
		String pn=FunctionalProgramming.strk();

		String nm = msg.replace(s, pn);
		System.out.println(nm);
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

	
	
	/**coupon
	 * @param 
	 * @return
	 */
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

	
	/**gambler
	 * @param stake
	 * @param goal
	 * @param t
	 */
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
	 * root- Distinct,Equal,Real-Imaginary
	 * @param x
	 * @param y
	 * @param z
	 */
	public static void findRoot(int x, int y, int z) {
		int delta = (y * y) - (4 * x * z);
		if (delta > 0)
		{
			double root1 = (-y + Math.sqrt(delta)) / (2 * x);
			double root2 = (-y - Math.sqrt(delta)) / (2 * x);
			System.out.println("Roots are distinct" + " " + "root=" + root1 + "root2 =" + root2);
		}
		else if (delta == 0)
		{
			double root3 = (-y) / (2 * x);
			double root4 = root3;
			System.out.println("Roots are equal" + "" + " root =" + root3);
		} 
		else if (delta < 0)
		{
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
	public static void array2D(int row, int coloumn, Object[][] array)
{
		System.out.println("enter the next values");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<coloumn;j++)
			{
				
				array[i][j]=FunctionalProgramming.strk();
				
			}
		}
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<coloumn;j++)
		{
			System.out.print(array[i][j]+" ");
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
	System.out.println("Execution time in nanoseconds:" + timeElapsed);
}





/**Sum
 * @param n
 * @param array
 */
public static void findTriples(int n,int array[])
{
	boolean found=true;
	for(int i=0; i<n-2; i++)
	{
		for(int j=i+1; j<n-1; j++)
		{
			for(int k=j+1; k<n; k++)
			{
				if(array[i] + array[j]+ array[k]==0)
				{
					System.out.print(array[i]);
					System.out.print(" ");
					System.out.print(array[j]);
					System.out.print(" ");
					System.out.print(array[k]);
					System.out.print("\n");
					found = true;
				}	
			}
		}
	}
			
			
				if(found==false);
				System.out.println(" not exist");
				
			}
			
			
	
					
				




/**WindChill
 * @param t
 * @param v
 * @return
 */
public static double windChill(double t,double v)
{
	double wind = 35.74 + 0.6215*t + (0.4275* - 35.75) * Math.pow(v, 0.16);
	return wind;
}


//distance
	/**
	 * static function that calculates the distance between the
	 * two points (x,y)
	 * 
	 * @param x the integer that represents a point
	 * @param y the integer that represents a point 
	 * @return distance the distance between the two points
	 */
	public static void distance(int x,int y){
		{
			double result=Math.sqrt(x*x + y*y);
			
			System.out.println("distance from (" + x +", "+ y +")to (0,0)="+result);
			
			}
			


}

	/** Permute
	 * @param str
	 * @param l
	 * @param r
	 */
	public static void permutation(String input){
		permutation("", input);
	}


	private static void permutation(String perm, String word) {
		if (word.isEmpty()) {
			System.err.println(perm + word);

		} else {
			for (int i = 0; i <word.length(); i++) {
				permutation(perm + word.charAt(i), word.substring(0, i) 
						+ word.substring(i + 1, word.length()));
			}
		}

	}
	
	 /**TicTacToe
	 * @param board
	 * @return
	 */
	public static int checkWinner(int[][] board) {
	    	// Check if someone won
	    	// Check horizontals

	    	// top row
	    	if((board[0][0] == board[0][1]) && (board[0][1] == board[0][2]))
	    	    return board[0][0];

	    	// middle row
	    	if((board[1][0] == board[1][1]) && (board[1][1] == board[1][2]))
	    	    return board[1][0];

	    	// bottom row
	    	if((board[2][0] == board[2][1]) && (board[2][1] == board[2][2]))
	    	    return board[2][0];

	    	// Check verticals

	    	// left column
	    	if((board[0][0] == board[1][0]) && (board[1][0] == board[2][0]))
	    	    return board[0][0];

	    	// middle column
	    	if((board[0][1] == board[1][1]) && (board[1][1] == board[2][1]))
	    	    return board[0][1];

	    	// right column
	    	if((board[0][2] == board[1][2]) && (board[1][2] == board[2][2]))
	    	    return board[0][2];

	    	// Check diagonals
	    	// one diagonal
	    	if((board[0][0] == board[1][1]) && (board[1][1] == board[2][2]))
	    	    return board[0][0];

	    	// the other diagonal
	    	if((board[0][2] == board[1][1]) && (board[1][1] == board[2][0]))
	    	    return board[0][2];

	    	// Check if the board is full
	    	if(board[0][0] == EMPTY || 
	               board[0][1] == EMPTY || 
	               board[0][2] == EMPTY || 
	    	   board[1][0] == EMPTY ||
	    	   board[1][1] == EMPTY ||
	    	   board[1][2] == EMPTY ||
	    	   board[2][0] == EMPTY ||
	    	   board[2][1] == EMPTY ||
	    	   board[2][2] == EMPTY)
	    	    return NONE;

	    	return STALEMATE;
	        }

	         public static int computer_move(int[][] board) {
	    	int move = (int)(Math.random()*9);

	    	while(board[move/3][move%3] != EMPTY) 
	    	    move = (int)(Math.random()*9);

	    	return move;
	        }
}								