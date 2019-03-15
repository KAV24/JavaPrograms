package com.bridgelabz.function;
import com.bridgelabz.util.FunctionalProgramming;

public class QuadraticEquation {

	public static void main(String[] args) {
		System.out.print("x=");
		int x=FunctionalProgramming.getInt();
		System.out.print("y=");
		int y=FunctionalProgramming.getInt();
		System.out.print("z=");
		int z=FunctionalProgramming.getInt();
		FunctionalProgramming.findRoot(x,y,z);
		
		
	}

}
