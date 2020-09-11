package day28_array_part4;

import java.util.Arrays;

public class Lab_Q6 {

	public static void main(String[] args) {
		/*
		Write a method that accepts an array and figure out which is greatest element in the array, a and 
		set all the other elements to be that value. Print the changed array.
		int[] x = {1,2,3}; = > [3,3,3]
		int[] y = {11,5,9}; = > [11,11,11]
		int[] a = {110,5,98,0,1200,11,-4}; = > [1200,1200,1200,1200,1200,1200,1200]
		 */
		int[] x = {1,2,3,34,98,0};
		System.out.println(Arrays.toString(bigElement(x)));
		
		
	}

	public static int[] bigElement(int[] arr) {
		int maxNum=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>maxNum) {
			 maxNum=arr[i];
				
				
			}
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=maxNum;
		}
		return arr;
		
		
	}
}