package com.programs;

public class ReverseStringSpace {

	static void  reverseStringSpace(String inputString) {
		char[] chArray=inputString.toCharArray();
		int length=chArray.length;
		char[] revArray=new char[length];
		for(int i=0;i<length;i++) {
			if(chArray[i]==' ')
				revArray[i]=' ';		
		}
		int j=revArray.length;
		for(int i=0;i<length;i++) {
			if(chArray[i]!=' ') {
				if(revArray[j]==' ') {
					j--;
				}
				revArray[j]=chArray[i];
				j--;
			}
			
		}
		System.out.println(String.valueOf(revArray));
	}
	public static void main(String[] args) {
		
		reverseStringSpace("i am ranjith chary");
	}

}
