package com.nt.practise;

public class DuplicateCharacterInString {

	public static void main(String[] args) {
		
		String str = "How many duplicates are there in the string?";
		System.out.println(str);
		
		String characters = "";
		String duplicates = "";
		for(int i = 0;i<str.length();i++) {
			String current = Character.toString(str.charAt(i));
			if(characters.contains(current)) {
				if(!duplicates.contains(current)) 
					duplicates += current + " ";
				
				
			}
			characters += current;
		}
		System.out.println(duplicates);

	}

}
