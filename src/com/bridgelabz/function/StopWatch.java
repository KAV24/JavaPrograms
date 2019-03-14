package com.bridgelabz.function;
import java.sql.Time;
import java.util.concurrent.TimeUnit;
import com.bridgelabz.util.FunctionalProgramming;

public class StopWatch {
	public static void main(String[] args)  throws InterruptedException
	{
		long startTime = System.nanoTime();
		System.out.println("start time="+ startTime);
		
		long endTime = System.nanoTime();
		System.out.println("End time=" + endTime);
		long time= FunctionalProgramming.stopWatch(startTime, endTime);
		System.out.println("Execution time in nanoseconds:" + time);
		
	}
	

	
		
	}


