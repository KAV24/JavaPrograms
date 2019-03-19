package com.bridgelabz.algorithms;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.Algorithms;
public class BubbleSortList {

	
public static void main(String[] args)
{
	System.out.println("Enter size: ");
	int n =Algorithms.getInt();
	List<Integer> nos = new ArrayList<Integer>();
	System.out.println("Enter elements:");

	for(int i=0;i<n;i++){
		nos.add(Algorithms.getInt());
	}
	Algorithms.bubble(nos,n); 
}

}