package com.function;

import com.bridgelabz.util.FunctionalProgramming;

public class Array2D {

	public static void main(String[] args) {
		System.out.println("rows");
				int row=FunctionalProgramming.intk();
				System.out.println("coloumns");
				int coloumn=FunctionalProgramming.intk();
				int array[][]=new int[row][coloumn];
				for(int i=0;i<row;i++)
				{
					for(int j=0;j<coloumn;j++)
					{
						System.out.println("enter the values");
						array[i][j]=FunctionalProgramming.intk();
						
					}
				}
				FunctionalProgramming.array2D(row,coloumn,array);
				
		// TODO Auto-generated method stub

	}

}
