
package com.bridgelabz.datastructures;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.LinkedList;

public class UnorderedList {
	public static void main(String[] args) throws Exception {

		File file = new File("E:\\.file.txt");
		BufferedReader bufferreader = new BufferedReader(new FileReader(file));
		String[] array = new String[50];
		String delimitor = " ";
		String st;
		while ((st = bufferreader.readLine()) != null) {
			array = st.split(delimitor);
		}

		LinkedList list = new LinkedList(Arrays.asList(array));

		// iterate over each element in LinkedList and show what is in the list.
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			// Print element to console
			System.out.println((String) iterator.next());
		}
		int n = list.size();
		System.out.println("Enter key element: ");
		String key = DataStructureUtil.inputString();
		SingleLinkedList.searchKey(list, n, key);
		
}
}

	
	
	



