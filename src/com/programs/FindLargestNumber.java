package com.programs;

import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter First Number");
		a=sc.nextInt();
		System.out.println("Enter Second Number");
		b=sc.nextInt();
		System.out.println("Enter Third Number");
		c=sc.nextInt();
		/*if(a>b && a>c)
			System.out.println(a+ " a is large number");
		else if(b>c && b>a)
			System.out.println(b+ " b is large number");
		else 
			System.out.println(c+ " c is large number");
	*/
		int large=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(large);
		}
	

}
