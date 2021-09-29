package com.programs;

public class ArrayEquality {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5};
		int[] b= {1,2,3,4,5,6};
		
		boolean status =true;
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i])
					status=false;	
			}
		}
		else 
			status=false;

		if(status==true)
			System.out.println("arrays are equal");
		else
			System.out.println("arrays are not equal");
	}

}
