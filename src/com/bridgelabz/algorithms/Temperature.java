package com.bridgelabz.algorithms;
import com.bridgelabz.util.Algorithms;


public class Temperature {

	public static void main(String[] args) {
		   System.out.println("Enter temperature in Fahrenheit :");
	        float temperatue = (float) Algorithms.getFloat(); 
	       float celsius =  Algorithms.toCelsius(temperatue);
	        
	        
	        System.out.printf("%.02f degree fahrenheit temperature is equal to %.02f degree celsius %n", temperatue, celsius);
	 
	       // Converting temperature in celsius
	        System.out.println("Enter temperature in degree celsius :");
	        float temperatue1 = (float) Algorithms.getFloat(); 
	       float fahrenheit =  Algorithms.toFahrenheit(temperatue1);
	        
	        System.out.printf("%.02f degree celsius is equal to %.02f degree fahrenheit %n", temperatue1, fahrenheit);
	    }

	}


