package com.programs;

public class A {
	
	static void input(String inString) {
		
		String[] str1=inString.split("@");
		String[] str2=str1[1].split(".");
		System.out.println(str1[0]+" "+str2[0]);
		
	}

	public static void main(String[] args) {
		input("ranjith@gmail.com");
		
	}

}
