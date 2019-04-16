package com.bridgelabz.inventory.main;

import java.io.IOException;
import java.util.Scanner;
import com.bridgelabz.inventory.impl.InventoryImplementation;


public class InventoryManagement {

	public static void main(String[] args) throws IOException {

		@SuppressWarnings("unused")
		
		InventoryImplementation imp= new InventoryImplementation();{
			
			@SuppressWarnings("unused")
			Scanner sc = new Scanner(System.in);
			System.out.println("enter new pulses");
			String name=sc.nextLine();
			System.out.println("enter new price");
			double price =sc.nextDouble();
			System.out.println("enter weight");
			double weight=sc.nextDouble();



			
			imp.fileRead();
			imp.add(name, weight, price);
			imp.calculateInventory();
			imp.writeFile();
			imp.remove();
			
			
		}



	}

}