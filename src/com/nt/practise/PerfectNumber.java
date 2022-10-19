package com.nt.practise;

import java.util.Scanner;

public class PerfectNumber {
	//return true if n is perfect
	static boolean isPerfect(int n) {
		
		//1 is not a perfect number 
		if(n == 1)
			return false;
		//sum will store the sum of proper divisors
		//as 1 one is proper divisor of all number so  initialize sum with 1
		
		 int sum = 1;
		 
		 //looping through the number if they are divisor or not
		 for(int i = 2;i < n; i++) {
			 if(n % i == 0)
				 sum += i;
		 }
		 //if sum of divisor is equals to n then n is a perfect number
		 if(sum == n)
			 return true;
			 
			
		
		return false;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		
		if(isPerfect(n))
			System.out.println(n + " The number is a perfect number ");
		else 
			System.out.println(n + "The number is not a perfect number");
		

	}

}
/*
 * PERFECT NUMBER :-
 * ==============
 * A number is said to be a perfect number if its sum of perfect divisors (excluding the number 
 * itself ) gives the same number .
 * 
 * EG :-
 * ==
 * 9 - Proper divisor of 9 are 1 and 3 
 * SUM = 1 + 3 != 9
 * 
 * SO, 9 is not a perfect number
 * 
 * 6 - Proper divisor of 6 are 1, 2 and 3
 * SUM = 1 + 2 + 3 = 6
 * 
 * so, 6 is a perfect number.
 * 
 * 
 * */
 