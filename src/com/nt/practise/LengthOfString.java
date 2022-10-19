package com.nt.practise;

import java.util.Scanner;

public class LengthOfString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.println("Enter String ");
		str = sc.nextLine();
		
		int i = 0;
		for(char c: str.toCharArray()) {
			System.out.println(c);
			i++;
		}
		System.out.println("\n Length"+i);

	}

}
