package com.programs;

public class ReverseString {

	public static void main(String[] args) {
		String str="ranjith";
		String rev="";
		/*for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}*/
		char[] a=str.toCharArray();
		for(int i=a.length-1;i>=0;i--) {
			rev =rev+a[i];
		}
		System.out.println(rev);
	}

}
