package com.nt.string;

public class PalindromeString {

	public static void main(String[] args) {
		String myString = "ajaj";  //declare a String 
		
		StringBuffer buffer = new StringBuffer(); 
		buffer.append(myString);
		String data = buffer.toString();
		if(myString.equals(data)) {
			System.out.println("The given String is a palindrome String");
		}
		else {
			System.out.println("The given String is not a palindrome String");
		}

	}

}
