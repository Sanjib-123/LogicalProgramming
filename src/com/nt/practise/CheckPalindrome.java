package com.nt.practise;

public class CheckPalindrome {
	
	public static void main(String[] args) {
		
		String s = "arora";
		String rev = " ";
		for(int i = s.length()-1;i >=0; --i)
			rev = rev + s.charAt(i);
		
		if(s.toLowerCase().equals(s.toLowerCase()))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
		
}
}
