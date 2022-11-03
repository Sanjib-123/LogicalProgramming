package com.nt.string;

import java.util.Scanner;

public class ReverseStringStringBuilder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String you want to reverse");
		String str1 = sc.next();
		StringBuilder str = new StringBuilder();
		str.append(str1);
		str = str.reverse();
		System.out.println("After reverse the output is :"+str);

	}

}
