package com.bridgelabz.inventory.data;



public interface InventoryInterface {
	    public void fileRead() ;
		public  void add(String name,double weight, double price);
		public void remove();
		public void calculateInventory();
		public void writeFile();

	}