package com.bridgelabz.algorithms;
import com.bridgelabz.util.Algorithms;
import java.util.Scanner;

public class BinaryNibble {



		public static void main(String[] args) {
			System.out.println("Enter the number"); 
		    int number = Algorithms.getInt();
			int result=Algorithms.swapNibbles(number);
			System.out.println("Number after swapping nibbles " +result);
			boolean status=Algorithms.isPowerOfTwo(result);
			
			if(status==true)
				System.out.println("The result is a power of two");
			else
				System.out.println("The result is not a power of two");
			}
	}
		
