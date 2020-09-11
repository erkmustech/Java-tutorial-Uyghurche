package day29_lab4;

import java.util.Arrays;

public class Ques_23 {

	public static void main(String[] args) {
     /*
      Write a method that accepts a number and create and prints a new array of length number, containing the 
      numbers 0,1,2,...number-1.
   
      */
		
		     int[] x= fizzArray(4);// →[0, 1, 2, 3];
		     int[] y=fizzArray(1);// →[0];
		     int[] z=fizzArray(10);// →[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		      System.out.println(Arrays.toString(x));
		      System.out.println(Arrays.toString(y));
		      System.out.println(Arrays.toString(z));
	}

	private static int[] fizzArray(int n) {
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=i;
			
			
			
		}
		return arr;
	}

}
