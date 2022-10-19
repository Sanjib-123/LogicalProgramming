package com.nt.practise;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num, i , count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		num = sc.nextInt();
		
		for(i = 2; i<num; i++) {
			if(num % i == 0) {
				count ++;
				break;
			}//if
		}//for
		if(count == 0) 
			System.out.println("Number is  a primeNumber");
		else 
			System.out.println("Number is not a primeNumber");
		
		


	}

}
/*PRIME NUMBER :-
 * ===========
 * A number that is divisible by only itself and 1; 
 * 
 * 
 * */
 