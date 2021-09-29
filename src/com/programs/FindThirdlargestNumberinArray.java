package com.programs;

public class FindThirdlargestNumberinArray {

	public static void main(String[] args) {
		int[] arr= {12,3,4};
		int n=arr.length;
		print3largest(arr,n);
		
	}
	public static void print3largest(int[] arr,int arr_size) {
		int i,first,second,third;
		if(arr_size<3) {
			System.out.println("Invalid input given");
			return;
		}
		third=second=first=0;
		for(i=0;i<arr_size;i++) {
			if(arr[i]>first) { 
				third=second;
				second=first;
				first=arr[i];
			}
			else if(arr[i]>second) {
				third=second;
				second=arr[i];
			}
			else if(arr[i]>third)
				third=arr[i];
			
		}
		System.out.println("three largest elements are " +first +" "+second+" "+third);
	}

}
