package com.bridgelabz.addressbook.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.parser.ParseException;

import com.bridgelabz.addressbook.Interface.AddressBookInterface;
import com.bridgelabz.addressbook.impl.AddressBookImpl;
import com.bridgelabz.util.Algorithms;

public class AddressBookMain {
	public static void main(String[] args) throws IOException, ParseException{
		AddressBookInterface AddressBookImpl = new AddressBookImpl();
		AddressBookImpl imp= new AddressBookImpl();
		{
			imp.fileRead();
			Scanner sc = new Scanner(System.in);
			
			
			
			System.out.println(" 1.addperson \n 2.remove person \n 3.sortbyname \n 4.sortzip");
			System.out.println("Input choice");
			int input = Algorithms.getInt();
			switch (input){
			case 1:
				imp.addPerson("Anu", "Kavya", 213211l, 1234567898l,"Rajmathe","Mysore","Bangalore");
				break;
			case 2:
				imp.removePerson();
				break;
			case 3:
			  imp.sortByLastName();
			    break;
			case 4:
				imp.sortByZipCode();
				break;
			}
			imp.writeFile();
						
		}
		}
	}


