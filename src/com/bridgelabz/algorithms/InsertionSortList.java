package com.bridgelabz.algorithms;


import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.Algorithms;

public class InsertionSortList {

	public static void main(String[] args) {
		System.out.println("Enter size: ");
		int n =Algorithms. getInt();
			List<String> words = new ArrayList<>();
			System.out.println("Enter the words:");

			for(int i=0;i<=n-1;i++){
				words.add(Algorithms.getString());
			}
			Algorithms.insertString(words,n);
			
		}


	}


