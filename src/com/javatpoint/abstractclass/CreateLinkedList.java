package com.javatpoint.abstractclass;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.SortedSet;

public class CreateLinkedList {
	
	
	public static void main(String[] args) {
     
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		Collections.sort(list);
        
		System.out.println(list);
		
		Collections.reverse(list);
		
		System.out.println(list);
	}

}
