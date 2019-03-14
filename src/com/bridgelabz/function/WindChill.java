package com.bridgelabz.function;
import com.bridgelabz.util.FunctionalProgramming;


public class WindChill {

	public static void main(String[] args) {
		double t = Double.parseDouble(args[0]);
		//commandline argument
		double v = Double.parseDouble(args[1]);
		//temp speed
		System.out.println("Temperature is " + t);
		System.out.println("Speed of the wind is " + v);
		double wind = FunctionalProgramming.windChill(t,v);
		System.out.println("Wind chill is " +wind);
	}
	
		

	}


