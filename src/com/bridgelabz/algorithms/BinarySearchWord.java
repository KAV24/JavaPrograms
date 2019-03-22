package com.bridgelabz.algorithms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import com.bridgelabz.util.Algorithms;

public class BinarySearchWord {

	public static void main(String[] args) throws Exception
	
			{ 
				File file = new File("E:\\word.txt"); 
		        @SuppressWarnings("resource")
				BufferedReader br= new BufferedReader(new FileReader(file)); 
				
				String delimitor = ",";
				
				String[] strr=new String[100];
				String st;
				while ((st = br.readLine()) != null)
				{
					strr=st.split(delimitor);
				}
				System.out.println("sorted array: ");
						Algorithms.bubble(strr);
				
				 
				System.out.println("Enter the key to search:");
				String key=Algorithms.getString();
				Algorithms.binary(strr, key);



			}

		}
		

	


