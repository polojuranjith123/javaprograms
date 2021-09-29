package com.programs;

public class ReverseStringWithSpaces {
	
	static void reverseString(String inputString) {
		
		String[] strArray=inputString.split(" ");
		String revString="";
		for(int i=strArray.length-1;i>=0;i--) {
			String word=strArray[i];
			
			String revword="";
			for(int j=word.length()-1;j>=0;j--) {
				revword=revword+word.charAt(j);
			}
			revString=revString+revword+" ";
		 
		}
		System.out.println(revString);
	}

	public static void main(String[] args) {
		reverseString("i am not ranjit");
		
	}

}
