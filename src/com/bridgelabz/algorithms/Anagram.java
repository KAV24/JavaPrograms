package com.bridgelabz.algorithms;
 import com.bridgelabz.util.Algorithms;

public class Anagram {

	public static void main(String[] args) {
		System.out.println("enter a first string");
		String firstString=Algorithms.strk();
		char[] s=firstString.toCharArray();
		//convert string to charArray
		System.out.println("enter a second string");
		String secondString=Algorithms.strk();
		char[] r=secondString.toCharArray();
		if (Algorithms.areAnagram(s,r))
			System.out.println("The two strings are anagram of each other");
		else
			System.out.println("The two strings are not anagram of each other");
		
		}
		
		

	}

