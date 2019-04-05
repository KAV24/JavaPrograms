package com.bridgelabz.util;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;




public class SinglyLinkedList<T> {
	private NodeUnordered<T> head;
	private NodeUnordered<T> tail;
	private int size = 0;
	private String key;
	static String[] str = new String[100];
	static SinglyLinkedList newList = new SinglyLinkedList();

	public boolean isEmpty() {
		return head == null;
	}

	public String addElement(String key) {
		NodeUnordered<T> nd = new NodeUnordered<T>();
		nd.setValue((T) key);
		size++;

		/**
		* check if the list is empty
		*/
		if (isEmpty()) {
			// since there is only one element, both head and
			// tail points to the same object.
			head = nd;
			tail = nd;
		} else {
			// set current tail next link to new node
			tail.setNextRef(nd);
			// set tail as newly created node
			tail = nd;
		}
		return null;
	}

	public void traverse() {

		NodeUnordered<T> tmp = head;
		while (true) {
			if (tmp == null) {
				break;
			}
			System.out.println(tmp.getValue());
			tmp = tmp.getNextRef();
		}

	}

	@Override
	public String toString() {
		NodeUnordered<T> temp = head;
		String elements = "";
		while (temp.getNextRef() != null) {
			elements += " " + temp.getValue() + " ";
			temp = temp.getNextRef();
		}
		return elements + temp.getValue();
	}

	public void get() {

		NodeUnordered<T> tmp = head;
		int k = 0;
		while (true) {
			if (tmp == null) {
				break;
			}
			str[k] = String.valueOf(tmp.getValue());
			k++;
			tmp = tmp.getNextRef();
		}
	}

	public SinglyLinkedList<T> searchKey(SinglyLinkedList<T> list, String key) {
		NodeUnordered<T> current = head;
		boolean status = false;

		for (int i = 0; i < str.length - 1; i++) {
			if (str[i] != null && str[i].equals(key)) {
				status = true;
				str[i] = null;
				current = current.getNextRef();
				break;
			}
		}
		for (int i = 0; i < str.length; i++) {
			if (str[i] != null)
				newList.addElement(str[i]);
		}
		if (status) {
			System.out.println("Element is present in the list ");
		} else {
			System.out.println("Element is not present in the list ");
			newList.addElement(key);
		}

		return newList;
	}
	}