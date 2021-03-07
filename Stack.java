package com.hsl;

import com.hsl.list.ArrayList;
import com.hsl.list.List;

public class Stack<E> extends ArrayList<E> {
	
	private List<E> list = new ArrayList<>();

	public int size() {
		return list.size();
	}
	
	public boolean isEmpty() {
		 return list.isEmpty();
	}
	
	public void push(E element) {
		list.add(element);
	}
	  
	public E pop() {
		return list.remove(list.size() - 1);
	}
	
	public E top() {
		return list.get(list.size() - 1);
	}
	
}
