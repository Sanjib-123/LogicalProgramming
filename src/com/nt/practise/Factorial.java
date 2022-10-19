package com.nt.practise;

import java.util.Scanner;

public class Factorial {
	int factorial(int n) {
		
		return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		Factorial obj = new Factorial();
		//int num = 4;
		System.out.println("Factorial of "+ num + " is " + obj.factorial(num));

	}

}
