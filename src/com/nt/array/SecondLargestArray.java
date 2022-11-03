package com.nt.array;

import java.util.Arrays;

public class SecondLargestArray  {

	public static void main(String[] args) {
		/**
		 * Find the second largest number in a array
		 * 
		 * sort the array and pick the number at n - 2 index
		 * time complex city of the approach is O(nlogn)
		 *   But the below method fails if we repeat the array
		 */
		
		int [] arr = {1, 5, 8,55, 9, -1, 55};
		
		int n = arr.length;
		//Arrays.sort(arr);
		
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		//Traverse an array
		for(int i = 0;i<n;i++) {
			if(arr[i] > highest) {
				  secondHighest = highest;
				  highest = arr[i];
			}
			if(arr[i] < highest && arr[i] > secondHighest) {
				secondHighest = arr[i];
			}
		}
		System.out.println("The second highest number is ::"+secondHighest);
		

	}

}
