package com.nt.string;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharactersInString {

	public static void main(String[] args) {
		
		/**
		 * Easiest approach
		 * Run two for loop and pick each characters
		 * present in a string.
		 * 
		 * If it has only single occurrence then return
		 * it's index 
		 */
		
		String str = "character";
		int index = findUniqueCharacter(str);
		System.out.println(index);
		
		
		
	}
    //SIMPLE WAY
	
//        public static int findUniqueCharacter(String str) {
//        	for(int i = 0;i<str.length();i++) {
//        		int count = 1;
//        		for(int j = 0;j<str.length();j++) {
//        			if(i != j && str.charAt(i) == str.charAt(j)) {
//        				count++;
//        				break;
//        			}
//        		}
//        		if(count==1) {
//        			return i;
//        		}
//        	}
//        	return -1;
//        }
	
	
	//HASH MAP
	
	public static int findUniqueCharacter(String str) {
		Map<Character,Integer> charCountMap = new HashMap<>();
		
		/**
		 * Traverse a string and create a map of
		 * character and It's count
		 */
		
		for(int i = 0; i < str.length();i++) {
			char ch = str.charAt(i);
			
			charCountMap.put(ch, charCountMap.getOrDefault(ch, 0)+1);
			
		}
		
		
		/**
		 * Now, we know each character and it's count present
		 * in a String.
		 * 
		 * Next step is to simply traverse a string check 
		 * the character whose count is 1.
		 */
		
		for(int j = 0; j < str.length();j++) {
			char ch = str.charAt(j);
			
			int count = charCountMap.get(ch);
			
			if(count == 1) {
				return j;
			}
		}
		return -1;
	}

}
