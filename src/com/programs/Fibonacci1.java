package com.programs;

public class Fibonacci1 {

	public static void main(String[] args) {
		int first=0, second=1,number=10,next;
		System.out.println("Fibonacci Series is ");
		for(int i=1;i<=number;i++) {
			System.out.println(first);
			next=first+second;
			first=second;
			second=next;
		}

	}

}
