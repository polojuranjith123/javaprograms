package com.programs;

import java.util.Scanner;

public class CountevenAndodd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int evcount=0;
		int oddcount=0;
		while(a>0) {
			int b=a%10;
			if(b%2==0)
			evcount++;
			else
				oddcount++;
			a=a/10;
		}
		
			System.out.println("Even numbers"+evcount);
			System.out.println("odd number"+oddcount);
	}

}
