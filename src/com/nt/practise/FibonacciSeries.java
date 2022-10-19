package com.nt.practise;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		
		//consider first two number as 0 and 1
		int num1 = 0,num2 = 1,num3 ,count = 10; //count 10 is bcz of first only first 10 fibonacci number will be displayed
		
		System.out.print(num1+" "+num2); //it will print o and 1 
		for (int i = 2; i < count; i++) {
			 
			//here we are looping from 2 bcz we have already print 0 and 1
			
			num3 = num1 + num2;
			System.out.print(" "+num3);
			num1 = num2;
			num2 = num3;
			
		}
	}

}

