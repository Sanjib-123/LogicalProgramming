package com.nt.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateInList {

	public static void main(String[] args) {
		
		List<String> company = new ArrayList<String>();
		
		//1. Add element to the list
		company.add("Apple");
		company.add("Microsoft");
		company.add("Google");
		company.add("Meta"); //duplicate element
		company.add("Meta"); 
		company.add("Apple");  //duplicate element
		
		//1.1 print the element original element
		System.out.println("\n1.The original elements in the list:");
		company.forEach(System.out::println);
		
		//1.2 Get all the unique element by using 
         List<String> distinctCompanies = company
        		 .stream()
        		 .distinct()
        		 .collect(Collectors.toList());
         
         //2.print all the distinct element
         System.out.println("\n2. The distinct element after removing the duplicates:");
         distinctCompanies.forEach(System.out::println);
         
         //3.Remove the duplicate company
         for(String duplicateCompany : distinctCompanies) {
        	 company.remove(duplicateCompany);
         }
         
         //3.1 Print the duplicate company
         System.out.println("\n3.The duplicate companies are");
         company.forEach(System.out::println);
		

	}

}
