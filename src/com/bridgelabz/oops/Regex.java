package com.bridgelabz.oops;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.bridgelabz.util.Algorithms;
import com.bridgelabz.util.Oops;

public class Regex {
	public static void main(String[] args) throws FileNotFoundException {
		File str = new File("C:\\Users\\kavya\\OneDrive\\Desktop\\regex.txt");
        FileReader f = new FileReader(str);
       
		BufferedReader read = new BufferedReader(f);
		String line = "";
		String word = "";
		try {
			while ((word = read.readLine()) != null) {
				line = word;
			}
			System.out.println(line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Please enter the first name");
		String firstName = Algorithms.getString();
		System.out.println("Please enter the last name");
		String lastName = Algorithms.getString();
		String fullName = firstName + " " + lastName;
		System.out.println("Please enter your 10 digit phone number");
		String phoneNum = Algorithms.getString();
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String formattedDate = dateFormat.format(date);
        String message = Oops.replace(firstName, fullName, phoneNum, formattedDate, line);
        System.out.println(message);
        
     /*  DateFormat df = new SimpleDateFormat("dd/MM/yy");
        Date dateobj = new Date();
        System.out.println(df.format(dateobj));*/
        
	}
}