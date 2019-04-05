package com.bridgelabz.util;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author kavya
 *
 */
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
	 * 0-1000
	 */
	public static void prime(int num1,int num2)
	{


		for(int i = num1; i < num2; i++)
			//range
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
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
				int	t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
					
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
	public static void insertString(String[] array)
	{
		
		int i=0,j=0,w;
		String temp;
		for(i=0;i<array.length;i++)
		{
			for(j=0;j<=i;j++)
			{
				if(array[j].compareTo(array[i])>0)
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




/**Decimal to Binary
 * @param n
 */
public static void decToBinary(int n) 
{ 
    // array to store binary number 
    int[] binaryNum = new int[1000]; 

    // counter for binary array 
    int i = 0; 
    while (n > 0)  
    { 
        // storing remainder in binary array 
        binaryNum[i] = n % 2; 
        n = n / 2; 
        i++; 
    } 

    // printing binary array in reverse order 
    for (int j = i - 1; j >= 0; j--) 
        System.out.print(binaryNum[j]); 
} 



	
	

//SWAP NIBBLES
	public static int swapNibbles(int x) {
		{ 
			return ((x & 0x0F) << 4 | (x & 0xF0) >> 4); 
		}
	}
	//IS POWER OF 2
	public static boolean isPowerOfTwo(int res)
	{
		return (int)(Math.ceil((Math.log(res) / Math.log(2)))) ==  
				(int)(Math.floor(((Math.log(res) / Math.log(2))))); 
	}








/**Bubble list
 * @param nos
 * @param n
 */
public static void bubble(List<Integer> nos, int n) {
	int i, temp;

	for (i = 0; i < nos.size() - 1; i++) {
		for (int j = 0; j < nos.size() - i - 1; j++) {

			if (nos.get(j) > nos.get(j + 1)) {
				temp = nos.get(j);
				nos.set(j, nos.get(j + 1));
				nos.set(j + 1, temp);

			}
		}
	}
	for (int k:nos) {
		System.out.print(k+ " ");
	}

}


/**InsertionSort List
 * @param array
 * @param n
 */
public static void insertString(List <String> array,int n) {

	int i = 0, j = 0, w;
	String temp;
	for (i = 0; i < array.size(); i++) {
		for (j = 0; j <= i; j++) {
			if (array.get(j).compareTo(array.get(i))>0)
			{
				temp = array.get(j);
				array.set(j, array.get(i));
				for (w = i; w > j + 1; w--)
				{
					array.set(w, array.get(w-1));
				}
				array.set(w, temp);
			}
		}
	}

	for (String k:array)
		System.out.print(k + " ");
	System.out.println(" ");

}


//binary

public static <T extends Comparable<T>> void  binary(T[] array, T key){
	int length=array.length;
	int first=0;
	int last=length-1;
	int middle=(first+last)/2;
	while(first<=last)
	{
		if(key.compareTo(array[middle])>0)
	     {
	       first=middle+1;
          }
		
	else if(array[middle].equals(key))
	{
		System.out.println(key+"-found at location-"+middle);
		break;
	}
	else
	{
		last=middle-1;
	}
		middle=(first+last)/2;
}
	if(first>last)
		System.out.println("key not found");
	
}



//Sortbubble


public static <T extends Comparable<T>> T[] bubble(T[] array){
	for (int j = 0; j < array.length; j++) {
         for (int i = j + 1; i < array.length; i++) {
            // comparing strings
            if (array[i].compareTo(array[j]) < 0) {
         
               T temp = array[j];
               array[j] = array[i];
               array[i] = temp;
            }
       
}
	} for(int k=0;k<array.length;k++) {
    	System.out.println(array[k]);
    }
	return array;

}





public static <T extends Comparable<T>> void insertionSort(T[] array) {
	int i = 0, j = 0, w;
	for (i = 0; i < array.length; i++) {
		for (j = 0; j <= i; j++) {
			if (array[j].compareTo(array[i])>0) {
				T temp = array[j];
				array[j] = array[i];
				for (w = i; w > j + 1; w--)
					array[w] = array[w - 1];
				array[w] = temp;
			}
		}
	}
	for (T kl : array)
		System.out.println(kl + " ");
	System.out.println(" ");
}


public static int dayOfWeek(int d, int m, int y)
{
	int y0 = y - (14-m) / 12;
	int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
	int m0 = m + 12 * ((14-m) / 12) - 2;
	int d0 = (d + x + (31 * m0) / 12) % 7;
	return d0;
}   

}








