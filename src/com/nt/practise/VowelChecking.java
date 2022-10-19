package com.nt.practise;

import java.io.IOException;

public class VowelChecking {

	public static void main(String[] args)throws IOException {
		
		String str = "SANJIBKUMARGIRI";
		str = str.toLowerCase();
		int count = 0;
		
		for(int i = 0;i < str.length();i++) {
			//check for vowel
			if(str.charAt(i)=='a' || str.charAt(i)== 'e'|| str.charAt(i) == 'i' ||
					str.charAt(i)=='o' || str.charAt(i)=='u' ) {
				count ++;
				
			}//if
		}//for
		//Display the total number of vowel
		System.out.println("Total number of vowles in string are : "+count);
		


	}

}
