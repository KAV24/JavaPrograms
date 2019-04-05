package com.bridgelabz.util;

public class NodeUnordered<T> implements Comparable<T> {
	     
	    
		private T value;
	    private NodeUnordered<T> nextRef;
		public String key; 
		
	    public T getValue() {
	        return value;
	    }
	    public void setValue(T key2) {
	         this.value = key2;
	    }
	    public NodeUnordered<T> getNextRef() {
	        return nextRef;
	    }
	    public void setNextRef(NodeUnordered<T> ref) {
	        this.nextRef = ref;
	    }
	    public NodeUnordered<T> getSize()
	    { 
	    	return this.getSize();
	    }
	    public void setSize(NodeUnordered<T> size) {
	        this.nextRef = size;
	    }
		@Override
		public int compareTo(T o) {
			// TODO Auto-generated method stub
			return 0;
		}
		public NodeUnordered()
		{
			
		}
		
		public NodeUnordered(T data, NodeUnordered<T> next)
		{
			this.value=data;
			this.nextRef=next;
		}
		
	    
}
