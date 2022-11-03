package com.nt.array;

import java.util.Arrays;

public class SortingArrays {

	public static void main(String[] args) {
		
		int[] arr = {13 , 7 , 6, 45, 21, 9, 101, 102};
		
		System.out.println("The original array is :");
		for(int num : arr) {
			System.out.println(num + " ");
		}
		Arrays.sort(arr);
		System.out.println("\nThe sorted array is :");
		for(int num : arr) {
			System.out.println(num + " ");
		}
		
//		//apply sort method()
//		Arrays.sort(arr);
//		
//		System.out.println("Modified arr[]:"+Arrays.toString(arr));

	}

}
