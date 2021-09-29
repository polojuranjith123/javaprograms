package com.programs;

public class DublicateCharacterInString {

	public static void main(String[] args) {
		char c='a';
		int count=0;
		String str="ranjith mani haima";
		char[] charray=str.toCharArray();
		for(char ch:charray) {
			if(ch==c) {
				count++;
			}
		}
		System.out.println("the given character "+c+" is "+count+" times present");
	}

}
