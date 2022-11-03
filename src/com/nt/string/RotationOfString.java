package com.nt.string;

public class RotationOfString {

	public static void main(String[] args) {
		
		System.out.println(isRotatedVersion("abcd" , "bcda"));
		
		

	}
	public static boolean isRotatedVersion(String str1,String str2){
		boolean isRotated = false;
		
		if(str1 == null || str2==null ) {
			return false;
		}else if(str1.length() != str2.length()) {
			return false;
		}else {
			String concat = str1 + str2;
			return concat.contains(str2); //string contains the specified sequence of character
		}
		
	}

}
/***
 * Same length
 * Contains the same characters
 * Rotated around of the character
 * 
 * e:g :- abcd  - remove the string from start and concart at the end
 * bcda cdab dabc 
 */
