package com.programs;

import java.util.Scanner;

public class TotalOftheNumbers {

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int store=0;
		int b;
		while(a>0) {
			b=a%10;
			store=store+b;
			a=a/10;
		}

		System.out.println(store);
	}

}
