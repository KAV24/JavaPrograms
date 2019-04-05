package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.List;

public class DataStructuresProgram {
	  @SuppressWarnings("rawtypes")
	public static boolean areParenthesisBalanced(char[] ch) {

			StackImplementation st = new StackImplementation();

			for (int i = 0; i < ch.length; i++) {
				if (ch[i] == '{' || ch[i] == '(' || ch[i] == '[')
					st.push(ch[i]);

				if (ch[i] == '}' || ch[i] == ')' || ch[i] == ']') {

					if (st.isEmpty()) {
						return false;
					}

					else if (!isMatchingPair(st.pop(), ch[i])) {
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
	return lst;}
}

