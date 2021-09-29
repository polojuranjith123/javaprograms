package com.programs;

public class ThirdHighestElement {

	public static void main(String[] args) {
		
		
		int[] array = {12,23};
		thirdElement(array);
	}
	
		
		 static void thirdElement(int[] ar) {
			int n=ar.length;
			int fi,se,th;
			fi=se=th=0;
			
			if(n<3) {
				System.out.println("Invalid array");
				return;
			}
			for(int i=0;i<n;i++ ) {
				if(ar[i]>fi) {
					th=se;
					se=fi;
					fi=ar[i];}
					else if(ar[i]>se) {
						th=se;
						se=ar[i];
							
					}
					else if (ar[i]>th)
						th=ar[i];
					
				}
			System.out.println(th);
		
	}

}
