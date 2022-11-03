package com.nt.array;

import java.util.Iterator;

public class SecondHighestNumberInArray {

	public static void main(String[] args) {
		int arr[] = {10,100,200,250,300,350,400};
		int largest = 0;
		int secondLargest = 0;
		
		System.out.print("The given array is :");
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			else if(arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("The second largest number is:"+secondLargest);
		System.out.println("The largest number is :"+largest);

	}

}
