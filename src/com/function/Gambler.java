package com.function;
import com.bridgelabz.util.FunctionalProgramming;


public class Gambler {
	public static void main(String[] args) {
		//Reading input number from the user
		System.out.println("enter the stake");  
       int stake=FunctionalProgramming.intk(); 
       System.out.println("enter the goal"); 
       int goal=FunctionalProgramming.intk(); 
       System.out.println("enter the trails"); 
       int t=FunctionalProgramming.intk();  
       //Method 1- using non-static function of FunctionalUtilty class
       //of com.bridgelabz.util package
FunctionalProgramming.gambler(stake,goal,t); }}


