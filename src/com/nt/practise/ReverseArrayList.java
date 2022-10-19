package com.nt.practise;

import java.util.ArrayList;

import java.util.Collections;



public class ReverseArrayList {

	public static void main(String[] args) {
		
		//Declaring arrayList without any initial size 
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		//appending elements at the end of the list
		al.add(9);
		al.add(145);
		al.add(878);
		al.add(343);
		al.add(5);
		al.add(6);
		al.add(7);
		System.out.println("Elements Before Traversing::");
		printElements(al);
		
		//collection.reverse method takes a list as a 
		//parameter and reverse the passed parameter
		Collections.reverse(al);
		System.out.println("\nElements after reversing :");
		printElements(al);

	}


//Iterate through all the elements and print
public static void printElements(ArrayList<Integer> al) {
	for(int i = 0; i < al.size();i++) {
		System.out.println(al.get(i)+" ");
	}

}

}
