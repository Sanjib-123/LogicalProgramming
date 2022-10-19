package com.nt.practise;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		String str = "beautiful beach";
		char[] carry = str.toCharArray();
		System.out.println("The String is :"+str);
		System.out.println("Duplicate characters of above string are:");
		for(int i = 0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(carry[i] == carry[j]) {
					System.out.println(carry[j]+" ");
					break;
				}
		}

	}

}
}
