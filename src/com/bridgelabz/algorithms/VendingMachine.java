package com.bridgelabz.algorithms;
import com.bridgelabz.util.Algorithms;

public class VendingMachine {

	public static void main(String[] args) {
		
		       
		        int []change= {1, 2, 5, 10, 50, 100, 500, 1000};
		        System.out.println("enter money");
		        int money=Algorithms.getInt();
		        Algorithms. vending(change, money);
		        
		    }
		       
}