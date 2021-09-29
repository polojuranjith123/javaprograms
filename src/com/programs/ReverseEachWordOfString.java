package com.programs;

public class ReverseEachWordOfString {
	
	static void reverseEachwordOfString(String inputString) {
		String[] strArray=inputString.split(" ");
		String revString="";
		
		for(String str:strArray) {
			String revWord="";
			for(int i=str.length()-1;i>=0;i--) {
				revWord=revWord+str.charAt(i);
			}
			revString=revString+revWord+" ";
		}
		
		System.out.println(revString);
	}

	public static void main(String[] args) {
		
		reverseEachwordOfString("ranjith mani haima");
	}

}
