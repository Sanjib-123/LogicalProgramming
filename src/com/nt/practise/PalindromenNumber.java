package com.nt.practise;

public class PalindromenNumber {

	public static void main(String[] args) {
		
		int num = 3553,rev = 0,re;
		
		//store the no to original no.
		int original = num;
		
		while(num!=0) {
			re = num % 10;
			rev = rev * 10 + re;
			num /= 10;
		}
		if(original == rev) {
			System.out.println(original+ "is palindrome");
		}
		else {
			System.out.println(original+"is not a palindrome");
		}

	}

}
/*PALINDROME NUMBER :-
 * ================
 * A number is said to be palindrome if the reverse of the number is same as the original number.
 * 
 * eg:- 3553 after reverse the number will be same .
 * 
 * 
 * The above method will work upto (10)18 power 18 if more than that it will not work
 * 
 * */
