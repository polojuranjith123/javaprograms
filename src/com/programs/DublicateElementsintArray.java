 package com.programs;

import java.util.HashSet;

public class DublicateElementsintArray {

	public static void main(String[] args) {
		
		String[] ar= {"java","c++","python","ranjith","jav"};
		boolean flag=false;
  	/*	for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j])
					System.out.println("Found Dublicate Element" +ar[i]);
					flag=true; 
				
			}
		}
		if(flag==false) {
			System.out.println("Dublicate element found");
		}*/

		HashSet<String> langs=new HashSet<String>();
		for(String l:ar) {
			if(langs.add(l)==false)
			{
				System.out.println("found dublicates" +l);
				flag=true;
			}
			
		}
		if(flag==false)
			System.out.println("not found dublicates");
		
	}

}
