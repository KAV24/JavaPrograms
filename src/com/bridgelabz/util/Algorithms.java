package com.bridgelabz.util;


import java.util.Arrays;
import java.util.Scanner;

public class Algorithms{
	private static Scanner scan = new Scanner(System.in);

	public static int intk() {
		return scan.nextInt();
	}

	public static String strk() {
		return scan.next();
	}
	public static long lonk(){
		return scan.nextLong();
	}
	public static double doubk(){
		return scan.nextDouble();
	}

	
	
	
	/**
	 * @return
	 */
	public static int[] arr()
	{
		int n=Algorithms.intk();
		int[]arr =new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=intk();
		}
		for(int e:arr)
		{
			System.out.println(e+" ");
		}
		
		return arr;
	}
					
		
	
	
/**Anagram
 * @param str1
 * @param str2
 * @return
 */
public static boolean areAnagram (char[] str1, char[] str2)
{
	int n1 = str1.length;
	int n2= str2.length;
	if (n1 != n2)
		return false;
	  
	Arrays.sort(str1);
	Arrays.sort(str2);
	
	//compare sorted strings
	for(int i=0; i<n1; i++)
		if(str1[i] !=str2[i])
			return false;
	return true;
}

/**prime
 * 
 */
public static int prime()
{
	int i=0;
	int num=0;
String primeNumbers="";
for ( i = 1; i <= 1000; i++)         
{ 		  	  
   int counter=0; 	  
   for( num =i; num>=1; num--)
{
      if(i%num==0)
  {
	counter = counter + 1;
  }
}
if (counter ==2)
{
  //Appended the Prime number to the String
  primeNumbers = primeNumbers + i + " ";
	
}	
}	

System.out.println(primeNumbers );
return num ;
}


/**BubbleSort
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
	}
	
}
/**INSERTION SORT FOR INT
 * @param array
 */
public static void insertint(int[] array) 
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
}	
