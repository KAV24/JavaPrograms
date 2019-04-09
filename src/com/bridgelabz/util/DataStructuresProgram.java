package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.List;

public class DataStructuresProgram {
	static boolean isMatchingPair(char character1, char character2) {
		if (character1 == '(' && character2 == ')')
			return true;
		else if (character1 == '{' && character2 == '}')
			return true;
		else if (character1 == '[' && character2 == ']')
			return true;
		else
			return false;
	}

	@SuppressWarnings("unchecked")
	public static boolean areParenthesisBalanced(char[] ch) {
			@SuppressWarnings("rawtypes")
			StackImplementation st = new StackImplementation();
	
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] == '{' || ch[i] == '(' || ch[i] == '[')
					st.push(ch[i]);
	
				else	if (ch[i] == '}' || ch[i] == ')' || ch[i] == ']') {
	
					if (st.isEmpty()) {
						return false;
					}
	
					else if (!isMatchingPair((char)st.pop(), ch[i])) {
						return false;
					}
				}
	
			}
	
			if (st.isEmpty())
				return true;
			else {
				return false;
			}
		}

		
/**Prime 2D
 * @param m
 * @param n
 * @return
 */
public static List<Integer> primeNum2D(int m,int n) {
	List<Integer> lst=new ArrayList<Integer>();
	int temp;

	//swapping of bounds if the given lower bound is greater than upper bound
	if(m>n) {
		temp=m;
		m=n;
		n=temp;}
	int flag=1;
	//try all the possible values from lower bound to upper bound
	//if the number has the factor then it must be checked within lower bound
	for(int i=m;i<=n;i++){
		for(int j=2;j<i;j++){
			//If the number is divisible by any of the number then 
			//initializing flag to zero and break
			//else flag is initialized to one
			if(i%j==0){
				flag=0;
				break;}
			else
				flag=1;}
		//If the number is prime which is indicated by the flag,
		//then adds the number into an ArrayList.
		if(flag==1)
			lst.add(i);}
	return lst;
	}





/**
* to find number of total number of BST that can be performed
* @param n double type
* @return double type result 
*/

public static double binaryCount(int n) {
	double c = binomialCoeff(2 * n, n);
	double count = c / (n + 1);
	return count;
}
/**
* to find out binomial co-efficient of number
* @param n double type number
* @param k double type number
* @return double type result
*/
public static double binomialCoeff(double n, double k) {
	int res = 1;
    if (k > n - k) {
        k = n - k; } 
	for (int i = 0; i < k; ++i) {
		res *= (n - i);
		res /= (i + 1);
	}
	return res;		
}







//prime2D
public static List<Integer> primeNumbers(int start,int end) {
	List<Integer> lst=new ArrayList<Integer>();
	int flag=1;
	for(int i=start+2;i<end;i++){
		for(int j=2;j<i;j++){
			if(i%j==0)
			{
				flag=0;
				break;
			}
			else
				flag=1;
		}
		if(flag==1)
		{
			lst.add(i);
		}
	}
	return lst;
}



/* Function that checks if the prime numbers are anagram or not
* 
* @param new_lst the list of prime numbers 
* @return the list of prime numbers that are anagram
*/
	public static List<Integer> anagramPrime(List<Integer> new_lst){
	List<Integer> listOfAnagrams=new ArrayList<Integer>();
	for(int i=0;i<new_lst.size();i++){
		for(int j=i+1;j<new_lst.size();j++){
			if(DataStructuresProgram.isAnagram(String.valueOf(new_lst.get(i)),String.valueOf( new_lst.get(j)))){
				listOfAnagrams.add(new_lst.get(i));
				listOfAnagrams.add(new_lst.get(j));
				System.out.println(new_lst.get(i)+"  "+new_lst.get(j));
			}
		}
	}
	return listOfAnagrams;
}

/**
* Function that prints the list of prime numbers that are anagram 
* 
* @param list of prime numbers that anagram 
*/
public static void printPrimeAndAnagram(List<List<Integer>> list)
{
   List<Integer> aList = new ArrayList<Integer>();
   for (int i = 0; i < list.size(); i++) {
       aList = list.get(i);
       if (i == 0) {
           System.out.println("Numbers which are prime and anagram are:"+aList.size());
           System.out.println();
           for (int j = 0; j < aList.size(); j++) {
               System.out.print(aList.get(j) + " ");
           }
       } else {
           System.out.println("Numbers which are prime but not anagram are:"+aList.size());
           System.out.println();
           for (int j = 0; j < aList.size(); j++) {
               System.out.print(aList.get(j) + " ");
           }
       }
       System.out.println();
   }
}





/*Static function to check if the two strings are anagram or not.
	* @param <T>
	* 
	* @param str1 the string to be checked for anagram
	* @param str2 the string to be checked for anagram
	* @return true if the strings are anagram else false
	*/
	public static boolean isAnagram(String str1,String str2) {
		char[] array1=str1.toCharArray();
		char temp1,temp2;
		char[] array2=str2.toCharArray();
		int len1=str1.length();
		int len2=str2.length();
		if(len1!=len2) {
			return false;
		}
		else{
			for(int i=0;i<len1;i++){
				for(int j=0;j<len1-1;j++){
					if(array1[j]>array1[j+1]){
						temp1=array1[j];
						array1[j]=array1[j+1];
						array1[j+1]=temp1;
					}
				}
			}
			for(int i=0;i<len2;i++){
				for(int j=0;j<len2-1;j++){
					if(array2[j]>array2[j+1]){
						temp2=array2[j];
						array2[j]=array2[j+1];
						array2[j+1]=temp2;
					}
				}
			}
			str1=String.valueOf(array1);
			str2=String.valueOf(array2);
			if(str1.equals(str2))
				return true;
			else
				return false;
		}	
	}
}




