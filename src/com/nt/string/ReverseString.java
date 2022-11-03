package com.nt.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Sanjib kumar Giri";
		char[] c = s.toCharArray();
		List<Character> li = new ArrayList<>();
		
		for(char c1: c)
			li.add(c1);
		
		Collections.reverse(li);
		ListIterator li1 = li.listIterator();
		while(li1.hasNext()) {
			System.out.println(li1.next());
		}

	}

}
/*Convert the input string into the character array by using
 *  toCharArray() built in method. Then, add the characters 
 *  of the array into the ArrayList object. Java also has built
 *   in reverse() method for the Collections class. Since
 *    Collections class reverse() method takes a list object,
 *     to reverse the list, we will pass the ArrayList object which
 *      is a type of list of characters.
 * 
 *   String input = "GeeksForGeeks";
  
        // convert String to character array
        // by using toCharArray
        char[] try1 = input.toCharArray();
  
        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);
 * */
