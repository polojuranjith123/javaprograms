package com.programs;

public class NumOfDigit {

	public static void main(String[] args) {
		
		int number=1234235,count=0;
		while(number>0) {
			number=number/10;
			count++;
		}
		System.out.println("Numbers present in Number : "+count);
	}

}
