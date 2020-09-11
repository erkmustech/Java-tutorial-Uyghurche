package day29_lab4;

public class Ques_24 {

	public static void main(String[] args) {
		/*
		 A value is "everywhere" in an array if for every pair of adjacent elements in the array, 
		 at least one of the pair is that value.
		Write a method that accepts an array and a number, and prints true if the given number is everywhere 
		in the array.
		
		 */
		
		int[] x = {1, 2, 1, 3};// int a = 2;  Output: false
		int[] y = {1, 2, 2, 1, 3};// int a = 1; Output: true
		
		System.out.println(everyWhere(x,1));
		System.out.println(everyWhere(y,2));
		
	}
	
	public static boolean everyWhere(int[] arr, int n) {
		boolean flag = false;
		for(int i=0;i<arr.length-2;i++) {
			if(arr[i]==n && arr[i+2]==n) {
				flag=true;
				break;
			}else {
			    flag=false;
			}
		}
		return flag;
		
	}

}
