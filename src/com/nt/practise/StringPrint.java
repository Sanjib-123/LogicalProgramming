package com.nt.practise;

public class StringPrint {
	static void printString(String str,char ch,int count) {
		int occ = 0,i;
		
		if(count == 0) {
			System.out.println(str);
			return;
		}
		for( i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch)
				
			occ ++;
			
			if(occ == count)
				break;
		}
		if(i < str.length() - 1)
			System.out.println(str.substring(i + 1));
		
		else
			
			System.out.println("Empty String");
	}

	public static void main(String[] args) {
		
		String str = "my name ";
		printString(str, 'b' , 2);

	}

}
