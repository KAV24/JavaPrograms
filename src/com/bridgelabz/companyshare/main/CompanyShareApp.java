package com.bridgelabz.companyshare.main;

import com.bridgelabz.companyshare.Interface.CompanyShareService;
import com.bridgelabz.companyshare.impl.CompanyShareServiceImpl;
import com.bridgelabz.util.Algorithms;

public class CompanyShareApp {

	public static void main(String[] args) {
		
		CompanyShareService object=new CompanyShareServiceImpl();
		while (true) {
				System.out.println("1.Add\n2.Remove\n3.Exit");
				System.out.println("Enter your choice: ");
				int Choice = Algorithms.getInt();
				switch (Choice) {
				case 1:
				System.out.println("enter company name to add");
				String companyName = Algorithms.getString();
				System.out.println("enter the number of share");
				Long numberOfShares = Algorithms.getLong();
				object.add(companyName, numberOfShares);
				break;
				case 2:
					System.out.println("enter the name you want to delete");
					String name=Algorithms.getString();
					object.remove(name);
					break;
				case 3:
					System.exit(0);
				default:
					System.out.println("Please enter valid input:");
				}
				
	    
		}
	}
}