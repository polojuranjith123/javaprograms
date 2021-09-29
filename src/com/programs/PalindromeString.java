package com.programs;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String org_str=str;
		String rev="";
		char[] a=str.toCharArray();
		for(int i=a.length-1;i>=0;i--) {
			rev=rev+a[i];
		}
		System.out.println(rev);
		if(org_str.equals(rev)) {
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
			
		}
 
	}

}
