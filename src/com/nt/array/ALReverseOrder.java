package com.nt.array;

import java.util.ArrayList;
import java.util.Collections;

public class ALReverseOrder {

	public static void main(String[] args) {
		
		//Gety the arrayList
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		//add elements to the al
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(14);
		
		//print the elements before sorting 
		System.out.println("AL before Sorting :"+al);
		
		//sorting using al.sort()
		//by passing Collections.reverseOrder() as comparator
		Collections.sort(al,Collections.reverseOrder());
		
		//print the sorted ArrayList
		System.out.println("After sorting the element "+al);

	}

}
