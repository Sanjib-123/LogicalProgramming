package com.nt.array;

import java.util.Scanner;

public class RotatedSortedArray {

	public static void main(String[] args) {
		/**
		 * Given array int num = [4,5,6,7,0,1,2] target = 0
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array");
		int n = sc.nextInt();
		int[]arr = new int[n];
		
		for(int i = 0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		int ans = search(arr,target);
		System.out.println(ans);
		
		}

	
	static int  search(int[] a,int target) {
		int low = 0,high = a.length - 1;
		while(low <= high) {
			int mid = (low + high) >> 1;
		if(a[low]==a[high]) return mid;
		
		//if left side is sorted
		if(a[low] <= a[mid]) {
			//find out if the element is lies on left half or not
			if(target >= a[low] && target<= a[high]) {
				high = mid - 1;
			}else {
				low = mid + 1;
			}
			//if right side is sorted
			if(target >= a[mid] && target <= a[high]) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
			
		}
		}
		return -1;
	}
	
	

}
