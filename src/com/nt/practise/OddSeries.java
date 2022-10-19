package com.nt.practise;

import java.util.HashMap;

public class OddSeries {
	static int getOddSeries(int arr[],int n) {
		HashMap<Integer, Integer> hmap = new HashMap<>();
		
		//putting all elements into the HashMap
		for(int i = 0;i < n; i++) {
			if(hmap.containsKey(arr[i])) {
				int val = hmap.get(arr[i]);
				
				//if array element already present then 
				//increase the count of the element 
				hmap.put(arr[i], val + 1);
			}
			else
				//if array element is not present then put
				//element into the Hashmap and initialize
				//the count to one
				hmap.put(arr[i], 1);
		}
		//checking for odd occurance of each element present
		//in hash map
		for(Integer a : hmap.keySet()) {
			if(hmap.get(a) % 2 != 0)
				return a;
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = new int[] { 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
        int n = arr.length;
        System.out.println(getOddSeries(arr, n));
	}
}


