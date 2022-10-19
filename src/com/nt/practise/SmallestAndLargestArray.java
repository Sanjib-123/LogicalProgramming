package com.nt.practise;

public class SmallestAndLargestArray {
	/**
	 * 
	 * @param args
	 * 
	 * arr[] ={1 , 2 , 3, 67,76}
	 * First method is to sort the array after sorting the first index value will
	 * be smallest and the (n - 1)th index will be the largest element
	 * 
	 * Time complexcity will be O(nlogn)
	 * 
	 * 
	 * method - 2
	 * take two variable max[] and min[] assign both value to 0th index 
	 * and then compare 
	 * 
	 * Time complexcity will br O(n)
	 */

	public static void main(String[] args) {
		
		int arr[] = {33 , 65 , 3, 67,76};
		
		int min = arr[0];
		int max = arr[0];
		for(int i = 0; i<arr.length;i++) {
			System.out.println("Before sorting the value is ::"+arr[i]);
			
			if(arr[i] < min) {
				min = arr[i];
			}
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(min+" "+max);
		
		

	}

}

 
