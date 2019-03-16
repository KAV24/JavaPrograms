package com.bridgelabz.util;


import java.util.Arrays;
import java.util.Scanner;

public class Algorithms{
	private static Scanner scan = new Scanner(System.in);

	public static int getInt() {
		return scan.nextInt();
	}

	public static String getString() {
		return scan.next();
	}
	public static long getLong(){
		return scan.nextLong();
	}
	public static double getDouble(){
		return scan.nextDouble();
	}

	public static double getFloat(){
		return scan.nextFloat();

	}
	
	
	
	/**
	 * @return
	 */
	public static int[] arr()
	{
		int n=Algorithms.getInt();
		int[]arr =new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=getInt();
		}


		return arr;
	}




	/**1.Anagram
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean areAnagram (char[] str1, char[] str2)
	{
		int string1 = str1.length;
		int string2= str2.length;
		if (string1 != string2)
			return false;

		Arrays.sort(str1);
		Arrays.sort(str2);

		//compare sorted strings
		for(int i=0; i<string1; i++)
			if(str1[i] !=str2[i])
				return false;
		return true;
	}

	/**2.Prime
	 * 0-10000
	 */
	public static void prime(int num1,int num2)
	{


		for(int i = num1; i < num2; i++)
		{
			int mode=0;
			for(int  j = 1; j <=i; j++)
			{
				if(i % j == 0)
				{
				 mode= mode+1;

				}

			}
			if(mode == 2)

				System.out.print(i+" ");
		}

	}

	/**3.BubbleSort
	 * @param a
	 */
	public static void bubbleSort(int a[])
	{
		for (int i=0;i<a.length-1;i++)
		{
			for (int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(int e:a)
		{
			System.out.print(e+" ");
			//used to store the array elements;
		}

	}
	/** 4.INSERTION SORT FOR INT
	 * Time Complexity
	 */
	public static void insertionint(int[] array) 
	{
		int i=0,j=0,w,temp;
		for(i=0;i<array.length;i++)
		{
			for(j=0;j<=i;j++)
			{
				if(array[j]>array[i])
				{
					temp=array[j];
					array[j]=array[i];
					for(w=i;w>j+1;w--)
						array[w]=array[w-1];	
					array[w]=temp;
				}
			}
		}
		for(int kl:array)
			System.out.print(kl + " ");
	}
	//INSERTION SORT FOR STRING
	public static void insertString(String str)
	{
		char[] array=str.toCharArray();
		int i=0,j=0,w;
		char temp;
		for(i=0;i<array.length;i++)
		{
			for(j=0;j<=i;j++)
			{
				if(array[j]>array[i])
				{
					temp=array[j];
					array[j]=array[i];
					for(w=i;w>j+1;w--)
						array[w]=array[w-1];	
					array[w]=temp;
				}
			}
		}

		for(int kl=0;kl<array.length;kl++)
			System.out.print( array[kl]+" ");
		System.out.println(" ");
	}




	/**5.MergeSort
	 * @param names
	 */
	public static void mergeSort(String[] names) {
		if (names.length >= 2) {
			String[] left = new String[names.length / 2];
			String[] right = new String[names.length - names.length / 2];

			for (int i = 0; i < left.length; i++) {
				left[i] = names[i];
			}

			for (int i = 0; i < right.length; i++) {
				right[i] = names[i + names.length / 2];
			}

			mergeSort(left);
			mergeSort(right);
			merge(names, left, right);
		}
	}

	public static void merge(String[] names, String[] left, String[] right) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < names.length; i++) {
			if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
				names[i] = left[a];
				a++;
			} else {
				names[i] = right[b];
				b++;
			}
		}
	}
	
	 public static <T extends Comparable<T>> T maximum(T[] array, T key) {
	     // assume x is initially the largest
	int arrLength=array.length;
	int first = 0;
	int last = arrLength - 1;
	int middle = (first + last)/2;


			while( first <= last )
			{
				if (array[middle].compareTo(key)>0)
					first = middle + 1;    					
				else if ( array[middle] == key )
				{
					System.out.println(key + " found at location " + middle);
					break;
				}
				else
					last = middle - 1;

				middle = (first + last)/2;
			}
			if (first > last)
				System.out.println(key + " isn't present in the list.\n");
			return key;
		}





/**Temperature
 * @param celsius
 * @return
 */
public static float toFahrenheit(float celsius) {
    float fahrenheit = 9 * (celsius / 5) + 32;
    return fahrenheit;
}
/**
* Converts fahrenheit temperature to celsius
 *
 * @param fahrenheit
 * @return
 */
public static float toCelsius(float fahrenheit) {
    float celsius = (fahrenheit - 32) * 5 / 9;
    return celsius;
}




/**VendingMachine
 * @param change
 * @param money
 */
public static void vending(int[] change,int money)
{
for(int i=change.length-1;i>=0;i--)
{
    int count=0;
    if(money==0)
        return;
    else
        {
        if(money>=change[i])
    {
        count=money/change[i];
        System.out.println(change[i]+" notes:"+count);
        money=money % change[i];
    }
}

}

}


}
