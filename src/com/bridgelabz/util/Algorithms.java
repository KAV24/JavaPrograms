package com.bridgelabz.util;
import java.util.Arrays;
import java.util.List;
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








//Function to convert decimal to binary//
	/**
	* @param d
	* @return
	*/
	public static int[] toBinary(int d)
	{
		String bin = "";
		while (d != 0)
		{
			bin = (d % 2) + bin;
			d = d/2;
		}
		
		while (bin.length() % 4 != 0) 
		{
			bin = 0 + bin;
		}
		return stringToIntArray(bin);

	}

	// Function to convert string to int array helper function for swapnibble in//

	/**
	* @param bin
	* @return
	*/
	static int[] stringToIntArray(String bin)
	{
		int[] binary = new int[bin.length()];
		for (int i = 0; i < binary.length; i++)
		{
			binary[i] = bin.charAt(i) - 48;
		}
		return binary;
	}

	// Function to convert binary to decimal//
	/**
	* @param binary
	* @return
	*/
	public static int toDecimal(int[] binary)
	{
		int dec = 0, j = 0;
		for (int i = binary.length - 1; i >= 0; i--) 
		{
			if (binary[i] == 1)
			{
				dec = dec + (int) Math.pow(2, j);
			}
			j++;
		}
		return dec;

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
					array.set(w, array.get(w-1));
				array.set(w, temp);
			}
		}
	}

	for (String k:array)
		System.out.print(k + " ");
	System.out.println(" ");
}
}











