package com.bridgelabz.function;

import com.bridgelabz.util.FunctionalProgramming;

public class Array2D {

	public static void main(String[] kavya) {
		System.out.println("rows");
				int row=FunctionalProgramming.getInt();
				System.out.println("coloumns");
				int coloumn=FunctionalProgramming.getInt();
				Object array[][]=new Object [row][coloumn];
				
				FunctionalProgramming.array2D(row,coloumn,array);
				
	

	}
	

}
