package com.bridgelabz.datastructures;

import com.bridgelabz.util.Algorithms;
import com.bridgelabz.util.FunctionalProgramming;
import com.bridgelabz.util.Queue;

public class CalenderQueue {
	public static void main(String[] nidhi) {
		int month = Integer.parseInt(nidhi[0]);
		int year = Integer.parseInt(nidhi[1]);
		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (month == 2 && FunctionalProgramming.leap(year)) {
			days[month] = 29;
		}
		System.out.println("\t\t " + months[month] + " " + year);
		System.out.println("Sunday Monday Tuesday Wednesday Thursday Friday Saturday");
		int dayofWeek = Algorithms.dayOfWeek(1, month, year);
	Queue<Queue<Integer>> queue=new Queue<Queue<Integer>>();
		Queue<Integer> refqueue=new Queue<Integer>();
		
		
		for (int i = 1; i <= days[month]; i++) {
			refqueue.insert(i);
			if (((i + dayofWeek) % 7 == 0 || i==days[month]) ) {
				queue.insert(refqueue);
				refqueue=new Queue<Integer>();
				continue;
			}
		}	
		for (int i = 0; i < dayofWeek; i++)
		System.out.print("\t");
		for(int i=0;i<=queue.getSize();i++)
		{
			Queue<Integer> week=queue.remove();
			for(int j=0;j<week.getSize();j++)
			{
				System.out.print(week.remove()+"\t");
			}
			System.out.println();
		}

}


}
