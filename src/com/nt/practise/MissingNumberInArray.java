package com.nt.practise;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		/**
		 * Given array of n -1 integer and these integer are in the range of 1 to n.
		 * One of the integer is missing from an array .So we have to write a code to 
		 * find the missing number .There is no duplicate in the array.
		 */
		int[] arr = {1,3,4,6,7,5,8,9,10};
		int n = arr.length + 1;
		
		int sum = (n *(n+1))/2;
		for(int i = 0;i < arr.length;i++) {
			sum = sum - arr[i];
		}
		System.out.println("Missing number is:"+sum);
		


	}

}
