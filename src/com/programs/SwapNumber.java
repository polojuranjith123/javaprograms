package com.programs;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter numbers");
		int first=sc.nextInt();
		int second=sc.nextInt();
		first=first+second;
		second=first-second;
		first=first-second;
		System.out.println("After Swap");
		System.out.println(first+"  "+second);
		
	}

}
