package com.function;
import com.bridgelabz.util.functionalprogramming;


public class Gambler {
	public static void main(String[] args) {
		//Reading input number from the user
		System.out.println("enter the stake");  
       int stake=functionalprogramming.intk(); 
       System.out.println("enter the goal"); 
       int goal=functionalprogramming.intk(); 
       System.out.println("enter the trails"); 
       int t=functionalprogramming.intk();  
       //Method 1- using non-static function of FunctionalUtilty class
       //of com.bridgelabz.util package
functionalprogramming.gambler(stake,goal,t); }}


