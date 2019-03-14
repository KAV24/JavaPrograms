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

System.out.println(primeNumbers);
return num ;
}
}	
