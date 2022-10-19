package com.nt.practise;

import java.util.Arrays;

public class TripletSum {

	public static void main(String[] args) {
		int[] arr = {1, 4, 45, 6, 10, 8};
		int sum = 13;
		//boolean result = findTripletWithBruteForce(arr , sum);
		boolean result = findTriplet(arr , sum);
		 
		if(result) {
			System.out.println("Exists");
			
		}else{
			System.out.println("Not exists");
		}
		

	}
//	public static boolean findTripletWithBruteForce(int[] arr,int sum) {
//		
//		if(arr.length < 3) {
//			return false;
//		}
//		int len = arr.length;
//		for(int i = 0;i < len - 2; i++) {
//			for(int j = i + 1;j<len - 1;j++) {
//				for(int k = j + 1; k<len;k++) {
//					if(arr[i] + arr[j] + arr[k] == sum) {
//						return true;
//					}
//				}
//			}
//		}
//		return false;
//	}
	
	//THE BETTER CODE IS
	public static boolean findTriplet(int[] arr, int sum) {
		if(arr.length < 3) {
			return false;
		}
		Arrays.sort(arr);
		int len = arr.length;
		
		for(int i = 0;i < len; i++) {
			int start = i + 1;
			int end = len - 1;
			
			while(start < end) {
				if(arr[i] + arr[start] + arr[end] == sum) {
					return true;
				}
				else if(arr[i] + arr[start] + arr[end] < sum) {
					start++;
				}
				else {
					end--;
				}
			}
		}
		return false;
	}
	

}
//here time complexcity is O(nlogn) + O(n*n) = O(n*n)

/* Triplet sum :=
 * arr = {2,4,5,1,34} k = 13
 * Output: true (2,4,5,1)
 * 
 * 1 ,4 , 45, 6 ,10,8
 * i starts from here len - 2
 *    j starts from here
 *         k starts from here
 *         
 *         time complexcity = o(n3)
 * 
 * */
 