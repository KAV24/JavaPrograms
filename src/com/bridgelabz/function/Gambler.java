package com.bridgelabz.function;
import com.bridgelabz.util.FunctionalProgramming;


public class Gambler {
	public static void main(String[] args) {
		//Reading input number from the user
		System.out.println("enter the stake");  
       int stake=FunctionalProgramming.getInt(); 
       System.out.println("enter the goal"); 
       int goal=FunctionalProgramming.getInt(); 
       System.out.println("enter the trails"); 
       int t=FunctionalProgramming.getInt();  
       FunctionalProgramming.gambler(stake,goal,t); }}


