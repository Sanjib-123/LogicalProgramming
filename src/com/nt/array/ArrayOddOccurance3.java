package com.nt.array;

import java.util.HashMap;
import java.util.Map;

public class ArrayOddOccurance3 {

	public static void main(String[] args) {
		
		int  [] arr = {8,3,6,4,5,6,4,3,5,2,4,4,2};
		
		Map<Integer,Integer> numberCountMap = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			if(numberCountMap.containsKey(arr[i])) {
				numberCountMap.put(arr[i],numberCountMap.get(arr[i])+1);
			}else {
				numberCountMap.put(arr[i],1);
			}
		}
		for(Map.Entry<Integer,Integer> numberMap : numberCountMap.entrySet()) {
			if(numberMap.getValue() %2 !=0) {
				System.out.println(numberMap.getKey());
				break;
			}
		}
		


	}

}
