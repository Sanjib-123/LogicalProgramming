package com.nt.string;

public class Anagram {

	public static void main(String[] args) {
		
		//boolean isAnagram = isAnagram("Anglee","Anglee");
		boolean isAnagram = isAnagram("aab","abb");
		System.out.println("Are Anglee and anglee are anagrams :"+isAnagram);
		

	}
	public static boolean isAnagram(String str1,String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		int count[] = new int[256];
		for(int i = 0;i < str1.length();i++) {
			count[str1.charAt(i)]++;
			count[str2.charAt(i)]--;
		}
		for(int i = 0;i < 256 ;i++) {
			if(count[i] != 0) {
				return false;
			}
		}
		return true;
		
	}

}

/**
 * two  string is  called an anagram if the characters present in the string are same like number of
 * characters and the repetition of characters should be same.
 * 
 * like aab , aba
 */
