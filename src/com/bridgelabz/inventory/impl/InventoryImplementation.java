package com.bridgelabz.inventory.impl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.inventory.data.InventoryInterface;
import com.bridgelabz.inventory.model.Inventory;
import com.google.gson.Gson;

public class InventoryImplementation implements InventoryInterface {
	JSONArray jsonArray;
	List<Inventory> inventories = new ArrayList<>();

	JSONObject jobject = new JSONObject();

	public void fileRead() {
		JSONParser parser = new JSONParser();
		{
			try {
				jsonArray = (JSONArray) parser.parse(new FileReader("C:\\KAVYA\\bridgelabz\\src\\com\\bridgelabz\\inventory\\model\\json.json"));

				for (Object obj : jsonArray) {
					Inventory inventory = new Inventory();

					jobject = (JSONObject) obj;
					String name = (String) jobject.get("name");
					System.out.println(name);
					double price = ((double) jobject.get("price"));
					double weight = ((double) jobject.get("weight"));

					inventory.setWeight(weight);
					inventory.setName(name);
					// System.out.println(inventory.getName());

					// System.out.println(inventory.getWeight());
					inventory.setPrice(price);
					// System.out.println(inventory.getPrice());
					inventories.add(inventory);

				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


//	public double calculate(double price) {
//		double totalPrice = 0;
//		return totalPrice;
//	}

	public void calculateInventory() {
		inventories.forEach(inventory -> {
			System.out.println(
					"Total price of " + inventory.getName() + "is" + (inventory.getPrice() * inventory.getWeight()));
		});
	}

	public void writeFile() {
		Gson gson = new Gson();
		String json = gson.toJson(inventories);
		System.out.println( json );
		System.out.println( inventories );

		try(FileWriter file = new FileWriter("C:\\KAVYA\\bridgelabz\\src\\com\\bridgelabz\\inventory\\model\\json.json")){
			file.write(json);
			System.out.println("SuccessFully copied to JSON  Object to File......");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}



	@Override
	public void add(String name, double weight, double price) {
		Inventory inventory = new Inventory();
		
		inventory.setName(name);
		inventory.setPrice(price);
		inventory.setWeight(weight);
		
		inventories.add(inventory);
		inventories.forEach(inventory1 -> System.out.println(inventory1.toString()));


	}

	@Override
	public void remove() {
		//fileRead();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter which elements to be removed :");
		String removeele=sc.nextLine();
		inventories.removeIf(inventory -> inventory.getName().equals(removeele));
		writeFile();
		System.out.println("SuccessFully Removed the Elements From The List");
	}
}


