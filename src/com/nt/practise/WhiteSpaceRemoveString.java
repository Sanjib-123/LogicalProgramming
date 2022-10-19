package com.nt.practise;

public class WhiteSpaceRemoveString {

	public static void main(String[] args) {
		String str = "      Geen       fro  Geen";
		
		//call rplaceAll() METHOD
		str = str.replaceAll("\\s", "");
		
		System.out.println(str);
	

	}

}
