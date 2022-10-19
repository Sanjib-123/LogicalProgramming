package com.nt.practise;

public class PermutationsOfString {

	public static void main(String[] args) {
		
		permutation("123");

	}
	public static void permutation(String str) {
		permutation("",str);
	}
	private static void permutation(String str1,String str2) {
		if(str2.isEmpty()) {
			System.out.println(str1 + str2);
		}
		else {
			for(int i = 0;i<str2.length();i++) {
				permutation(str1+str2.charAt(i),
						str2.substring(0,i) + str2.substring(i+1,str2.length()));
			}
		}
	}

}
