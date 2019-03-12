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
       FunctionalProgramming.gambler(stake,goal,t); }}


