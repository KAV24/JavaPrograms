package com.function;
import java.sql.Time;
import java.util.concurrent.TimeUnit;
import com.bridgelabz.util.FunctionalProgramming;

public class StopWatch {
	public static void main(String[] args)  throws InterruptedException
	{
		long startTime = System.currentTimeMillis();
		System.out.println("start time="+ startTime);
		TimeUnit.SECONDS.sleep(10);
		long endTime = System.currentTimeMillis();
		System.out.println("End time=" + endTime);
		FunctionalProgramming.stopWatch(startTime, endTime);
		
		
	}
	

	
		
	}


